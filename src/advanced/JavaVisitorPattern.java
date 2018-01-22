package advanced;
/**
 * https://www.hackerrank.com/challenges/java-vistor-pattern/copy-from/63841054
 */
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int result = 0;
    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {

    }

    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int M = 1000000007;

    public int getResult() {
        return (int) result;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            result = (result * node.getValue()) % M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            result = (result * leaf.getValue()) % M;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int evenDepthNodes = 0;
    private int greenLeafs = 0;

    public int getResult() {

        return Math.abs(evenDepthNodes-greenLeafs);
    }

    public void visitNode(TreeNode node) {
        if(node.getDepth()%2 == 0) evenDepthNodes += node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor()==Color.GREEN)greenLeafs+= leaf.getValue();
    }
}
public class JavaVisitorPattern {

    private static int[] nodeValues;
    private static Color[] colors;
    private static HashMap<Integer, HashSet<Integer>> map;
    public static Tree solve() {
        Scanner sc = new Scanner(System.in);
        int numberOfNodes = sc.nextInt();

        nodeValues = new int[numberOfNodes];
        colors = new Color[numberOfNodes];
        map = new HashMap<>(numberOfNodes);

        for (int i = 0; i < numberOfNodes; i++) {
            nodeValues[i] = sc.nextInt();
        }
        for (int i = 0; i < numberOfNodes; i++) {
            if (sc.nextInt() == 0) colors[i] = Color.RED;
            else colors[i] = Color.GREEN;
        }

        for (int i = 0; i < numberOfNodes - 1; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            HashSet<Integer> leftLinks = map.get(left);
            if (leftLinks == null) {
                leftLinks = new HashSet<>();
                map.put(left, leftLinks);
            }
            leftLinks.add(right);

            HashSet<Integer> rightLinks = map.get(right);
            if (rightLinks == null) {
                rightLinks = new HashSet<>();
                map.put(right, rightLinks);
            }
            rightLinks.add(left);
        }
        sc.close();

        if (numberOfNodes == 1) return new TreeLeaf(nodeValues[0], colors[0], 0);

        TreeNode root = new TreeNode(nodeValues[0], colors[0], 0);
        treeBuilder(root, 1);
        return root;
    }

    private static void treeBuilder(TreeNode parent, Integer parentNumber) {

        for (Integer currentChild : map.get(parentNumber)) {
            map.get(currentChild).remove(parentNumber);

            HashSet<Integer> currentChildsChild = map.get(currentChild);
            boolean currentChildIsNode = currentChildsChild != null && !currentChildsChild.isEmpty();

            Tree tree;

            if (currentChildIsNode) {
                tree = new TreeNode(nodeValues[currentChild - 1],
                        colors[currentChild - 1], parent.getDepth() + 1);
            } else {
                tree = new TreeLeaf(nodeValues[currentChild - 1],
                        colors[currentChild - 1], parent.getDepth() + 1);
            }
            parent.addChild(tree);

            if (tree instanceof TreeNode) {
                treeBuilder((TreeNode) tree, currentChild);
            }
        }
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

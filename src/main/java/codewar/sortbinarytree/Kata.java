package codewar.sortbinarytree;

import java.util.*;

public class Kata {

    static Map<Integer, List<Node>> levelNodes = new HashMap<>();

    public static List<Integer> treeByLevels(Node node) {
    List<Integer> nodeValue = new ArrayList<>();
        Integer level = 0;
        nodeValue.clear();
        if (node == null) {
            return nodeValue;
        } else {
            levelNodes.put(level, new ArrayList<>(Collections.singletonList(node)));
            valueGather(node, level);
        }

        levelNodes.forEach((integer, nodes) -> {
            for (Node n : nodes) {
                if (n != null) {
                    nodeValue.add(n.value);
                }
            }

        });
        return nodeValue;
    }

    public static void valueGather(Node node, Integer l) {
        l++;
        if (node == null) {
            return;
        } else {

            if (levelNodes.containsKey(l)) {
                List<Node> nodeList = levelNodes.get(l);
                nodeList.add(node.left);
                nodeList.add(node.right);
                levelNodes.put(l, nodeList);
            } else {
                levelNodes.put(l, new ArrayList<>(Arrays.asList(node.left, node.right)));
            }
            valueGather(node.left, l);
            valueGather(node.right, l);

        }
    }

    public static void main(String[] args) {

        Node node =
                new Node(new Node(
                        new Node(
                                new Node(null, null, 8),
                                new Node(null, null, 9),
                                4),
                        new Node(
                                new Node(null, null, 10),
                                new Node(null,
                                        new Node(null,
                                                new Node(null, new Node(new Node(null, null, 21), null, 20), 19),
                                                17),
                                        12),
                                5),
                        2),
                new Node(new Node(
                                new Node(null, null, 13),
                                new Node(null, null, 14),
                                6),
                        new Node(
                                new Node(null, null, 15),
                                new Node(null,
                                        new Node(null, null, 18),
                                        16),
                                7),
                        3),
                1);

        treeByLevels(node).forEach(System.out::println);

    }
}

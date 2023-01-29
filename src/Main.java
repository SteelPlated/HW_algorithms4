public class Main {
    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<>();

        tree.add(5);
        tree.add(3);
        tree.add(2);
        tree.add(1);
        tree.add(8);
        tree.add(12);
        tree.add(4);
        tree.dfs(it -> System.out.print(it + " "));
        System.out.println();
        tree.bfs(it -> System.out.print(it + " "));
        System.out.println();
        System.out.println(tree.contains(9));
    }
}
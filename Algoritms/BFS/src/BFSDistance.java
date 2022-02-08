import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BFSDistance {
    static class Node {
        int value;
        public Node(int value) {
            this.value = value;
        }
        int getValue() {
            return this.value;
        }
        List<Node> neighbours = new ArrayList<>();
        void addNeighbour(Node node) {
            this.neighbours.add(node);
        }
        List<Node> getNeighbours() {
            return this.neighbours;
        }
        void setNeighbours(List<Node> neighbours) {
            this.neighbours = neighbours;
        }
    }
    static List<Integer> dist(List<Node> nodes, Node start) {
        return null;
    }
}


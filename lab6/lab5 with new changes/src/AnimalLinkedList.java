import animal.Animal;

public class AnimalLinkedList {
    private Node newNode;

    public AnimalLinkedList(Node newNode) {
        this.newNode = newNode;
    }

    private class Node {
        Animal element;
        Node next;
        Node prev;


        Node(Animal element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }


    }

    private int size;
    private Node header;

    public AnimalLinkedList() {
        header = new Node(null, null, null);
        header.next = header;
        header.prev = header;
        size = 0;
    }

    private void add(Animal animal, Node node) {        Node newNode = new Node(animal, node, node.prev);
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
        size++;
    }

    public void add(Animal animal) {
        add(animal, header);
    }

    public void addAll(AnimalArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            add(arrayList.get(i));
        }
    }

    /*private Node findNodeByIndex(int index) throws IndexOutOfBoundsException {
        if (index == 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node n = header;
        if (index <= size) {
            for (int i = index; i < size; i++) {
                n = n.next;
            }
        }
        if (index >= size) {
            for (int i = size; i > index; i--) {
                n = n.prev;
            }
        }
        return n;
    }*/
    private Node findNodeByIndex(int index) {
        if (index == 0) {
            return header;
        }
        Node node = header.next;
        int i = 1;
        while (i < index) {
            node = node.next;
            ++i;
        }
        return node;
    }

    public Animal get(int index) {
        Node node = findNodeByIndex(index);
        return node.element;
    }

    public void set(int index, Animal element) {
        Node node = findNodeByIndex(index - 1);
        node.next.prev = newNode;
        node.next = newNode;
        newNode.prev = node;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public class Interface {
        public interface AnimalList {
            int size();

            boolean add(Animal animal);

            Animal get(int index);

            void set(int index, Animal element);

            void clear();
        }
    }
}

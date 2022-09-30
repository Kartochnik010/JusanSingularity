public class Main {

    public static void main(String[] args) {
        Node node = new Node(1);
        node = addLast(node, 3);
        node = addLast(node, 5);


        node = removeElem(node, 5);

        for (Node tmp = node; tmp != null; tmp = tmp.next) {
            System.out.println(tmp.data);
        }
    }

    public static Node removeElem(Node node, int data) {
        try{
            Node start = node;
            Node prev = node;
            while(node.data != data){
                prev = node;
                node = node.next;
                System.out.println("prev:" + prev.data);
                System.out.println("current:" + node.data);
            }
            prev.next = node.next;
            if (node.data==start.data){
                start = start.next;
            }
            return start;
        } catch (NullPointerException e){
            return node;
        }

    }
    public static Node addLast(Node node, int newData) {
        if(node==null){
            return new Node(newData);
        }
        Node temp = node;
        while(node.next != null){
            node = node.next;
        }
        node.next = new Node(newData);
        return temp;
    }
    public static int indexOf(Node node, int data) {
        if(node==null){return -1;}
        int i =0;
        Node tmp = node;
        while (tmp != null){
            if(tmp.data == data){
                return i;
            }
            i++;
            tmp = tmp.next;
        }
        return -1;
    }
    public static int getLast(Node node) {
        if(node == null) return -1;
        while(node.next != null){
            node = node.next;
        }

        return node.data;
    }
    public static int size(Node node) {
        if(node == null) return 0;
        int size = 0;
        while(node.next != null){
            node = node.next;
            size++;
        }

        return size+1;
    }
    public static Node addFirst(Node node, int newData) {
        Node newNode = new Node(newData);
        newNode.next = node;
        return newNode;
    }
    public static int getByIndex(Node node, int index) {
        if(node==null){return -1;}
        int i =0;
        Node tmp = node;

        while (tmp != null){
            if(i == index){
                return tmp.data;
            }
            i++;
            tmp = tmp.next;
        }
        return -1;
    }








}
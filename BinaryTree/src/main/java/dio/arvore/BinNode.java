package dio.arvore;

public class BinNode <T extends Comparable <T>> {

    private T data;
    private BinNode<T> leftNode;
    private BinNode<T> rightNode;

    public BinNode(){

    }

    public BinNode(T data) {
        this.data = data;
        this.leftNode = this.rightNode = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BinNode{" +
                "data=" + data +
                '}';
    }
}

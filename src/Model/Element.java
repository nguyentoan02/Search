
package Model;

public class Element {

    private int[] array;
    private int size;

    public Element(int[] array, int size) {
        this.array = array;
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

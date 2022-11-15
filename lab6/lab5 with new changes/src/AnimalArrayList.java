import animal.Animal;
import java.util.Arrays;
public class AnimalArrayList {
    private Animal[] arraylist;
    private int size;
    public AnimalArrayList(int initSize) {
        arraylist = new Animal[initSize];
    }
    public AnimalArrayList(){
        arraylist = new Animal[10];
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    private void copyElementsFrom(Animal[] oldElements) {
        for (int i = 0; i < oldElements.length; i++ ){
            arraylist[i] = oldElements[i];
        }
    }
    private void checkSize(int needCapacity) {
        if (needCapacity > arraylist.length * 0.7) {
            Animal[] oldElements = arraylist;
            int newSize = size * 2;
            arraylist = new Animal[newSize];
            size = newSize;
            copyElementsFrom(oldElements);
        }
    }
    public boolean add(Animal element) {
        checkSize(size + 1);
        arraylist[size++] = element;
        return true;
    }
    private boolean checkRange(int index) {
        if (index >= 0 && index < size + 1) {
            return true;
        } else {
            System.out.println("не верно : " + index);
            return false;
        }
    }

    public void set(int index, Animal element) {
        if (checkRange(index)) {
            arraylist[index] = element;
        }

    }

    public Animal get(int index) {
        return arraylist[index];
    }

    public void clear() {
        for(int i = 0; i < size; ++i) {
            arraylist[i] = null;
        }
        size = 0;
    }

    public String toString() {
        String var10000 = Arrays.toString(arraylist);
        return "elements=" + var10000 + ", size=" + size + "}";
    }
    public int indexOf(Animal animal){
        for(int i = 0; i < arraylist.length ; i++){
            if(animal.equals(arraylist[i])){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(Animal animal){
        int index = indexOf(animal);
        if(index == -1){
            return false;
        }
        return true;
    }
    public void remove(Integer index){
        for(int i = 0; i < arraylist.length; i++){
            arraylist[i + 1] = arraylist[i];
        }
        arraylist[size] = null;
        size = -1;
    }
    public Animal[] toArray(){
        Animal[] copy = arraylist.clone();
        return copy;
    }
}

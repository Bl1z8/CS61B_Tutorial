public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (this.rest == null)
            return 1;
        else
            return rest.size()+1;
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        int size = 1;
        while (rest !=null)
        {
            rest = rest.rest;
            size ++;
        }
        return size;
    }

    /** Returns the ith value in this list.*/
    public int getFirst(int i) {
        /** Return the method with using recursion **/
        if (i == 1)
            return first;
        else
            return rest.getFirst(--i);
    }

    public int getSecond(int i){
        /** Return the value with no recursion **/
        int value = this.first;
        while (i != 1)
        {
            value = rest.first;
            rest = rest.rest;
            i--;
        }
        return value;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.getFirst(3));
    }
}
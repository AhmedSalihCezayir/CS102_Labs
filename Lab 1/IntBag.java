/**
 * IntBag class which is similar to an int[] except IntBag has a valid value
 *
 * @author Ahmed Salih Cezayir
 * @version 18.02.2020
 */
public class IntBag {
    // properties
    private int[] bag;
    private int valid;

    // constructors
    public IntBag() {
        bag = new int[100];
        valid = 0;
    }

    public IntBag(int size) {
        bag = new int[size];
        valid = 0;
    }

    // methods
    //add------------------------------------------------
    public void add(int value) {
        bag[valid] = value;
        valid++;
    }

    public void add(int value, int i) {
        //to check whether i is suitable
        if (i > bag.length) {
            System.out.println("Index is out of collection boundaries\n");
        }
        //to check whether bag is full or not
        else if (valid == bag.length) {
            System.out.println("Your bag is full!!");
            System.out.println("Please delete one number in order to add any other numbers\n");
        } else {
            int[] tmp;
            tmp = new int[bag.length];
            //first add the numbers which are before the i to int[] tmp
            for (int k = 0; k < i; k++) {
                tmp[k] = bag[k];
            }

            tmp[i] = value;
            //then dislocate the numbers which are after the i to one left index of int[] tmp
            for (int m = i + 1; m < valid + 1; m++) {
                tmp[m] = bag[m - 1];
            }

            valid++;
            bag = tmp;
        }
    }

    //remove------------------------------------------------
    public void remove(int index) {
        for (int i = index; i < valid - 1; i++) {
            bag[i] = bag[i + 1];
        }
        valid--;
    }

    //contains------------------------------------------------
    public boolean contains(int value) {
        for (int i = 0; i < valid; i++) {
            if (bag[i] == value)
                return true;
        }
        return false;
    }

    //toString------------------------------------------------
    public String toString() {
        String str;
        str = " ";
        for (int i = 0; i < valid; i++) {
            str = str + bag[i] + " , ";
        }
        return str;
    }

    //size------------------------------------------------
    public int size() {
        return valid;
    }

    //get------------------------------------------------
    public int get(int i) {
        return bag[i];
    }

    //findAll-----------------------------------------------
    public int[] findAll(int m) {
        int[] index;
        index = new int[valid];
        for (int i = 0; i < valid; i++) {
            if (bag[i] == m) {
                index[i] = i;
            } else
                //this will be usefull for the c part of this a lab01
                index[i] = -1;
        }
        return index;
    }
}

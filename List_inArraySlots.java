/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list

    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        typeOfElements = new int[INITIAL_CAPACITY];
        intElements = new int[INITIAL_CAPACITY];
        doubleElements = new double[INITIAL_CAPACITY];
        stringElements = new String[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String fakeTypeOfElements = "[";
        for (int index = 0; index < typeOfElements.length; index++) {
            if (typeOfElements[index] == 0)
                fakeTypeOfElements += intElements[index] + ",";
            if (typeOfElements[index] == 1)
                fakeTypeOfElements += doubleElements[index] + ",";
            if (typeOfElements[index] == 2)
                fakeTypeOfElements += stringElements[index] + ",";
        } fakeTypeOfElements += "]";
        return fakeTypeOfElements;
    }


    /**
      Appends @value to the end of this list.
      @return true, in keeping with conventions yet to be discussed
      type identifier for each element
         That is, typeOfElements[i] == 0 means element i is an integer;
                                       1 means element i is a double;
                                       2 means element i is a String.
     */
     public boolean add( int type   // same meaning as in typeOfElements
                       , int    intValue
                       , double doubleValue
                       , String stringValue
                       ) {
        // add integer
        if (filledElements == typeOfElements.length ) expand();
        if (type == 0) {
            typeOfElements[filledElements] = 0;
            intElements[filledElements] = intValue;
        }
        // add double
        if (type == 1) {
            typeOfElements[filledElements] = 1;
            doubleElements[filledElements] = doubleValue;
        }
        //add String
        if (type == 2) {
            typeOfElements[filledElements] = 2;
            stringElements[filledElements] = stringValue;
        }
        filledElements++;
        return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
        int[] intBigger = new int[filledElements *2];
        for (int index = 0; index < filledElements; index ++)
             intBigger[index] = intElements[index];
        intElements = intBigger;

        double[] doubleBigger = new double[filledElements *2];
        for (int index = 0; index < filledElements; index ++)
             doubleBigger[index] = doubleElements[index];
        doubleElements = doubleBigger;

        String[] stringBigger = new String[filledElements *2];
        for (int index = 0; index < filledElements; index ++)
             stringBigger[index] = stringElements[index];
        stringElements = stringBigger;

        int[] typeBigger = new int[filledElements *2];
        for (int index = 0; index < filledElements; index ++)
             typeBigger[index] = typeOfElements[index];
        typeOfElements = typeBigger;
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
     }
}

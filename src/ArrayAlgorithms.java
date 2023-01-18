public class ArrayAlgorithms {
    // ADD THE FOLLOWING METHODS TO THE OTHERS IN THIS CLASS!


    public static boolean containsPositive(int[] numList) {
        for(int i : numList){
            if(i > 0){
                return true;
            }
        }
        return false;
    }


    public static boolean containsString(String[] stringList, String searchStr) {
        for(String s : stringList){
            if(s.toUpperCase().contains(searchStr.toUpperCase())){
                return true;
            }
        }
        return false;
    }


    public static String[] makeLowercase(String[] wordList) { /* implement this method! */
    String[] lowered = new String[wordList.length];
    for(int i = 0; i < wordList.length; i++){
        lowered[i] = wordList[i].toLowerCase();
    }
    return lowered;
    }


    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) { /* implement this method! */
    int[] combined = new int[intArr1.length];
    for(int i = 0; i < intArr1.length; i++){
        if(intArr1[i] >= intArr2[i]){
            combined[i] = intArr1[i];
        }
        else combined[i] = intArr2[i];
    }
    return combined;
    }


    public static int endsInExclamations(String[] stringList) { /* implement this method! */
        int x = 0;
    for(int i = 0; i < stringList.length; i++){
        if(stringList[i].indexOf("!") == stringList[i].length() - 1){
            x++;
        }
    }
    return x;
    }


    public static int countConsecutiveDoubles(int[] numList) { /* implement this method! */
        int x = 0;
        for(int i = 0; i < numList.length - 1; i++){
            if(numList[i] == numList[i+1]){
                x++;
            }
        }
        return x;
    }


    public static int[] shiftLeft(int[] numList) { /* implement this method! */
        int shifted[] = new int[numList.length];
        shifted[0] = numList[numList.length - 1];
        for(int i = 1; i < numList.length - 1; i++){
            shifted[i] = numList[i + 1];
        }
        return shifted;
    }

    public static void shiftLeftModify(int[] numList)
    {
        int shifted = numList[0];
        for(int i = 0; i < numList.length - 1; i++){
            numList[i] = numList[i + 1];
        }
        numList[numList.length - 1] = shifted;
        }


    public static void shiftNumLeftModify(int[] numList, int shiftNum) { /* implement this method! */
        for(int i = 0; i < shiftNum; i++){
            ArrayAlgorithms.shiftLeftModify(numList);
        }
    }

    public static void shiftNumLeftModifyTwo(int[] numList, int shiftNum)
    { /* implement this method! */
        int[] temp = new int[numList.length];
        for(int i = 0; i < temp.length; i++){
            if(i + shiftNum < temp.length){
                temp[i] = numList[i + shiftNum];
            }
            else {
                temp[i] = numList[numList.length - ];
            }
        }
        for(int i = 0; i < temp.length; i++){
            numList[i] = temp[i];
        }

    }

    /** Shifts all elements in numList to the RIGHT shiftNum places;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The last shiftNum elements of the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6} and shiftNum = 2, this method MODIFIES
     *  the array to {7, 6, 5, 1, 3, 4} (all elements shifted right
     *  two with the last two elements wrapping around to the front)
     *  And given the array {5, 1, 3, 4, 7, 6} and shiftNum = 4,
     *  this method modifies the array to {3, 4, 7, 6, 5, 1}
     *
     *  Assume shiftNum <= numList.length (precondition)
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *  PRECONDITION: shiftNum <= numList.length
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void shiftNumRightModify(int[] numList, int shiftNum)
    { /* implement this method! */ }


    /** Returns a NEW array of ints that contains all elements of numList in
     *  reversed order.  For example, given the array {5, 1, 3, 4, 7, 6}, this
     *  method returns the array {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  Does NOT mutate (modify) original wordList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does NOT get modified
     *  @return  array of ints that contains numList in reversed order
     */
    public static int[] reverse(int[] numList)
    { /* implement this method! */
    int[] temp = new int[numList.length];
    for(int i = 0; i < numList.length; i++){
        temp[i] = numList[numList.length - (i + 1)];
    }
    return temp;
    }

    /** Reverses all elements in an array; this method modifies
     *  the original array and does not return anything (void).
     *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
     *  MODIFIES the array to {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void reverseModify(int[] numList)
    { /* implement this method! */
        int[] temp = new int[numList.length];
        for(int i = 0; i < numList.length; i++){
            temp[i] = numList[numList.length - (i + 1)];
        }
        for(int i = 0; i < numList.length; i++){
            numList[i] = temp[i];
        }
    }

}



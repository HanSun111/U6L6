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

}
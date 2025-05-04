package topSdetPrograms.strings;

public class secondLargestStringInArray {
    public static void main(String[] args) {
        String[] strings = {"Abc", "Ab", "Dced", "ABCHDH"};
        System.out.print(secondLargestString(strings));
    }

    public static String secondLargestString(String[] strings){
        String largest = strings[0];
        String secondLargest = "";

        for(int i=1;i<strings.length;i++){
            if(strings[i].length() > largest.length()){
                secondLargest = largest;
                largest =  strings[i];
            }
        }
        return secondLargest;
    }
}

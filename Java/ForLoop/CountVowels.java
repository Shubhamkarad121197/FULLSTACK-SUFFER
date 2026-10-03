

public class CountVowels {
    public static void main(String[] args) {
        String str="programming";
        int count=0;
        str=str.toLowerCase();
        for(char s:str.toCharArray()){
           if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            count++;
           }
        }
        System.out.println("Vowels available in String:"+count);
    }
}

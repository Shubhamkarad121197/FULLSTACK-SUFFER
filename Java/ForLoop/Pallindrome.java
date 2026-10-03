
public class Pallindrome {
    public static void main(String[] args) {
        String str="madam";
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }

        if(revStr.equals(str)){
            System.out.println("Pallindrome String");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}

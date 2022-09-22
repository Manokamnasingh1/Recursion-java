public class reversestr {
    public static void printrev( String str, int indx){
        if(indx==0){
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printrev(str,indx-1);
    }
    public static void main(String args[]){
        String str = "abcd";
        printrev(str,str.length()-1);

    }
}

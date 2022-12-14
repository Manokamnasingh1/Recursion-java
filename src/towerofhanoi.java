public class towerofhanoi {
   public static void towerofhanoi(int n, String src, String helper,String dest){
       //base case
       if(n==1){
           System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
           return;
       }
       //transfer disk (n-1) to helper
       towerofhanoi(n-1,src, dest, helper);
       System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
       towerofhanoi(n-1,helper, src, dest);
   }
   public static void main(String args[]){
       int n =3;
       towerofhanoi(n,"S","H","D");
   }
    
}

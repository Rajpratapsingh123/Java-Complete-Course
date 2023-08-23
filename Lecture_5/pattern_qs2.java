// Print hollow rectangle Pattern




package Lecture_5;

public class pattern_qs2 {
    public static void main(String[] args) {
        int n=4;
        int m=5;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}

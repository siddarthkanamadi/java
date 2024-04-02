package fourthsem;
public class twodemensionalarray {
    public static void main(String[] args) {
        int a[][]={{2,4},{7,10}};
        int b[][]={{5,11},{3,6}};
        int c[][]={{0,0},{0,0}};
        
        
        for (int i=0;i<a.length;i++){
            for ( int j=0;j<a.length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for ( int i=0;i<c.length;i++){
            for ( int j=0;j<c.length;j++){
                System.out.println("the addtiton ="+c[i][j]);
            }
     
        }
    
    }


}

public class twoDarray{
    public static void main(String args[]){
        int [][] a={
            {30},
            {300,500},
            {3000,5000,5000}
        };

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
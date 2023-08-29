public class twoD {
        public static void main(String[] args) {
            // Create a 2D array
            int[][] twoDArray = {
                {30},
                {300, 500},
                {3000, 5000, 5000}
            };
    
            // Print the 2D array
            for (int i = 0; i < twoDArray.length; i++) {
                for (int j = 0; j < twoDArray[i].length; j++) {
                    System.out.print(twoDArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    

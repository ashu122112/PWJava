public class ratInAmaze {
    
        public static void printSolution(int[][] output, int n )
        {
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println(printSolution(output[i][j],n )+" ");
                }
            }
        }
        public static boolean isSafe(int maze[][] , int i,int j,int n)
        {
            if (i>0 && i<n && j>0 && j<n && maze[i][j]==1 ){
                return true;
            }
            else{
                return false;
            }

        }
        public static boolean solveMaze(int maze[][],int output[][],int i, int j, int n)
        {
            if (i=n-1 && j=n-1 && maze[i][j]=1)
            {
                return true;
            }
            if (isSafe(maze,i,j,n)==true)
            {
                if (output[i][j]==1)
                {
                    return false;
                }
                //marks it as part of solution
                output[i][j]=1;
                //right direction
                if(isSafe(maze,i+1,j)==true)
                {
                    return true;
                }
                //bottom direction
                if(isSafe(maze,i,j+1)==true)
                {
                    return true;
                }

                //backtrack 
                output[i][j]=1;
                return false;
            }
            return false;
        }
        public static void main(String[] args) {
            int maze[][]={{1,0,1,0},
                        {1,0,0,1},
                        {1,1,1,0},
                        {0,1,1,1}};
            int n = maze.length;
            int[][] output=new int [n][n];
            if (solveMaze(maze, output, 0, 0, n)==true)
            {
                printSolution(maze, n);
            }
            else{
                System.out.println("Solution does not exist..");
            }
    }
    
}

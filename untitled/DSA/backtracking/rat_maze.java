public class rat_maze {
    public static int countPath(int[][] maze, int n )
    {
        // initializing columns
        for (int i=0;i<n;i++){
        // checking whether source and destinationare blocked nor not... 
        if (maze[0][0]==-1 && maze[n-1][n-1]==-1)
        {
            return 0 ;
        }
        if (maze[i][0]==0)
        {
            maze[i][0]=1;
        }
        else{
            //if there is blockage then break..
            break;
        }
    }
        // initialising rows
        for (int j=0;j<n;j++){
        // checking whether source and destinationare blocked nor not... 
        if (maze[0][0]==-1 && maze[n-1][n-1]==-1)
        {
            return 0 ;
        }
        if (maze[0][j]==0)
        {
            maze[0][j]=1;
        }
        else{
            //if there is blockage then break..
            break;
        }
    }
    

    }
    public static void main(String[] args) {
        
    }
    
}

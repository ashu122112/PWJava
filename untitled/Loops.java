public class Loops {
    public static void main(String[] args) {
        // for (int i=0 ; i<5 ; i++)
        // {
        // System.out.println("*");
        // }

        // ..... WHILE LOOP .....
        // int i = 0;
        // while (i < 5) {
        // System.out.println("*");
        // i++;
        // }

        // ......Do While .....
        // int j = 0;
        // do {
        // System.out.println("*");
        // j++;

        // } while (j < 5);

         //_____________PATTERN_____________

        // int n = 12;
        // for (i = 0; i < n; i++) {
        // for (int p = 0; p < 12; p++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 0; i < n; i++)
        // {
        // for (int j = 0; j < n; j++)
        // {

        // if (i==0 || j==0 || i==n-1 || j==n-1)
        // {
        // System.out.print(" * ");
        // }
        // else
        // {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int m = 5;
        // for (int i = 0; i < m; i++)
        // {
        // for (int j = 0; j < m; j++)
        // {

        // if (i==0 || j==0 || i==(m-1)/2 || j==m-1)
        // {
        // {
        // System.out.print(" * ");
        // }
        // }
        // else
        // {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }

        // int m = 5;
        // for (int i = 0; i < m; i++)
        // {
        // for (int j = 0; j < m; j++)
        // {

        // if (j==0 || j==m-1 || i==(m-1)/2 )
        // {
        // {
        // System.out.print("*");
        // }
        // }

        // else
        // {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }

        int m = 19;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {

                if (i == j || i + j == m - 1 || i == 0 || j == 0 || i == m - 1 || j == m - 1 || i + j == (m - 1) / 2
                        || i - j == (m - 1) / 2 || j - i == (m - 1) / 2 || i + j == (m - 1) / 2 + m - 1) {
                    {
                        System.out.print("*");
                    }
                }

                else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            for (int j = 0; j < m; j++) {

                if (i == 0 || j == 0 || i == m - 1 || j == m - 1 || i + j == (m - 1) / 2
                        || i - j == (m - 1) / 2 || j - i == (m - 1) / 2 || i + j == (m - 1) / 2 + m - 1) {
                    {
                        System.out.print("*");
                    }
                }

                else {
                    System.out.print(" ");
                }
            }

               System.out.print("   ");

            for (int j = 0; j < m; j++) {

                 if (i == 0 && j <= (m - 1) / 2 || j == 0 && i <= (m - 1) / 2 || i + j <= (m - 1) / 2 ||
                     i==0 && j>=(m-1)/2 || j==m-1 && i<=(m-1)/2 || j-i>=(m-1)/2 ||
                     j==0 && i>=(m-1)/2 || i==m-1 && j<=(m-1)/2 || i-j>=(m-1)/2 ||
                     j==m-1 && i>=(m-1)/2 || i==m-1 && j>=(m-1)/2 || i+j>=(m-1)/2+m-2 )
                {
                    {
                        System.out.print("*");
                    }
                }

                else {
                    System.out.print(" ");
                }
                
            }
            

            System.out.println();
            

        }

    }

}

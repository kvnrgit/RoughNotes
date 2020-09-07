public class InterviewProgram {

    public static void main(String[] args) {

        String str = "chill out";

        // Remove Spaces the replaceAll() method
        str = str.replaceAll("\\s", "");

        
        int l = str.length();
        int k = 0, row, column;
        
        //square root of largest perfect square number less than or equals to L
        row = (int) Math.floor(Math.sqrt(l));
        //square root of smallest perfect square number greater than or equals to L
        column = (int) Math.ceil(Math.sqrt(l));

        // Row * Column >= L
        if (row * column < l)
        {
            if (Math.min(column, row) == column)
            {
                column = column + 1;
            }
            else
            {
                row = row + 1;
            }
        }


        char s[][] = new char[row][column];

        // convert the string into matrix
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if(k < str.length())
                    s[i][j] = str.charAt(k);
                k++;
            }
        }

        // Printing the matrix Column wise to get encrypted String
        for (int i = 0; i < column; i++)
        {
            for (int j = 0; j < row; j++)
            {
                if (s[j][i] == 0)
                {
                    break;
                }
                System.out.print(s[j][i]);
            }
            System.out.print(" ");
        }


    }
}

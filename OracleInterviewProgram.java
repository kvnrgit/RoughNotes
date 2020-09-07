public class OracleInterviewProgram {

    public static void main(String[] args) {

        String str = "the black cat jumped on the roofing king thujin ffsif";

        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");

        System.out.println("String Update..."+str);
        System.out.println("String lentgh..."+str.length());

        int l = str.length();
        int k = 0, row, column;
        row = (int) Math.floor(Math.sqrt(l));
        column = (int) Math.ceil(Math.sqrt(l));

        System.out.println("Row..."+row);
        System.out.println("Column..."+column);

        if (row * column < l)
        {
            row = column;
        }


        char s[][] = new char[row][column];

        // convert the string into grid
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if(k < str.length())
                    s[i][j] = str.charAt(k);
                k++;
            }
        }

        // Printing the grid
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if (s[i][j] == 0)
                {
                    break;
                }
                System.out.print(s[i][j]);
            }
            System.out.println("");
        }
    }
}

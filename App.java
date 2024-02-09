/*
    CRYPTO : "GUPT"
    Developed by Mayank
    https://github.com/MayankDevil/
    Java : ./src/App.java
*/

public class App
{
    static java.util.Scanner input;

    static String choice;

    static char ch, letter = ' ';

    java.util.ArrayList<Character> list = new java.util.ArrayList();

    /*
        ===============
        | constructor |
        ===============
    */ 

    App()
    {
        input = new java.util.Scanner(System.in);
    }

    /*
        -----------------------------------------------------------------
        } execute function : arugment command set execute program
        -----------------------------------------------------------------
    */ 

    void execute(String command)
    {
        if (command != "gupt")
        {
            System.out.println("\nPermission:\t[Denied]\n");

            return;
        }

        System.out.println(
            "\n new key \n get key \n encrypt \n decrypt \n quit"
            +"\n choice command = "
        );

        choice = input.next();

        choice = choice.toUpperCase();

        ch = choice.charAt(0); // CONVERT SET
        
        /* choice match execute function */

        if (ch == 'N')
        {
            newKey();
        }
        else if (ch == 'G')
        {
            getKey();
        }
        else if (ch == 'E')
        {
            encrypt();
        }
        else if (ch == 'D')
        {
            decrypt();
        }
        else
        {
            System.exit(0);
        }
    }

    /*
        ------------------------------------------------------------
        } newKey function : 
        ------------------------------------------------------------
    */

    void newKey()
    {
        list.clear();

        for (int i = 0; i < 150; i++)
        {
            // System.out.print(letter++);
        }
    }

    /*
        ------------------------------------------------------------
        } getKey function : 
        ------------------------------------------------------------
    */

    void getKey()
    {
        System.out.print("getkey function");
    }

    /*
        ------------------------------------------------------------
        } encrypt function : 
        ------------------------------------------------------------
    */

    void encrypt()
    {
        System.out.print("getkey function");
    }

    /*
        ------------------------------------------------------------
        } decrypt function : 
        ------------------------------------------------------------
    */

    void decrypt()
    {
        System.out.print("getkey function");
    }
    
    /*
        --------------------------------------------------------------
        } main function :  
        --------------------------------------------------------------
    */ 

    public static void main(String[] args) /* throws Exception */
    {
        try
        {
            // new App().execute("gupt");

            // new Test().display();
        }
        catch(Exception error)
        {
            System.out.println(error.getMessage());
        }
        System.out.println("Successfully Done!");
    }
}
// the end ---
class Main
{
    private java.util.Scanner input;
    
    private java.util.ArrayList<Character> character_list, key;
    
    private String choice;
    
    private char character;
    
    /*
        ---------------
        | constructor |
        ---------------
    */
    
    Main()
    {
        input = new java.util.Scanner(System.in);
        
        character_list = new java.util.ArrayList<>();
        
        character = ' ';
    }
    
    /*
        ----------------------------------------------------------------------
        } newKey function :
        ----------------------------------------------------------------------
    */
    
    void newKey()
    {
        character_list.clear();
        
        // key.clear();
        
        for (int i = 32; i < 127; i++)
        {
            character_list.add(character++);
        }
        key = new java.util.ArrayList<>(character_list);
        
        java.util.Collections.shuffle(key);

        System.out.println("\n _[Key Generated] ");
    }
    
    /*
        ----------------------------------------------------------------------
        } getKey function :
        ----------------------------------------------------------------------
    */
    
    void getKey()
    { 
        for (char element_character : key)
        {
            System.out.print(element_character);
        }
    }
    
    /*
        ----------------------------------------------------------------------
        } terminate function : 
        ----------------------------------------------------------------------
    */
    
    void terminate()
    {
        System.out.println("\n\t _[ TERMINATED ] \n");
        
        System.exit(0);
    }
    
    /*
        ----------------------------------------------------------------------
        } execute function : arguent active command
        ----------------------------------------------------------------------
    */
    
    void execute(String active_command)
    {
        if (active_command == "gupt")
        {
            System.out.println("\n { GUPT } active command : [ACCEPT] \n");
                   
            System.out.println(
                "\n ///// COMMAND ME ///// : "
            );
            
            choice = input.nextLine();
            
            choice = choice.toUpperCase();

            // System.out.println(choice.charAt(0));
            
            if (choice.charAt(0) == 'N')
            {
                newKey();
            }
            else if (choice.charAt(0) == 'G')
            {
                getKey();
            }
            else
            {
                terminate();
            }
        }
        else
        {
            System.out.println("\n { GUPT } active command : [DENIED] \n");
        }
    }
    
    
    /*
        -----------------
        | main function |
        -----------------
    */
    
    public static void main(String args[])
    {
        new Main().execute("gupt");
    }
}

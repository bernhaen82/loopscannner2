public class Main {
    public static void main(String[] args)
    {
        int favnum = 0;

      bolean done = false;
    Scanner in = new Scanner(System.in);
    do
    {

        System.out.println("Enter your fav num [1-10] ; ");
        if (in.hasNextLine()) {
            favNum = in.nextInt();
            in.nextLine(); // clears the buffer
            if (favNum >= 1 && favNum < 10) ;
            {
                System.out.println("You Said your fav num is " + favNum);
            }

            {
                System.out.println("you said your fav num is " + favNum);
                System.out.println("but it has to be in [1-10] and it isnt ");
            }
        } else {
            trash = in.nextLine();
            System.out.println("you entered " + trash);
            System.out.println("rerun the program and do proper Input ");
        }
        System.out.println("Enter your salary ");
        if (in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine();
            System.out.println("you said your salry is " + salary );
        }
        else
        {
            trash = in.nextLine();
            System.out.println("you said your salary is " + trash);
            System.out.println("run the program again with correct input values");
        }

    }while(!done);
    }
}
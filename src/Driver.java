public class Driver
{
    private NewsFeed newsFeed = new NewsFeed();

    public static void main(String[] args)
    {
        new Driver();
    }
    public Driver()
    {
        runMenu();
    }

    private int mainMenu()
    {
        int option = ScannerInput.readNextInt("""
                Social Network Menu
                ------------------------
                    1) Add a Message Post
                    2) List all Posts
                ------------------------
                    0) Exit
                    ==>> """);
        return option;
    }

    private void runMenu()
    {
        int option = mainMenu();

        while (option != 0)
        {
            switch (option)
            {
                case 1 -> addMessagePost();
                case 2 -> showPosts();
                default -> System.out.println("Invalid option entered: " + option);
            }

            ScannerInput.readNextLine("\nPress enter key to continue...");

            option = mainMenu();
        }
        System.out.println("Exiting...bye");
        System.exit(0);
    }
    private void addMessagePost()
    {
        String author = ScannerInput.readNextLine("Enter the author's name: ");
        String message = ScannerInput.readNextLine("Enter the message: ");


        boolean isAdded = newsFeed.addPost(new MessagePost(author, message));
        if (isAdded)
        {
            System.out.println("Post added successfully!");
        }
        else
        {
            System.out.println("Post was not added");
        }
    }
    private void showPosts()
    {
        System.out.println("List of posts are: ");
        System.out.println(newsFeed.show());
    }
}

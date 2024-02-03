import java.util.ArrayList;
public class NewsFeed
{
    private ArrayList<MessagePost> posts;

    public NewsFeed()
    {
        posts = new ArrayList<MessagePost>();
    }

    public boolean addPost(MessagePost post)
    {
        return posts.add(post);
    }

    public String show()
    {
        String feed = "";
        if(!posts.isEmpty())
        {
            for(int i = 0; i < posts.size(); i++)
            {
                feed += i + ": " + posts.get(i).display() + "\n";
            }
        }
        else
        {
            feed = "No posts";
        }
        return feed;
    }
}

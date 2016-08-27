package everydayuseproductions.com.interactivestory.model;

/**
 * Created by Akash on 19-Aug-16.
 */
public class Choice {

    private int mNextPage;
    private String mText;


    public Choice(String text,int nextPage)
    {
         mText = text;
         mNextPage = nextPage;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }
}

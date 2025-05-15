abstract class Post{
    protected int likes= 0;
    public abstract void display();
    public void like()
    {
        likes++;
        System.out.println("Post Liked! total likes: "+ likes);
    }
}
class TextPost extends Post{
    private String text;
    public TextPost (String text){
        this.text = text;
    }
    @Override
    public void display()
    {
        System.out.println("Text Posts: "+ text + " Total Likes: "+ likes);
    }
}
class ImagePost extends Post{
    private String imagePath;
    public ImagePost(String imagePath){
        this.imagePath = imagePath;
    }
    @Override
    public void display()
    {
        System.out.println("Image Posts: "+ imagePath + " Total Likes: "+ likes);
    }
}
class VideoPost extends Post{
    private String videoPath;
    public VideoPost(String videoPath){
        this.videoPath = videoPath;
    }
    @Override
    public void display()
    {
        System.out.println("Video Posts: "+ videoPath+ " Total Likes: "+likes);
    }
}

public class SoacialMediaApp {
    public static void main(String[] args) {
       Post[] posts = new Post[3];

       posts[0] = new TextPost("Hello, World!");
       posts[1] = new ImagePost("image.jpg");
       posts[2] = new VideoPost("video.mp4");

       for(Post post : posts)
       {
        post.display();
        post.like();
        post.display();
        System.out.println();
       }
    }
}

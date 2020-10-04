package technicalblog.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;

@Service
public class PostService {

  public ArrayList<Post> getAllPosts() {
    ArrayList<Post> posts = new ArrayList<>();

    Post post1 = new Post();
    post1.setTitle("Post 1");
    post1.setBody("Post Body 1");
    post1.setDate(new Date());

    Post post2 = new Post();
    post2.setTitle("Post 2");
    post2.setBody("Post Body 2");
    post2.setDate(new Date());

    Post post3 = new Post();
    post3.setTitle("Post 3");
    post3.setBody("Post Body 3");
    post3.setDate(new Date());

    posts.add(post1);
    posts.add(post2);
    posts.add(post3);

    return posts;
  }

  public List<Post> getOnePost(){
    List<Post> posts = new ArrayList<>();
    Post post = new Post();
    post.setTitle("First Post");
    post.setBody("Your first post");
    post.setDate(new Date());
    posts.add(post);
    return posts;
  }

  public void createPost(Post newPost) {

  }

}

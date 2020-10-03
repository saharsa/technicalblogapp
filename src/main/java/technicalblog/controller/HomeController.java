package technicalblog.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String getAllPosts(Model model) {

    Post post1 = new Post();
    post1.setTitle("Post 1");
    post1.setBody("Post 1 Body");
    post1.setDate(new Date());

    Post post2 = new Post();
    post2.setTitle("Post 2");
    post2.setBody("Post 2 Body");
    post2.setDate(new Date());

    Post post3 = new Post();
    post3.setTitle("Post 3");
    post3.setBody("Post 3 Body");
    post3.setDate(new Date());

    List<Post> posts = new ArrayList<>();
    posts.add(post1);
    posts.add(post2);
    posts.add(post3);

    model.addAttribute("posts", posts);

    return "index";
  }
}

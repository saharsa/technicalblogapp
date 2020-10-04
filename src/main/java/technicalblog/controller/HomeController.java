package technicalblog.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;

@Controller
public class HomeController {

  @Autowired
  private PostService postService;

  @RequestMapping("/")
  public String getAllPosts(Model model) {

    List<Post> posts = postService.getAllPosts();

    model.addAttribute("posts", posts);

    return "index";
  }
}

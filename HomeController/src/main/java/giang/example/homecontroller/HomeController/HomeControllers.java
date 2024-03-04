package giang.example.homecontroller.HomeController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Home")
public class HomeControllers {

    @GetMapping("/index")
    public String index(Model model) {
        // Gán các thông tin cần thiết cho trang index
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        // Gán các thông tin cần thiết cho trang about
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        // Gán các thông tin cần thiết cho trang contact
        return "contact";
    }

    @GetMapping("/feedback")
    public String feedback(Model model) {
        // Gán các thông tin cần thiết cho trang feedback
        return "feedback";
    }

    @GetMapping("/faq")
    public String faq(Model model) {
        // Gán các thông tin cần thiết cho trang faq
        return "faq";
    }
}

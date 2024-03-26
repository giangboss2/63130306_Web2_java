package thigk.ntu63130306.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import thigk.ntu63130306.Service.ProductService;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping({"/", "/home"})
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "Index";
    }
}
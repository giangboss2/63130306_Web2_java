package thigk.ntu63130306.Service;

import org.springframework.stereotype.Service;
import thigk.ntu63130306.Models.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        // Khởi tạo danh sách sản phẩm mẫu
        products.add(new Product("P01", "áo len ", 100.0, "Description 1"));
        products.add(new Product("P02", "quần zen", 200.0, "Description 2"));
        products.add(new Product("P03", "mũ", 300.0, "Description 3"));
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findByCode(String code) {
        return products.stream()
                .filter(product -> product.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

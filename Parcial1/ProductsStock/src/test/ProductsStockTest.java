package test;

import main.ProductsStock;
import main.Product.Product;

/**
 * Unit test for ProductsStock.
 */
public class ProductsStockTest {

    @Test
    public void shouldAddNewProduct() {
        ProductsStock productsStock = new ProductsStock();
        Product product = new Product("name1", "100", "10", "aseo");
        assertTrue(productsStock.addProduct(product));
        assertEquals(1, (int) productsStock.getProduct().get(product));
    }

    @Test
    public void shouldChangeAmount() {
        Product product = new Product("name1", "100", "10", "aseo");
        product.changeAmount(1);
        assertEquals(1, (int) productsStock.getProduct().getAmount(product));
        
    }

    @Test
    public void shouldNotifyStockChange() {
        
    }



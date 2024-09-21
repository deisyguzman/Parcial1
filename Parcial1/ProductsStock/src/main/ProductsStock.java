package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProductsStock responsable de manejar los productos.
 */

public class ProductsStock {
    private final Map<Product, Integer> products;

    public ProductsStock() {
        products = new HashMap<>();
    }

    /**
     * Añade un nuevo producto al Map de los productos, para hacer esto debe 
     * comprobar si el producto ya existe, de ser así incrementa en 1 y en caso
     * contrario sería 1
     *
     * @param product el producto que se encuentra en el map.
     *
     * @return retorna true si se agrega el producto, de otra forma retorna false.
     */
    public boolean addProduct(Product product) {
            //Verificamos si el producto está en el hash de productos
            if (products.containsKey(product)) {
                products.put(product, products.get(product) + 1);
            } else {
                products.put(products, 1);
            }
            

            return true;
        }
    }
    public Map<Product,Integer> getProducts(){
        return products;
    }

    public boolean getProduct() {


    }
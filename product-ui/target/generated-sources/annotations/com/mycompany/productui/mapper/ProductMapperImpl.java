package com.mycompany.productui.mapper;

import com.mycompany.productui.client.dto.Product;
import com.mycompany.productui.client.dto.ProductDto;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-16T16:27:36+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setName( product.getName() );
        productDto.setDescription( product.getDescription() );
        productDto.setPrice( product.getPrice() );
        Set<String> set = product.getCategories();
        if ( set != null ) {
            productDto.setCategories( new HashSet<String>( set ) );
        }

        return productDto;
    }
}

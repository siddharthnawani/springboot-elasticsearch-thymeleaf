package com.mycompany.productapi.mapper;

import com.mycompany.productapi.model.Product;
import com.mycompany.productapi.model.Review;
import com.mycompany.productapi.rest.dto.AddReviewDto;
import com.mycompany.productapi.rest.dto.CreateProductDto;
import com.mycompany.productapi.rest.dto.UpdateProductDto;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-16T16:27:10+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toProduct(CreateProductDto createProductDto) {
        if ( createProductDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( createProductDto.getName() );
        product.setDescription( createProductDto.getDescription() );
        product.setPrice( createProductDto.getPrice() );
        Set<String> set = createProductDto.getCategories();
        if ( set != null ) {
            product.setCategories( new HashSet<String>( set ) );
        }

        return product;
    }

    @Override
    public void updateProductFromDto(UpdateProductDto updateProductDto, Product product) {
        if ( updateProductDto == null ) {
            return;
        }

        if ( updateProductDto.getName() != null ) {
            product.setName( updateProductDto.getName() );
        }
        if ( updateProductDto.getDescription() != null ) {
            product.setDescription( updateProductDto.getDescription() );
        }
        if ( updateProductDto.getPrice() != null ) {
            product.setPrice( updateProductDto.getPrice() );
        }
        if ( product.getCategories() != null ) {
            Set<String> set = updateProductDto.getCategories();
            if ( set != null ) {
                product.getCategories().clear();
                product.getCategories().addAll( set );
            }
        }
        else {
            Set<String> set = updateProductDto.getCategories();
            if ( set != null ) {
                product.setCategories( new HashSet<String>( set ) );
            }
        }
    }

    @Override
    public Review toReview(AddReviewDto addReviewDto) {
        if ( addReviewDto == null ) {
            return null;
        }

        Review review = new Review();

        review.setComment( addReviewDto.getComment() );
        if ( addReviewDto.getStars() != null ) {
            review.setStars( addReviewDto.getStars().shortValue() );
        }

        return review;
    }
}

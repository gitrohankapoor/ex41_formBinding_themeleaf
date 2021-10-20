package ca.sheridancollege.ex41_formBinding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoGame {
    private Long id;
    private String title;
    private String publisher;
    private String platform;
    private String[] platforms;
    private BigDecimal price;
}

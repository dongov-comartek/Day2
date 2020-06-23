package Ex2.questions;

import net.serenitybdd.screenplay.Question;

public class TheResult {
    public static Question<Boolean> verifyProName(){
        return new ProductName();
    }
    public static Question<Boolean> verifyProImage(){
        return new ProductImage();
    }
    public static Question<Boolean> verifyProPrice(){
        return new ProductPrice();
    }
}

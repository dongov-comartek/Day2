package Ex4.questions;

import net.serenitybdd.screenplay.Question;

public class TheResulted {
    public static Question<Boolean> verifyNameProduct(){
        return new NameProduct();
    }
    public static Question<Boolean> verifyProductInamge(){
        return  new ImageProduct();
    }
    public static Question<Boolean> verifyChooseBuy(){
        return new ChooseBuy();
    }
    public static Question<Boolean> verifyPrice(){
        return new Price();
    }
}

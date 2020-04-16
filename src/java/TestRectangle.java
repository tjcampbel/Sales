import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestRectangle {

  @Test
  public void testPerimeter(){
    Rectangle rectangle = new Rectangle(4,2);

    Assertions.assertTrue(12 == rectangle.getPerimeter());

  }

  @Test
  public void testArea(){
    Rectangle rectangle = new Rectangle(4,2);

    Assertions.assertTrue(8 == rectangle.getArea());

  }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SeparandoStreamTest {
    @Test
    public void sep(){
        Pessoa pessoa = new Pessoa();
        String genero = pessoa.getGenero();
        Assertions.assertEquals("F",genero);
    }
}

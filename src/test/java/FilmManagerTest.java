import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void test() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}

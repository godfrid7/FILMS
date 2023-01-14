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


    @Test
    public void maximumLimitTest() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";
        String film9 = "Film IX";
        String film10 = "Film X";
        String film11 = "Film XI";
        String film12 = "Film XII";
        String film13 = "Film XIII";
        String film14 = "Film XIV";
        String film15 = "Film XV";

        FilmManager manager = new FilmManager(15);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);
        manager.addFilm(film13);
        manager.addFilm(film14);
        manager.addFilm(film15);

        String[] expected = {"Film XV", "Film XIV", "Film XIII", "Film XII", "Film XI", "Film X", "Film IX",
                "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LimitTest() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";
        String film9 = "Film IX";
        String film10 = "Film X";
        String film11 = "Film XI";
        String film12 = "Film XII";
        String film13 = "Film XIII";
        String film14 = "Film XIV";
        String film15 = "Film XV";

        FilmManager manager = new FilmManager(10);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);
        manager.addFilm(film13);
        manager.addFilm(film14);
        manager.addFilm(film15);

        String[] expected = {"Film XV", "Film XIV", "Film XIII", "Film XII", "Film XI", "Film X", "Film IX",
                "Film VIII", "Film VII", "Film VI"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void averageLimitTest() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";

        FilmManager manager = new FilmManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void overLimitTest() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";


        FilmManager manager = new FilmManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);

        String[] expected = {"Film VIII", "Film VII", "Film VI","Film V", "Film IV"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void belowLimitTest() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";

        FilmManager manager = new FilmManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
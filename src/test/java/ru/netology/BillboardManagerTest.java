package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardManagerTest {


    @Test
    public void test() {
        BillboardManager afisha = new BillboardManager();
        afisha.addFilm("Picture1");
        afisha.addFilm("Picture2");
        afisha.addFilm("Picture3");

        String[] expected = {"Picture1", "Picture2", "Picture3"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        BillboardManager afisha = new BillboardManager();
        afisha.addFilm("Picture1");
        afisha.addFilm("Picture2");
        afisha.addFilm("Picture3");
        afisha.addFilm("Picture4");
        afisha.addFilm("Picture5");
        String[] expected = {"Picture1", "Picture2", "Picture3", "Picture4", "Picture5"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        BillboardManager afisha = new BillboardManager();
        afisha.addFilm("Picture1");
        afisha.addFilm("Picture2");
        afisha.addFilm("Picture3");
        afisha.addFilm("Picture4");
        afisha.addFilm("Picture5");
        afisha.addFilm("Picture6");
        afisha.addFilm("Picture7");
        afisha.addFilm("Picture8");
        afisha.addFilm("Picture9");
        afisha.addFilm("Picture10");
        String[] expected = {"Picture1", "Picture2", "Picture3", "Picture4", "Picture5", "Picture6", "Picture7", "Picture8", "Picture9", "Picture10"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        BillboardManager afisha = new BillboardManager();
        afisha.addFilm("Picture1");
        afisha.addFilm("Picture2");
        afisha.addFilm("Picture3");
        afisha.addFilm("Picture4");
        afisha.addFilm("Picture5");
        afisha.addFilm("Picture6");
        afisha.addFilm("Picture7");
        afisha.addFilm("Picture8");
        afisha.addFilm("Picture9");
        afisha.addFilm("Picture10");
        String[] expected = {"Picture10", "Picture9", "Picture8", "Picture7", "Picture6", "Picture5", "Picture4", "Picture3", "Picture2", "Picture1"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        BillboardManager afisha = new BillboardManager();
        afisha.addFilm("Picture1");
        afisha.addFilm("Picture2");
        afisha.addFilm("Picture3");
        afisha.addFilm("Picture4");
        afisha.addFilm("Picture5");
        afisha.addFilm("Picture6");
        afisha.addFilm("Picture7");
        afisha.addFilm("Picture8");
        afisha.addFilm("Picture9");
        afisha.addFilm("Picture10");

        String[] expected = {"Picture1", "Picture2", "Picture3", "Picture4", "Picture5", "Picture6", "Picture7", "Picture8", "Picture9", "Picture10"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        BillboardManager afisha = new BillboardManager();
        afisha.addFilm("Picture1");
        afisha.addFilm("Picture2");
        afisha.addFilm("Picture3");
        afisha.addFilm("Picture4");
        afisha.addFilm("Picture5");
        afisha.addFilm("Picture6");
        afisha.addFilm("Picture7");
        afisha.addFilm("Picture8");
        afisha.addFilm("Picture9");
        afisha.addFilm("Picture10");
        afisha.addFilm("Picture11");
        String[] expected = {"Picture11", "Picture10", "Picture9", "Picture8", "Picture7", "Picture6", "Picture5", "Picture4", "Picture3", "Picture2"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        BillboardManager afisha = new BillboardManager();
        afisha.addFilm("Picture1");
        afisha.addFilm("Picture2");
        afisha.addFilm("Picture3");
        afisha.addFilm("Picture4");
        afisha.addFilm("Picture5");

        String[] expected = {"Picture5", "Picture4", "Picture3", "Picture2", "Picture1"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

}

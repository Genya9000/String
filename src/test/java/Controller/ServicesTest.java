package Controller;

import Model.Parser;

import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ServicesTest {
private Services services;

    @Before
    public void setUp() throws Exception {
        services = new Services();
    }

    @Test
    public void replaceWithSubstring() {
        Pattern pattern = Pattern.compile("\\p{Z}(\\p{L}){3}(\\p{P}|\\p{Z})");
        //set the offer for search
        Matcher matcher = pattern.matcher(services.getOne());
        assertEquals(" Во-первых, баня того, чтобы читать психологам, психоаналитикам и психиатрам лекции о сравнительной этологии и физиологии поведения, а во-вторых, чтобы проверить в естественных условиях на коралловых рифах у побережья Флориды гипотезу о боевом поведении некоторых баня и о функции их окраски баня сохранения вида, — гипотезу, построенную на аквариумных наблюдениях",matcher.replaceAll(" "+"баня"+" "));
    }
}
package MavenTekrari;

import org.junit.*;

public class Day08_Tekrar03 {

    @BeforeClass
    public static void setUp(){
        System.out.println("SetUp calisti");
    }
    @Before
    public void testtenÖnce(){
        System.out.println("Method öncesi calisti");
    }
    @Test
    public void test1(){
        System.out.println("Test1 calisti");
    }

    @Test
    public void test2(){
        System.out.println("Test2 calisti");
    }
    @After
    public void testtenSonra(){
    System.out.println("Method sonrasi calisti");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown calisti");
    }
}

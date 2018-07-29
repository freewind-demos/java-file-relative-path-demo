package demo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Hello {

    public static void main(String[] args) {
        Path pathAbsolute = Paths.get("/var/data/stuff/xyz.dat");
        Path pathBase = Paths.get("/var/data");
        Path pathRelative = pathBase.relativize(pathAbsolute);
        System.out.println(pathRelative);
    }

}

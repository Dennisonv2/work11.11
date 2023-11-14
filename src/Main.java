import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.venicle.Car;
import com.company.venicle.Lorry;
import com.company.venicle.SportCar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создание двигателя
        Engine engine = new Engine(300, "BMW");

        //Создание водителя
        Driver danil = new Driver("Данилов Даниил Данилович", 10);

        //Создание грузовика
        SportCar lamborgini = new SportCar("Lamborgini", "C", 5000, danil, engine, 400);

        //Вывод информации о грузовик
        System.out.println(lamborgini.toString());

        //Изменение информации о производителе движка
        System.out.println(lamborgini.getEngine().getManufacturer());
        engine.setManufacturer("Mersedes");
        System.out.println(lamborgini.getEngine().getManufacturer());


        Person dab = new Person("Габдулхаков Даниил Алексеевич");
        System.out.println(dab.getFullName());
    }
}
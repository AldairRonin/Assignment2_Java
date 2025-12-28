public class Main {
public static void main(String[] args) {
        Car car = new Car ("Chevrolet",2020,4,"Gasoline"); //Создание объекта Car
        Motorcycle motorcycle = new Motorcycle ("Harley-Davidson",2019,false); //Создание объекта Motorcycle
        Truck truck = new Truck ("DAF",2018,16.0,5); //Создание объекта Truck

        Driver driver = new Driver ("Adilkhan Aldiyar", "KZ25082007"); //Создание объекта Driver

        //Назначение водителя транспортным средствам
        car.setDriver(driver);
        motorcycle.setDriver(driver);
        truck.setDriver(driver);

        Vehicle[] vehicles = {car, motorcycle, truck}; //Массив транспортных средств
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine(); 
            vehicle.display_info(); 
            vehicle.displayDriverInfo();
            vehicle.stopEngine();
            System.out.println();
        }
}
}

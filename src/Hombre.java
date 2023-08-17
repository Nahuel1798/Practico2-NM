
public class Hombre {
    public void jugarConRobot(Robot robot) {
        robot.avanzar(500);
        robot.retroceder(20);
        System.out.println("Energía del robot: " + robot.energiaActual());
        robot.dormir();
    }
}

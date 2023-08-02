public class Chandrayaan3 {
    private int x, y, z;
    private String direction;

    public Chandrayaan3() {
        x = 0;
        y = 0;
        z = 0;
        direction = "N";
    }

    private void moveForward() {
        switch (direction) {
            case "N":
                y += 1;
                break;
            case "S":
                y -= 1;
                break;
            case "E":
                x += 1;
                break;
            case "W":
                x -= 1;
                break;
            case "Up":
                z += 1;
                break;
            case "Down":
                z -= 1;
                break;
        }
    }

    private void moveBackward() {
        switch (direction) {
            case "N":
                y -= 1;
                break;
            case "S":
                y += 1;
                break;
            case "E":
                x -= 1;
                break;
            case "W":
                x += 1;
                break;
            case "Up":
                z -= 1;
                break;
            case "Down":
                z += 1;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "S":
                direction = "W";
                break;
            case "E":
                direction = "S";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    private void turnUp() {
        if (direction.equals("N") || direction.equals("S")) {
            direction = "Up";
        }
    }

    private void turnDown() {
        if (direction.equals("N") || direction.equals("S")) {
            direction = "Down";
        }
    }

    private void executeCommands(char[] commands) {
        for (char cmd : commands) {
            switch (cmd) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Chandrayaan3 chandrayaan3 = new Chandrayaan3();
        char[] commands = {'f', 'r', 'u', 'b', 'l'};
        chandrayaan3.executeCommands(commands);

        // Output the final position and direction
        System.out.println("Final Position: (" + chandrayaan3.x + ", " + chandrayaan3.y + ", " + chandrayaan3.z + ")");
        System.out.println("Final Direction: " + chandrayaan3.direction);
    }
}

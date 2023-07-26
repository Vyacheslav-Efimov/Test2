public class Tank {
    int position_x;
    int position_y;
    int fuel;
    int napravlenie;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int position_x, int position_y) {
        this(position_x, position_y, 100);
    }

    public Tank(int position_x, int position_y, int fuel) {
        this.position_x = position_x;
        this.position_y = position_y;
        this.fuel = fuel;
    }

    int turnRight() {
        if (napravlenie == 0) {
            napravlenie += 1;
            return napravlenie;
        } else if (napravlenie == 1) {
            napravlenie += 1;
            return napravlenie;
        } else if (napravlenie == 2) {
            napravlenie += 1;
            return napravlenie;
        } else {
            napravlenie = 0;
            return napravlenie;
        }
    }


    int turnLeft() {
        if (napravlenie == 0) {
            napravlenie = 3;
            return napravlenie;
        } else if (napravlenie == 1) {
            napravlenie -= 1;
            return napravlenie;
        } else if (napravlenie == 2) {
            napravlenie -= 1;
            return napravlenie;
        } else {
            napravlenie -= 1;
            return napravlenie;
        }
    }

    public void goForward(int go) {
        if (go < 0 && -go > fuel) {
            go = -fuel;


        } else if (go > fuel) {
            go = fuel;

        }

        if (napravlenie == 0) {
            position_x += go;

        } else if (napravlenie == 1) {
            position_y += go;

        } else if (napravlenie == 2) {
            position_x -= go;

        } else {
            position_y -= go;

        }
        fuel -= go;
    }

    public void goBackward(int go) {
        if (go < 0 && -go > fuel) {
            go = -fuel;

        } else if (go > fuel) {
            go = fuel;
        }
        if (napravlenie == 0) {
            position_x -= go;

        } else if (napravlenie == 1) {
            position_y -= go;

        } else if (napravlenie == 2) {
            position_x += go;

        } else {
            position_y += go;

        }
        fuel -= go;
    }

    void printPosition() {
        System.out.println("The Tank is at " + position_x + ", " + position_y + " now.");
    }
}
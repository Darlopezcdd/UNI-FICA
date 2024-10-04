public class vector3d {
    private double x;
    private double y;
    private double z;


    public vector3d(double num) {
        this(num, 0, 0);
    }

    public vector3d(double x, double y) {
        this(x, y, 0);
    }

    public vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public vector3d() {
        this(0, 0, 0);
    }

    public boolean Comparacion(double x, double y, double z) {
        if ((this.x == x) && (this.y == y) && (this.z == z)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Comparacion(vector3d V) {
        return Comparacion(V.x, V.y, V.z);
    }

    public boolean Comparacion() {
        return Comparacion(0, 0, 0);
    }

    public boolean Comparacion(double num) {
        return Comparacion(num, num, num);
    }

    public vector3d Suma(double x, double y, double z) {
        return new vector3d(this.x + x, this.y + y, this.z + z);
    }

    public vector3d Suma(double num) {
        return Suma(num, num, num);
    }

    public vector3d Suma(vector3d v) {
        return Suma(v.x, v.y, v.z);
    }

    public vector3d Suma() {
        return Suma(1, 1, 1);
    }

    public double Modulo() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public boolean Pararlelo(double x, double y, double z) {

        double num = ((this.y * z) - (this.z * y)) - ((this.x * z) - (this.z * x)) + ((this.x * y) - (this.y * x));
        if ((num) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Pararlelo(double num) {
        return Pararlelo(num, num, num);
    }

    public boolean Pararlelo() {
        return Pararlelo(0, 0, 0);
    }

    public boolean Pararlelo(vector3d v) {
        return Pararlelo(v.x, v.y, v.z);
    }

    public boolean Perpendicular(double x, double y, double z) {

        double num = (this.x*x) + (this.y * y) + (this.z* z) ;
        if ((num) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Perpendicular(double num) {
        return Perpendicular(num, num, num);
    }

    public boolean Perpendicular() {
        return Perpendicular(0, 0, 0);
    }

    public boolean Perpendicular(vector3d v) {
        return Perpendicular(v.x, v.y, v.z);
    }

    public String Imprimir()
    {
        return "Vector= ("+this.x+","+this.y+","+this.z+")";
    }


}


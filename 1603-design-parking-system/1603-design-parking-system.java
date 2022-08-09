class ParkingSystem {
    public int big;
    public int medium;
    public int small;
    
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        // if cartype = 1 check if there there is slot in big
        if (carType == 1) {
            if (this.big == 0) {
                return false;
            } else {
                this.big--;
                return true;
            }
        }
        
        if (carType == 2) {
            if (this.medium == 0) {
                return false;
            } else {
                this.medium--;
                return true;
            }
        }
        
        if (carType == 3) {
            if (this.small == 0) {
                return false;
            } else {
                this.small--;
                return true;
            }
        }
        
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */


/*
Give:
- design a parking system for a parking lot
- three kinds of spaces: big, medium and small
- a fixed (specific) number oof slots for each space size

- implement the ParkingSystem class:
- addCar(int carType): checks whether there is a parking space of carType
*/
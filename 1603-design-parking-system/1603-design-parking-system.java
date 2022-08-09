class ParkingSystem {

    int[] size = new int[3];
    int[] available = new int[3];
    
    public ParkingSystem(int big, int medium, int small) {
        size[0] = big;
        size[1] = medium;
        size[2] = small;
    }
    
    public boolean addCar(int carType) {
        switch(carType){
            case 1:
                available[0]++;
                if(available[0]>size[0]) return false;
                break;
            case 2:
                available[1]++;
                if(available[1]>size[1]) return false;
                break; 
            case 3:
                available[2]++;
                if(available[2]>size[2]) return false;
                break;
        }
        
        return true;
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
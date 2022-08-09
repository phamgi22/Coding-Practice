class ParkingSystem {

    int[] spaces = new int[3];
    int[] parked = new int[3];
    
    public ParkingSystem(int big, int medium, int small) {
        spaces[0] = big;
        spaces[1] = medium;
        spaces[2] = small;
    }
    
    public boolean addCar(int carType) {
        switch(carType){
            case 1:
                parked[0]++;
                if(parked[0]>spaces[0]) return false;
                break;
            case 2:
                parked[1]++;
                if(parked[1]>spaces[1]) return false;
                break; 
            case 3:
                parked[2]++;
                if(parked[2]>spaces[2]) return false;
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
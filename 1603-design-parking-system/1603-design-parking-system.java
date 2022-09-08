class ParkingSystem {
    int[] spaces = new int[3];
    int[] parked = new int[3];
    
    public ParkingSystem(int big, int medium, int small) {
        this.spaces[0] = big;
        this.spaces[1] = medium;
        this.spaces[2] = small;
    }
    
    public boolean addCar(int carType) {
        switch(carType) {
            case 1: 
                this.parked[0]++;
                if (parked[0]>spaces[0]) return false;
                break;
            case 2: 
                this.parked[1]++;
                if (parked[1]>spaces[1]) return false;
                break;
            case 3: 
                this.parked[2]++;
                if (parked[2]>spaces[2]) return false;
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
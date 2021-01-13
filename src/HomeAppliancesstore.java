public class HomeAppliancesstore
{
    public static void main(String[] args)
    {
        Fridge Fridge = new Fridge(86, 180 , 68, 202 , 879 , 38 , 435 , 2 , "Space Grey" , "Fridge" , "Bosch", "NoFrost inox");
        Oven Oven = new Oven( 59, 84 , 60 , 200 , 498 , 7 , 73 , 300 , "Space Gray" , "Oven" , "AEG" , "CCB6442ABM");
        AirCondition Air = new AirCondition(78 , 28 , 25 , 180 , 490 , 55 , 6 , 4 , "White" , "AirCondition" , "Daikin" , "ATXC35B");
        WashMachine Machine = new WashMachine(60 , 85 , 60 , 130 , 668 , 1400 , 13 , 9 , "Grey" , "WashMachine" , "Samsung" ,"WW90M644OPW");
        AirCondition Air_2 = new AirCondition(70 , 28 , 18 , 140 , 348 , 45 , 6 , 4 , "White" , "AirCondition" , "Tesla" , "TA36FFLL");
        WashMachine Machine_2 = new WashMachine(60 , 85 , 56 , 115 , 478 , 1400 , 10 , 8 , "White" , "WashMachine" , "LG" ,"F4WV508S0");
        System.out.println("Suskeues:");
        System.out.println(Fridge.FridgeCounter());
        System.out.println(Machine.MachineCounter());
        System.out.println(Oven.OvenCounter());
        System.out.println(Air.AirCounter());
    }
}
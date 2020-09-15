package Day12.emptyinterface;

import Day12.logcarinterface.RecordeAble;

public class TransportRecoderForLog {
    public static int counter = 0;
    public static int MotorVehicleCounter = 0;
    public static int NonMotorVehicleCounter = 0;
    public static void recordTransport(RecordeAble recordeAble){
        if (recordeAble instanceof MotorVehicle){
            MotorVehicleCounter++;
        }
        if (recordeAble instanceof NonMotorVehicle){
            NonMotorVehicleCounter++;
        }
    }
}

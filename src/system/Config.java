
package system;

import interfaces.IData;
import data.DataMemmory;


public class Config {
    
    public static IData dataManager = new DataMemmory();
    private static int dados = DataCapture.problemasLevelsInitialize();
    
}

package JavaDP.SingletonDesignPattern;

import java.util.HashMap;

public class SettingsSingleton {
    
    private static SettingsSingleton settingsSingleton;
    private HashMap<String, Object> settings; // Value of settings might be String or Interger

    private SettingsSingleton() {}

    public SettingsSingleton getInstance() {
        if(settingsSingleton == null) {
            settingsSingleton = new SettingsSingleton();
        }

        return settingsSingleton;
    }

    public void configure(HashMap<String, Object> settings) {
        this.settings = settings;
    }
}

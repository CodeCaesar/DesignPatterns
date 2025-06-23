package JavaDP.SingletonDesignPattern;

public class SettingsSingleton {
    
    private static SettingsSingleton settingsSingleton;

    private SettingsSingleton() {}

    public SettingsSingleton getInstance() {
        if(settingsSingleton == null) {
            settingsSingleton = new SettingsSingleton();
        }

        return settingsSingleton;
    }
}

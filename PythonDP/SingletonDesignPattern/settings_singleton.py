class SettingsSingleton:
    _settings_singleton = None

    def __new__(cls):
        if not cls._settings_singleton:
            cls._settings_singleton = super(SettingsSingleton, cls).__new__(cls)
        
        return cls._settings_singleton

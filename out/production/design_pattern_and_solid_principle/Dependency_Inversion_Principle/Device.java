package out.production.design_pattern_and_solid_principle.Dependency_Inversion_Principle;

// Interface representing a device
interface Device {
    void turnOn();
    void turnOff();
}

// Concrete implementation of a light bulb
class LightBulb implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light bulb turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb turned off");
    }
}

// Concrete implementation of a fan
class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fan turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned off");
    }
}

// High-level module that depends on abstractions (interfaces)
class Switch {
    private Device device;

    public Switch(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}

// Client code
 class MainDevice {
    public static void main(String[] args) {
        Device lightBulb = new LightBulb();
        Device fan = new Fan();

        Switch lightSwitch = new Switch(lightBulb);
        Switch fanSwitch = new Switch(fan);

        lightSwitch.turnOn(); // Output: Light bulb turned on
        lightSwitch.turnOff(); // Output: Light bulb turned off

        fanSwitch.turnOn(); // Output: Fan turned on
        fanSwitch.turnOff(); // Output: Fan turned off
    }
}


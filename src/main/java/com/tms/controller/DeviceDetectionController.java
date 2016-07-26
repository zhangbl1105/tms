package com.tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.mobile.device.Device;

@Controller
public class DeviceDetectionController {

    @RequestMapping("/detect-device")
    public @ResponseBody String detectDevice(Device device) {
        String deviceType = "unknown";
        
        if (device.isNormal()) {
            deviceType = device.getDevicePlatform() + " normal";
        } else if (device.isMobile()) {
            deviceType = device.getDevicePlatform() + " mobile";
        } else if (device.isTablet()) {
            deviceType = device.getDevicePlatform() + " tablet";
        }
        return "Hello " + deviceType + " browser!";
    }
}

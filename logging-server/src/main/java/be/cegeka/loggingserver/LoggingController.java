package be.cegeka.loggingserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LoggingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/log")
    public void log() {
        LOGGER.info("Log");
    }

    @RequestMapping("/exception")
    public void logException() {
        LOGGER.error("Exception!", new RuntimeException("Boem bats kapot!!"));
    }
}

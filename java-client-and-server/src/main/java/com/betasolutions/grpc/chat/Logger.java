package com.betasolutions.grpc.chat;

import java.util.logging.Level;

class Logger {

    private final java.util.logging.Logger logger;

    Logger(Class cls) {
        logger = java.util.logging.Logger.getLogger(cls.getSimpleName());
    }

    public void warning(String msg, Object... params) {
        logger.log(Level.WARNING, msg, params);
    }

    public void info(String msg, Object... params) {
        logger.log(Level.INFO, msg, params);
    }
}

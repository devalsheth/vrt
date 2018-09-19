package com.chetan.microservices.vertx.launchtool;

import com.comcast.xhwholesale.template.vertx.foundation.annotations.VertxServer;
import com.comcast.xhwholesale.template.vertx.foundation.service.Server;
import io.vertx.core.Future;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Component("launchToolVerticle")
@Scope("prototype") // Enable multiple instances of the server
@VertxServer("launchtoolserver")
public class LaunchToolServer extends Server {

    private static final String WEBROOT = "webroot";

    /**
     * Call the superclass Server verticle initialization
     *
     * @throws Exception
     */
    public void start(Future<Void> future) throws Exception {
        super.start(future);
    }

    /**
     * Set the port for HTTP1. This overrides the base class and set to a different port
     */
    public int getHttp1Port() {
        return  9090;
    }

    /**
     * Set the port for HTTP2. This overrides the base class  and set to a different port
     */
    public int getHttp2Port() {
        return  9091;
    }

}

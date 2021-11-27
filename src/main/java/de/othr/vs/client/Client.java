package de.othr.vs.client;

import de.othr.vs.server.MesswertServer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(MesswertServer.SERVER_GRPC_HOST,
                        MesswertServer.SERVER_GRPC_PORT)
                .usePlaintext()
                .build();

        // Stub generieren (je nach Anwendungsfall stub, blocking stub oder future stub)

        // Messages generieren und Service aufrufen


        // Client noch nicht beenden, Callbacks vom Server (via StreamObserver::onNext, ...)
        // werden sonst nicht mehr empfangen
        channel.awaitTermination(30L, TimeUnit.SECONDS);
    }
}

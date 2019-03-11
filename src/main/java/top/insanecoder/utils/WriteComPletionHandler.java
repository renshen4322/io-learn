package top.insanecoder.utils;

import java.nio.channels.CompletionHandler;

/**
 *
 */
public class WriteComPletionHandler implements CompletionHandler<Integer, Void> {

    @Override
    public void completed(Integer result, Void attachment) {
    }

    @Override
    public void failed(Throwable exc, Void attachment) {
        System.out.println("Write failed!!!");
    }
}

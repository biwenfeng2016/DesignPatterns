package RPC;

class EchoServiceImpl implements EchoService {
    public String echo(String request) {
        return "echo : " + request;
    }
}
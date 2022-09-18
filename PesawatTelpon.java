public class PesawatTelpon {
    String receiver, transmiter, dialpad;

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setTransmiter(String transmiter) {
        this.transmiter = transmiter;
    }

    public void setDialpad(String dialpad) {
        this.dialpad = dialpad;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getTransmiter() {
        return transmiter;
    }

    public String getDialpad() {
        return dialpad;
    }

    void menelpon(String b) {
        System.out.println("tekan dial pad untuk menelpon");
    }
}
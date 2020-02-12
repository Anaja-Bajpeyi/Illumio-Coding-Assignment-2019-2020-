import java.main.Firewall;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FirewallTest {
    Firewall firewall;

    
    public void setUp() throws IOException {
        firewall = new Firewall("input.csv");
    }
//All the test Cases taken from sample example provided in the Challenge

    //Test1
    public void test1() {
        assertEquals(true, firewall.accept_packet("inbound", "udp", 53, "192.168.2.1"));
    }

     //Test2
    public void test2() {
        assertEquals(true, firewall.accept_packet("outbound", "tcp", 10234, "192.168.10.11"));
    }

     //Test3
    public void test3() {
        assertEquals(false, firewall.accept_packet("inbound", "tcp", 81, "192.168.1.2"));
    }

     //Test4
    public void test4() {
        assertEquals(false, firewall.accept_packet("inbound", "udp", 24, "52.12.48.92"));
    }
}

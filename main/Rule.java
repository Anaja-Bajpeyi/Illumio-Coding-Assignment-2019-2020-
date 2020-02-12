public class Rule {
    private String direction;
    private String protocol;
    private Port port;
    private IpAddress ip;

    public Rule(String direction, String protocol, String port, String ip) {
        this.direction = direction;
        this.protocol = protocol;
        this.port = new Port(port);
        this.ip = new IpAddress(ip);
    }

    public String toString() {
        return "com.java.main.Rule{" +
                "direction='" + direction + '\'' +
                ", protocol='" + protocol + '\'' +
                ", port=" + port +
                ", ip=" + ip +
                '}';
    }

    
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }

        Rule inputRule = (Rule) o;

        return (
                inputRule.direction.equals(this.direction) &&
                inputRule.protocol.equals(this.protocol) &&
                inputRule.port.inPortRange(this.port) &&
                inputRule.ip.inIpRange(this.ip)
        );


    }
}

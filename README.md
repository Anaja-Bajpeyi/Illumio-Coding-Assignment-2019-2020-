# Illumio-Coding-Assignment-2019-2020-
# Problem Statement: 

Given a set of firewall rules, a network packet will  be accepted by the firewall if and only if the direction, protocol, port, and IP address match at  least one of the input rules. If a rule contains a port range, it will match all packets whose port  falls within the range. If a rule contains an IP address range, it will match all packets whose IP  address falls within the range.  

# Flow of the Program as Per Guidelines: 

[1.]Used Junit test case to test the working  of the code. Its in the "test" folder with the name "FirewallTest.java" 

[2.]The Main Program is the "Firewall.java"  that takes path of the "input.csv" for input rules. The input.csv file is read line by line rules are created from the file "Rule.java" and stored in hashset.  The program "Rule.java" takes 4 parameters from the  "input.csv" and creates rule based on it.  The program "Port.java" and "IpAddress.java" each of them have their rules i.e value should be in the range.

All these files have been stored in the folder "main".

# Improvements: 

The code has been designed keeping the asked flow in the challenge (accept_packet takes four argument  returns a boolean). I had an one more thing that I could  have displayed the count of valid inputs and  imported them in a seperate file.  

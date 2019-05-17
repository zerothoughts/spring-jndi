# spring-jndi
Proof of concept exploit, showing how to do bytecode injection through untrusted deserialization with Spring Framework 4.2.4

Check out writeup for more information: http://zerothoughts.tumblr.com/post/137831000514/spring-framework-deserialization-rce

# Added by forker
It's great work by the original, and a good place to start learning Java Deserialization Exploits. But...
There's a problem when you test this on two different machines:
- There's a mistake in the code, and I changed it.
- You have to add `-Djava.rmi.server.hostname=YOURIP` so that the client can find the rmi service


The original repo is 3 years old, don't know whether the author is still interested in chang it. XD

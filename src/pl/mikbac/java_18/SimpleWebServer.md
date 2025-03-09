# Simple Web Server

https://openjdk.org/jeps/408

```shell
jwebserver -p 9000
```

```jshelllanguage
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.SimpleFileServer;

import java.net.InetSocketAddress;
import java.nio.file.Path;
    HttpServer server = SimpleFileServer.createFileServer(new InetSocketAddress(9000), Path.of("C:/.../Java-new-features/src/pl/mikbac/java_18/"), SimpleFileServer.OutputLevel.VERBOSE);
    server.start()
```

# JShell

Via IntelliJ IDEA `Tools | JShell Console`.

```jshelllanguage
int value = 1; String template = "value: %s";System.out.printf(template, value)
```

```jshelllanguage
import java.util.stream.Stream;Stream.of("aaa1", "bbb2").filter(e -> e.contains("1")).forEach(System.out::println);
```

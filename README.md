# sonar-fix-ai

This repository demonstrates creating a simple Sonar issue (resource leak) and resolving it with AI.

**Demo steps**

- **Sonar issue:** `src/demo/BadResource.java` contains a resource leak (a `FileInputStream` opened and never closed).
- **Fix:** `src/demo/FixedResource.java` rewrites the method using try-with-resources to ensure the stream is closed.
- **Feature toggle:** `config/feature_flags.yaml` enables "Claude Haiku 4.5" for all clients as a demo configuration change.

To compile and run the examples (requires Java 8+):

```bash
javac -d out src/demo/BadResource.java src/demo/FixedResource.java
java -cp out demo.BadResource
java -cp out demo.FixedResource
```

Files created:

- `src/demo/BadResource.java` — vulnerable example.
- `src/demo/FixedResource.java` — fixed example.
- `config/feature_flags.yaml` — demo config enabling Claude Haiku 4.5 for all clients.

Use this repository as a demo to show how an AI can identify a Sonar rule violation and apply a minimal, correct fix.
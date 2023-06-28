# cde-demo

## Container Demo

Das Projekt `ctr-demo` ist zwar als Maven-Modul ausgelegt enthält aber lediglich ein `Dockerfile` im Verzeichnis `src/main/docker`.

Dieses kann mit dem Befehl `docker build -f src/main/docker/Dockerfile -t gedoplan/ctr-demo .` gebaut werden.

Anschließend kann es mit `docker run -p 8082:8081 <tag>` ausgeführt werden.

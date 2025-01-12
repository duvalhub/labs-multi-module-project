(docker stop 'mon-truc' || true) && \
(docker rm 'mon-truc' || true) && \
docker build -t 'hello-world-image-2025' . && \
docker run --name 'mon-truc' 'hello-world-image-2025'
echo

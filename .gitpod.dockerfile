FROM gitpod/workspace-full-vnc

RUN sudo apt-get update \
 && sudo apt-get install -y \
    libasound2-dev \   
    libgtk-3-dev \   
    libnss3-dev \
    chromium-browser \
    --disable-setuid-sandbox \
    --no-sandbox \
 && sudo rm -rf /var/lib/apt/lists/*

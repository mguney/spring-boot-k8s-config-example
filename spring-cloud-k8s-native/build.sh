#!/bin/bash

mvn clean package -DskipTests && \
      docker build -t springkubernetesnative . && \
        kubectl apply -f k8s.yaml
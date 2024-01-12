#!/bin/bash

mvn clean package -DskipTests && \
      docker build -t springkubernetes . && \
        kubectl apply -f k8s.yaml
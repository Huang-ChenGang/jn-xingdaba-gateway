#!/usr/bin/env bash

gradle clean -x test build

docker build --no-cache -t xingdaba/xingdaba-gateway .

docker tag xingdaba/xingdaba-gateway hub.c.163.com/riyuexingchenace/xingdaba/xingdaba-gateway:latest

docker push hub.c.163.com/riyuexingchenace/xingdaba/xingdaba-gateway:latest

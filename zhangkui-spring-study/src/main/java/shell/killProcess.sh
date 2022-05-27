#!/usr/bin/env sh

port=$1
echo "要处理的端口号是：" $port

# shellcheck disable=SC2037
echo `lsof -i:3306`
echo pid

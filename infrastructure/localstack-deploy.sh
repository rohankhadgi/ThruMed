#!/bin/bash

set -e # Stops the script in any command fails

aws --endpoint-url=http://localhost:4566 cloudformation delete-stack \
    --stack-name ThruMed

aws --endpoint-url=http://localhost:4566 cloudformation deploy \
    --stack-name ThruMed \
    --template-file "./cdk.out/localstack.template.json"

aws --endpoint-url=http://localhost:4566 elbv2 describe-load-balancers \
    --query "LoadBalancers[0].DNSName" --output text
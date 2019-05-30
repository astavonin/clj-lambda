# clj-lambda

Clojure AWS lambda + Terraform example project.

## Usage

Build and upload:

```bash
lein uberjar
cd terraform
terraform init
terraform plan
terraform apply
```

Invoke AWS Lambda:

```bash
aws lambda invoke --invocation-type RequestResponse --function-name clj-lambda --region us-west-2 --log-type Tail --payload '{"some":"input"}' outfile.txt
```

Destroy AWS environment:

```bash
terraform destroy
```
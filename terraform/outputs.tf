output "aws-cli" {
  value = "aws lambda invoke --invocation-type RequestResponse --function-name clj-lambda --region us-west-2 --log-type Tail --payload '{\"some\":\"input\"}' outfile.txt"
}

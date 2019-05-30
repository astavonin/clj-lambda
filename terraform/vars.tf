variable "lambda_payload_filename" {
  default = "../target/clj-lambda.jar"
}

variable "lambda_function_handler" {
  default = "clj-lambda.lambda.LambdaFn"
}

variable "lambda_runtime" {
  default = "java8"
}

variable "lambda_memory" {
  default = "512"
}

variable "region" {
  default = "us-west-2"
}

variable "lambda_timeout" {
  default = 900
}
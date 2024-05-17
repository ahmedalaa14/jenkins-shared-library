# Jenkins Shared Library Project

- This project contains a Jenkins shared library for automating CI/CD pipelines. The library is used to define reusable pipeline components and functions to streamline the development, build, and deployment processes.

## Description

- The Jenkins shared library is loaded from a Git repository and includes functions for building a vars file, building and pushing a Docker image, and deploying an application.

## Usage

- To use this shared library in your Jenkins pipeline, follow these steps:

1. Import the library in your pipeline script.
2. Define the stages of your pipeline using the provided functions.

# Jenkins CI/CD Pipeline

A simple Java app where every push to GitHub automatically triggers Jenkins to test, build and deploy it.

## Tools
- Java + JUnit (testing)
- Maven (build)
- Jenkins (pipeline)
- GitHub (source code)
- AWS EC2 (deployment server)

## Pipeline Stages
1. **Checkout**: pulls the code from GitHub
2. **Test**: runs the JUnit tests
3. **Build**: packages the app into a jar file
4. **Deploy**: copies the jar to EC2 and runs it

If a test fails, the Build and Deploy stages do not run.

## How it works
1. Push code to GitHub
2. Jenkins detects the change (Poll SCM)
3. The pipeline runs and the app is deployed to EC2

# Basic Play application with a single endpoint

## How to run
Development mode:
```bash
sbt run
```

Production mode:
```bash
sbt stage
target/universal/stage/bin/numberwang-play -Dhttp.port=${PORT}
```

## Environment
This application can be configured via environment variables. Additionally, you can configure the environment by providing a `.env` file. A sample file of what can be configured is given in the form of `.env.sample`

## Interface
This application provides (next to the standard `/assets`) a single endpoint on `/numberwang`. Currently, this endpoint only prints a silly message.

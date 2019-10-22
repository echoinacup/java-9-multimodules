#!/usr/bin/env bash
javac -d out --module-source-path /*/src/main/java/ $(find . -name "*.java")

java --module-path out -m main.module/main.module.MainApp


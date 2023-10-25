# maven-jxr-plugin Example Project

This project demonstrates the issue with maven-jxr-plugin and classes with
multiple `@SuppressWarnings` annotations.

## My Environment

* Windows 10 Pro
* JDK 11
* Maven v3.9.5
* maven-jxr-plugin v3.3.1

## Building the project

```bash
mvn clean verify site
```
## Results

The resulting Source Xref page lists the classes `Name` and `NameLoader`,
but does not include `NameFormatter`. `Name` has no `@SuppressWarnings`
annotation, and `NameLoader` has a single `@SuppressWarnings` annotation.
`NameFormatter` has multiple warning suppressions in the form:
```agsl
@SuppressWarnings({"PMD.AvoidLiteralsInIfCondition", "PMD.OnlyOneReturn", "PMD.LiteralsFirstInComparisons"})
```

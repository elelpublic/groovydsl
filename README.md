# groovydsl

Proof of concept for generating a DSL with groovy.

Requirements:

* Use of dsl in groovy interpreter (not compiled)
* Define Domain Model in Java (not groovy)

## history

```
mvn archetype:generate -DgroupId=com.infodesire.groovydsl -DartifactId=groovydsl -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

# after adding dependency
mvn dependency:resolve
```

## build

```
mvn verify
```

## run

```
mvn verify exec:java
```
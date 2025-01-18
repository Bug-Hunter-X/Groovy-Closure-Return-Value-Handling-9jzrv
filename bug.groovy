```groovy
def someMethod(Closure c) {
  c() 
}

someMethod {println it}

someMethod { println it; return 10}
```
```groovy
def someMethod(Closure c) {
  def result = c() 
  println "Closure returned: $result" //Handle and use the returned value if needed
  return result //Or return the result as needed
}

someMethod {println it}

someMethod { println it; return 10}
```
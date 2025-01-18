# Groovy Closure Return Value Handling
This example demonstrates unexpected behavior when a closure passed to a method returns a value, and the method doesn't explicitly handle that return value.  This can lead to subtle bugs if not carefully considered.

## Bug Description
The `someMethod` function accepts a closure as an argument and executes it.  However, if the closure returns a value, that value is ignored, potentially leading to unexpected results or silent failures.

## Solution
To address this issue, the `someMethod` function needs to be modified to handle potential return values from the closure.
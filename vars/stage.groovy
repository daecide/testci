def call(String name, Closure closure) {
    echo "HELLO"
    try {
        return steps.stage(name, closure)
    } finally {
        echo "WORLD"
    }
}
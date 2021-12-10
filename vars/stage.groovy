def call(String name, Closure closure) {
    echo "HELLO"
    try {
        return this.stage(name, closure)
    } finally {
        echo "WORLD"
    }
}
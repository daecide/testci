def call(String name, Closure closure) {
    echo "HELLO"
    try {
        this.stage(name, closure)
    } finally {
        echo "WORLD"
    }
}
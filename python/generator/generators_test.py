from simple_generator import simple_generator
from fibonacci_generator import fibonacci_generator


def test_simple_generator():
    generator = simple_generator()
    one = generator.__next__()
    two = generator.__next__()
    three = generator.__next__()
    assert one == 1
    assert two == 2
    assert three == 3


def test_fibonacci_generator():
    numbers = [i for i in fibonacci_generator(6)]
    assert numbers == [0, 1, 1, 2, 3, 5]

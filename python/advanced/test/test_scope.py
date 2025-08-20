from advanced.scope import function_with_local_x, x, function_with_global_x


def test_scopes():
    x_local = function_with_local_x()
    assert x_local == 200, "Local x should be 200"
    assert x == 100, "Global x should remain 100 after function call"


def test_global_scope():
    assert x == 100, "Initial global x should be 100"
    x_global = function_with_global_x()
    assert x_global == 300, "Global x should be changed to 300"
    assert x == 100, "Global x should still be 100 after function call because it is reloaded??"
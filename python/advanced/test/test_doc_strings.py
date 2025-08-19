from advanced.doc_strings import my_function

def test_doc_string():
    result = my_function.__doc__
    assert """Print arguments.

Parameters:
arg1: first argument
arg2: second argument. Defaults to None.
""" == result

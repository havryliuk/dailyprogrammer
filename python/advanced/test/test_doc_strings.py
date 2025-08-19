from advanced.doc_strings import my_function

def test_doc_string():
    result = my_function.__doc__
    assert "dfda" == result

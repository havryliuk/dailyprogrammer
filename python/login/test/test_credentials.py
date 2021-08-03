from login.credentials import Credentials


def test_create_credentials():
    credentials = Credentials('username', 'password')
    assert credentials.username == 'username'
    assert credentials.password == 'password'

import pytest


@pytest.fixture(scope="session")
def session_fixture():
    print('scope="session" fixture started')
    yield
    print('scope="session" fixture stopped')



#In pytest, scope="session" is used with fixtures to indicate that the fixture should be:

#Created only once for the entire test session (i.e., when pytest runs across one or more test files).

#Shared across all tests, modules, and even packages during that session.

import pytest


@pytest.fixture() #scope="module" runs pytest only once, scope="function" also runs before every function which is also the default.
def preWork():
    print("I am fixture")

@pytest.fixture()
def eg_of_yield():
    print("I am before yield")    #Setup/TearUp
    yield print("I am Yield")     #return
    print("I am after yield")     #teardown

def test_fun1(preWork):
    print("I am function 1")


def fun2():
    print("I am function 2")
fun2()

#pytest collects and runs test functions (test_*).

#fun2() is not a test function, so pytest ignores it unless it's called within a test or fixture.


def test_fun3(preWork):
    print("I am function 3")


def test_fun4(session_fixture):
    print("I am function 4")

def test_fun5(session_fixture,eg_of_yield):    #two fixtures in the argument.
    print("I am function 5")


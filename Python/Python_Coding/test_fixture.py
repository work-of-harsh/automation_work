import pytest

@pytest.fixture(params=[1, 2], scope="class")
def fix(request):
    print("before")
    yield request.param
    print("after")

def test_a(fix):
    print(f"met a: {fix}")
    assert True

def test_b(fix):
    print(f"met b: {fix}")
    assert fix != 1  # This will fail for fix=1

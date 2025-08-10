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



@pytest.mark.parametrize("x,y",[(1, 'a'), (2, 'b'), (3, 'c')])
def test_example(x,y):
    print(f"{x}  {y}")


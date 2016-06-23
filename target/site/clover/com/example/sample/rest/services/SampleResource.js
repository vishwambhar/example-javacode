var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":44,"methods":[{"el":31,"sc":5,"sl":27},{"el":42,"sc":5,"sl":33}],"name":"SampleResource","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":33}],"name":"testGetPing","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1], [], [], [], [1], [1], [1], [1], [1], [], []]

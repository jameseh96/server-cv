return {
CMAKE_ARGS="${CMAKE_ARGS} " +
           "-DPHOSPHOR_DISABLE=ON"
// 03.01.2020:
// Set warning threshold to 1 as we have 1 -Wtautological-compare warning
// in mad-hatter as we need to cherry-pick the fix from master. So for now
// just suppress the warning.
WARNING_THRESHOLD=1
TESTS_EXCLUDE="memcached-spdlogger-test"

// Disable magma support - we don't ship with it in mad-hatter and it is
// currently failing on macOS XCode 9.3
CMAKE_ARGS="${CMAKE_ARGS} " + "-DEP_USE_MAGMA=0"

// Disable RocksDB support - we don't ship with it in mad-hatter and some of
// the tests are intermittently failing.
CMAKE_ARGS="${CMAKE_ARGS} " + "-DEP_USE_ROCKSDB=0"
}

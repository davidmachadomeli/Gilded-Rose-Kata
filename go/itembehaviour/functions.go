package itembehaviour

import "math"

func AddQualityLimitedTo50(quality int) int {
	return int(math.Min(float64(quality + 1), float64(50)))
}

func LimitTo50(quality int) int {
	return int(math.Min(float64(quality), float64(50)))
}

func LimitTo0(quality int) int {
	return int(math.Max(float64(quality), float64(0)))
}

package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartHistogram: ImageVector? = null

val Icons.Rs.ChartHistogram: ImageVector
    get() = _ChartHistogram ?: UXIcon(name = "ChartHistogram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 21.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineTo(20.98f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4.41f)
                lineToRelative(5f, 5f)
                lineToRelative(7.71f, -7.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-6.29f, 6.29f)
                lineToRelative(-5f, -5f)
                lineToRelative(-5.71f, 5.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.29f, -4.29f)
                close()
            }
        }.also { _ChartHistogram = it}

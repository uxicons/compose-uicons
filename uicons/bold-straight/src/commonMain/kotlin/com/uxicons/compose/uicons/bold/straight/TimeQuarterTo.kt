package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeQuarterTo: ImageVector? = null

val Icons.Bs.TimeQuarterTo: ImageVector
    get() = _TimeQuarterTo ?: UXIcon(name = "TimeQuarterTo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 0f)
                arcToRelative(12.17f, 12.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, -1.71f)
                lineToRelative(2.97f, 0.42f)
                arcToRelative(9.16f, 9.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.09f, 1.28f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, -9f)
                arcToRelative(9.16f, 9.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.28f, 0.09f)
                lineToRelative(-0.42f, -2.97f)
                arcToRelative(12.17f, 12.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.71f, -0.12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                close()
                moveTo(8.49f, 3.71f)
                lineTo(7.33f, 0.94f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.65f, 1.55f)
                lineToRelative(1.83f, 2.37f)
                arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.99f, -1.16f)
                close()
                moveTo(4.87f, 6.5f)
                lineTo(2.5f, 4.67f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 2.65f)
                lineToRelative(2.76f, 1.17f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.17f, -1.99f)
                close()
                moveTo(10.5f, 6f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.69f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.81f, -2.81f)
                verticalLineToRelative(-4.69f)
                close()
            }
        }.also { _TimeQuarterTo = it}

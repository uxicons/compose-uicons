package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Euro: ImageVector? = null

val Icons.Bs.Euro: ImageVector
    get() = _Euro ?: UXIcon(name = "Euro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.05f, -5f)
                horizontalLineToRelative(10.05f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-10.94f)
                arcToRelative(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(10.94f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-10.05f)
                arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.99f, -1.73f)
                lineToRelative(2.31f, -1.91f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.56f, 3.64f)
                horizontalLineToRelative(-2.7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.05f)
                curveToRelative(-0.03f, 0.33f, -0.05f, 0.66f, -0.05f, 1f)
                reflectiveCurveToRelative(0.02f, 0.67f, 0.05f, 1f)
                horizontalLineToRelative(-2.05f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.7f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.56f, 3.64f)
                lineToRelative(-2.31f, -1.91f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.94f, 3.27f)
                close()
            }
        }.also { _Euro = it}

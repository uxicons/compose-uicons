package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForward: ImageVector? = null

val Icons.Bs.TimeForward: ImageVector
    get() = _TimeForward ?: UXIcon(name = "TimeForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.47f, 3.53f)
                lineToRelative(2.53f, -2.53f)
                verticalLineToRelative(5.91f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.09f, 1.09f)
                horizontalLineToRelative(-5.91f)
                lineToRelative(2.35f, -2.35f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.65f, 6.35f)
                horizontalLineToRelative(3f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 7f)
                verticalLineToRelative(6.62f)
                lineToRelative(3.44f, 3.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.56f, -2.56f)
                verticalLineToRelative(-5.38f)
                close()
            }
        }.also { _TimeForward = it}

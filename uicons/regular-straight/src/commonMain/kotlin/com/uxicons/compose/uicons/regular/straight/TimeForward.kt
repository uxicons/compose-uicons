package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForward: ImageVector? = null

val Icons.Rs.TimeForward: ImageVector
    get() = _TimeForward ?: UXIcon(name = "TimeForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 3.08f)
                verticalLineToRelative(-3.08f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.14f)
                arcToRelative(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.86f, 1.86f)
                horizontalLineToRelative(-5.14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.12f)
                arcToRelative(9.98f, 9.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.88f, 7f)
                horizontalLineToRelative(2f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 7f)
                verticalLineToRelative(5.41f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.71f, -2.71f)
                verticalLineToRelative(-4.59f)
                close()
            }
        }.also { _TimeForward = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeCheck: ImageVector? = null

val Icons.Bs.TimeCheck: ImageVector
    get() = _TimeCheck ?: UXIcon(name = "TimeCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.48f, 23.3f)
                lineToRelative(6.51f, -6.51f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-6.08f, 6.08f)
                lineToRelative(-3.1f, -3.19f)
                lineToRelative(-2.16f, 2.08f)
                lineToRelative(3.51f, 3.62f)
                arcToRelative(2.38f, 2.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 0.75f)
                horizontalLineToRelative(0.04f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, -0.7f)
                close()
                moveTo(10f, 6f)
                verticalLineToRelative(5.38f)
                lineToRelative(-2.56f, 2.56f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.44f, -3.44f)
                verticalLineToRelative(-6.62f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 23.61f)
                verticalLineToRelative(-3.13f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.94f, -7.47f)
                horizontalLineToRelative(3.01f)
                curveToRelative(0.03f, -0.33f, 0.05f, -0.66f, 0.05f, -1f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
            }
        }.also { _TimeCheck = it}

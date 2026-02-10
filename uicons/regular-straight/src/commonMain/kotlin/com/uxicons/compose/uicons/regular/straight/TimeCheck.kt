package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeCheck: ImageVector? = null

val Icons.Rs.TimeCheck: ImageVector
    get() = _TimeCheck ?: UXIcon(name = "TimeCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.4f, 24f)
                horizontalLineToRelative(-0.03f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, -0.6f)
                lineToRelative(-3.17f, -3.26f)
                lineToRelative(1.45f, -1.38f)
                lineToRelative(3.1f, 3.2f)
                lineToRelative(6.08f, -6.08f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-6.16f, 6.16f)
                arcToRelative(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, 0.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 6f)
                verticalLineToRelative(4.59f)
                lineToRelative(-2.71f, 2.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.29f, -3.29f)
                verticalLineToRelative(-5.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 23.95f)
                verticalLineToRelative(-2f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.95f, -8.95f)
                horizontalLineToRelative(2f)
                curveToRelative(0.03f, -0.33f, 0.05f, -0.66f, 0.05f, -1f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
            }
        }.also { _TimeCheck = it}

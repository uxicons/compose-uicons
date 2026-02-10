package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeFast: ImageVector? = null

val Icons.Rr.TimeFast: ImageVector
    get() = _TimeFast ?: UXIcon(name = "TimeFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 24f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 20f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 16f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 23.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, -2f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -10.87f, -10.87f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.99f, -0.18f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.95f, 1.09f)
                arcToRelative(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.91f, 11.95f)
                curveToRelative(-0.03f, 0.0f, -0.06f, 0.0f, -0.09f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 0.71f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineToRelative(-2.71f, -2.71f)
                verticalLineToRelative(-4.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
        }.also { _TimeFast = it}

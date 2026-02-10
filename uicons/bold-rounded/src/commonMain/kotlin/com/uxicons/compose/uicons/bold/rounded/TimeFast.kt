package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeFast: ImageVector? = null

val Icons.Br.TimeFast: ImageVector
    get() = _TimeFast ?: UXIcon(name = "TimeFast") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.5f, 24f)
            horizontalLineToRelative(-8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7.5f, 19f)
            horizontalLineToRelative(-6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5.5f, 14f)
            horizontalLineToRelative(-4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.5f, 23.72f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.35f, -2.96f)
            arcToRelative(9.02f, 9.02f, 0f, isMoreThanHalf = true, isPositiveArc = false, -10.3f, -12.62f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.71f, -1.28f)
            arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.72f, 16.82f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.35f, 0.04f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.5f, 6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineToRelative(4.29f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.59f, 1.41f)
            lineToRelative(1.79f, 1.79f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            lineToRelative(-1.5f, -1.5f)
            verticalLineToRelative(-3.88f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
        }
    }.also { _TimeFast = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeDropper: ImageVector? = null

val Icons.Br.EyeDropper: ImageVector
    get() = _EyeDropper ?: UXIcon(name = "EyeDropper") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.96f, 6.02f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.99f)
            arcToRelative(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.98f, 0f)
            lineToRelative(-1.44f, 1.44f)
            curveToRelative(-0.83f, 0.83f, -2.72f, 0.6f, -3.98f, -0.1f)
            arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.65f, 4.94f)
            lineToRelative(1.08f, 1.08f)
            lineToRelative(-7.82f, 8.05f)
            arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.92f, 4.19f)
            lineToRelative(-0.81f, 0.81f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(0.71f, -0.71f)
            arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.58f, -0.77f)
            lineToRelative(7.8f, -8.04f)
            lineToRelative(1.05f, 1.05f)
            arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.93f, -3.65f)
            curveToRelative(-0.7f, -1.27f, -0.93f, -3.15f, -0.1f, -3.98f)
            close()
            moveTo(5.71f, 19.98f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.4f, -1.43f)
            lineToRelative(7.8f, -8.04f)
            lineToRelative(1.41f, 1.41f)
            close()
            moveTo(20.85f, 3.9f)
            lineTo(19.41f, 5.33f)
            curveToRelative(-1.93f, 1.93f, -1.67f, 5.26f, -0.45f, 7.64f)
            arcToRelative(0.11f, 0.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.15f, 0f)
            lineToRelative(-7.78f, -7.78f)
            curveToRelative(-0.03f, -0.04f, -0.03f, -0.12f, 0.09f, -0.19f)
            curveToRelative(2.29f, 1.26f, 5.62f, 1.52f, 7.55f, -0.41f)
            lineToRelative(1.44f, -1.44f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.74f, 0.74f)
            close()
        }
    }.also { _EyeDropper = it }

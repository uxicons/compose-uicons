package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Br.Bird: ImageVector
    get() = _Bird ?: UXIcon(name = "Bird") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.29f, 6.22f)
            lineToRelative(-1.37f, -0.59f)
            curveTo(21.48f, 2.46f, 18.76f, 0.01f, 15.48f, 0.01f)
            curveTo(11.89f, 0.01f, 8.98f, 2.93f, 8.98f, 6.51f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            curveToRelative(-1.38f, 0f, -3f, -0.66f, -3f, -2.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(-0.02f, 6.68f, -0.02f, 7.51f)
            verticalLineToRelative(3.5f)
            curveTo(-0.02f, 16.04f, 3.37f, 20.29f, 7.98f, 21.6f)
            verticalLineToRelative(0.92f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0.68f, 0f, 1.35f, -0.06f, 2f, -0.18f)
            verticalLineToRelative(0.68f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.7f)
            curveToRelative(3.56f, -1.82f, 6f, -5.53f, 6f, -9.8f)
            verticalLineToRelative(-2.14f)
            lineToRelative(1.31f, -0.56f)
            curveToRelative(0.42f, -0.18f, 0.69f, -0.59f, 0.69f, -1.04f)
            reflectiveCurveToRelative(-0.27f, -0.87f, -0.69f, -1.04f)
            close()
            moveTo(5.98f, 13.01f)
            curveToRelative(1.09f, 0f, 2.12f, -0.29f, 3f, -0.81f)
            verticalLineToRelative(0.23f)
            curveToRelative(0f, 2.17f, -1.73f, 3.93f, -3.88f, 4.0f)
            curveToRelative(-1.02f, -1.1f, -1.73f, -2.49f, -2.0f, -4.03f)
            curveToRelative(0.84f, 0.39f, 1.81f, 0.61f, 2.88f, 0.61f)
            close()
            moveTo(18.98f, 11.01f)
            curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
            curveToRelative(-0.92f, 0f, -1.8f, -0.16f, -2.63f, -0.44f)
            curveToRelative(2.16f, -1.19f, 3.63f, -3.49f, 3.63f, -6.13f)
            verticalLineToRelative(-5.92f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(4.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.48f, 6.51f)
            moveToRelative(-1.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
        }
    }.also { _Bird = it }

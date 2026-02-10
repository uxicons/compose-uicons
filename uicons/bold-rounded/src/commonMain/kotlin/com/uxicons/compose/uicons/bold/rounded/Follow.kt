package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Follow: ImageVector? = null

val Icons.Br.Follow: ImageVector
    get() = _Follow ?: UXIcon(name = "Follow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.5f, 9.5f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            close()
            moveTo(16.5f, 6f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(23.95f, 10.86f)
            curveToRelative(0.04f, 0.38f, 0.05f, 0.76f, 0.05f, 1.14f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
            reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
            curveToRelative(0.38f, 0f, 0.77f, 0.02f, 1.14f, 0.05f)
            curveToRelative(0.82f, 0.08f, 1.43f, 0.81f, 1.35f, 1.63f)
            reflectiveCurveToRelative(-0.81f, 1.43f, -1.63f, 1.35f)
            curveToRelative(-0.28f, -0.03f, -0.57f, -0.04f, -0.86f, -0.04f)
            curveToRelative(-4.96f, 0.0f, -9.0f, 4.04f, -9.0f, 9.0f)
            curveToRelative(0f, 2.82f, 1.31f, 5.34f, 3.35f, 7.0f)
            curveToRelative(0.83f, -2.33f, 3.04f, -4.0f, 5.65f, -4.0f)
            reflectiveCurveToRelative(4.82f, 1.67f, 5.65f, 4.0f)
            curveToRelative(2.04f, -1.65f, 3.35f, -4.17f, 3.35f, -7.0f)
            curveToRelative(0f, -0.29f, -0.01f, -0.58f, -0.04f, -0.86f)
            curveToRelative(-0.08f, -0.82f, 0.53f, -1.56f, 1.35f, -1.64f)
            curveToRelative(0.81f, -0.09f, 1.56f, 0.53f, 1.64f, 1.35f)
            close()
            moveTo(12f, 21f)
            curveToRelative(1.03f, 0f, 2.02f, -0.18f, 2.95f, -0.51f)
            curveToRelative(-0.24f, -1.41f, -1.47f, -2.49f, -2.95f, -2.49f)
            reflectiveCurveToRelative(-2.71f, 1.08f, -2.95f, 2.49f)
            curveToRelative(0.93f, 0.32f, 1.92f, 0.51f, 2.95f, 0.51f)
            close()
        }
    }.also { _Follow = it }

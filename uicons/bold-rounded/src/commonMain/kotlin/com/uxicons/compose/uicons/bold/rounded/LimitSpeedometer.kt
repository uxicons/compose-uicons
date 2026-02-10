package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LimitSpeedometer: ImageVector? = null

val Icons.Br.LimitSpeedometer: ImageVector
    get() = _LimitSpeedometer ?: UXIcon(name = "LimitSpeedometer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 12f)
            curveToRelative(0f, 0.77f, -0.07f, 1.54f, -0.22f, 2.28f)
            curveToRelative(-0.16f, 0.81f, -0.94f, 1.34f, -1.76f, 1.19f)
            curveToRelative(-0.81f, -0.16f, -1.35f, -0.94f, -1.19f, -1.76f)
            curveToRelative(0.11f, -0.56f, 0.16f, -1.14f, 0.16f, -1.72f)
            curveToRelative(0f, -2.56f, -1.09f, -5.01f, -3.0f, -6.71f)
            curveToRelative(-1.94f, -1.73f, -4.43f, -2.51f, -7.04f, -2.23f)
            curveToRelative(-4.05f, 0.46f, -7.37f, 3.72f, -7.88f, 7.76f)
            curveToRelative(-0.31f, 2.44f, 0.35f, 4.83f, 1.85f, 6.74f)
            curveToRelative(0.24f, 0.3f, 0.59f, 0.49f, 0.98f, 0.53f)
            curveToRelative(0.41f, 0.04f, 0.82f, -0.08f, 1.14f, -0.35f)
            lineToRelative(0.46f, -0.38f)
            curveToRelative(0.64f, -0.53f, 1.58f, -0.45f, 2.11f, 0.19f)
            curveToRelative(0.53f, 0.64f, 0.45f, 1.58f, -0.19f, 2.11f)
            lineToRelative(-0.46f, 0.38f)
            curveToRelative(-0.81f, 0.69f, -1.86f, 1.06f, -2.92f, 1.06f)
            curveToRelative(-0.15f, 0f, -0.3f, -0.01f, -0.46f, -0.02f)
            curveToRelative(-1.21f, -0.12f, -2.28f, -0.71f, -3.03f, -1.66f)
            curveTo(0.56f, 16.87f, -0.31f, 13.68f, 0.1f, 10.44f)
            curveTo(0.79f, 5.04f, 5.21f, 0.69f, 10.62f, 0.08f)
            curveToRelative(3.42f, -0.38f, 6.83f, 0.7f, 9.38f, 2.97f)
            curveToRelative(2.54f, 2.27f, 4.0f, 5.54f, 4.0f, 8.95f)
            close()
            moveTo(14f, 12f)
            curveToRelative(0f, -1.04f, -0.8f, -1.89f, -1.82f, -1.98f)
            lineToRelative(-2.62f, -2.59f)
            curveToRelative(-0.59f, -0.58f, -1.54f, -0.57f, -2.12f, 0.02f)
            reflectiveCurveToRelative(-0.57f, 1.54f, 0.01f, 2.12f)
            lineToRelative(2.56f, 2.53f)
            curveToRelative(0.05f, 1.06f, 0.92f, 1.91f, 1.99f, 1.91f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            close()
            moveTo(22.95f, 21.66f)
            curveToRelative(0.61f, 1.04f, -0.14f, 2.34f, -1.35f, 2.34f)
            horizontalLineToRelative(-9.2f)
            curveToRelative(-1.2f, 0f, -1.95f, -1.3f, -1.35f, -2.34f)
            lineToRelative(4.6f, -7.88f)
            curveToRelative(0.6f, -1.03f, 2.09f, -1.03f, 2.69f, 0f)
            lineToRelative(4.6f, 7.88f)
            close()
            moveTo(18f, 22f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            close()
            moveTo(18f, 17f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-2f)
            close()
        }
    }.also { _LimitSpeedometer = it }

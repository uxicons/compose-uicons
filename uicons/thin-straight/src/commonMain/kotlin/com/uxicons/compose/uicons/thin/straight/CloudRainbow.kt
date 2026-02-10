package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudRainbow: ImageVector? = null

val Icons.Ts.CloudRainbow: ImageVector
    get() = _CloudRainbow ?: UXIcon(name = "CloudRainbow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 24f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.8f, 1.37f, -3.29f, 3.12f, -3.48f)
                curveToRelative(-0.08f, -0.34f, -0.12f, -0.68f, -0.12f, -1.02f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(2.39f, 0f, 4.42f, 1.7f, 4.88f, 4.02f)
                curveToRelative(2.31f, 0.19f, 4.12f, 2.13f, 4.12f, 4.48f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(3.5f, 18f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(12.5f, 23f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.56f, -3.48f, -3.47f, -3.5f)
                lineToRelative(-0.53f, 0.01f)
                lineToRelative(-0.05f, -0.45f)
                curveToRelative(-0.23f, -2.03f, -1.93f, -3.56f, -3.95f, -3.56f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.43f, 0.08f, 0.86f, 0.25f, 1.33f)
                lineToRelative(0.24f, 0.67f)
                horizontalLineToRelative(-0.98f)
                close()
                moveTo(17.48f, 15.38f)
                curveToRelative(0.23f, 0.28f, 0.43f, 0.57f, 0.61f, 0.88f)
                curveToRelative(1.24f, -1.95f, 3.42f, -3.25f, 5.9f, -3.25f)
                verticalLineToRelative(-1f)
                curveToRelative(-2.69f, 0f, -5.07f, 1.34f, -6.52f, 3.38f)
                close()
                moveTo(7.29f, 9.04f)
                curveToRelative(0.23f, -0.02f, 0.47f, -0.04f, 0.71f, -0.04f)
                curveToRelative(0.17f, 0f, 0.34f, 0.03f, 0.51f, 0.04f)
                curveTo(11.95f, 4.18f, 17.61f, 1f, 24f, 1f)
                lineTo(24f, 0f)
                curveTo(17.02f, 0f, 10.87f, 3.6f, 7.29f, 9.04f)
                close()
                moveTo(14.28f, 12.99f)
                curveToRelative(0.05f, 0.1f, 0.11f, 0.2f, 0.16f, 0.31f)
                curveToRelative(0.23f, 0.07f, 0.44f, 0.17f, 0.66f, 0.27f)
                curveToRelative(2f, -2.76f, 5.24f, -4.57f, 8.9f, -4.57f)
                verticalLineToRelative(-1f)
                curveToRelative(-4.0f, 0f, -7.54f, 1.97f, -9.72f, 4.99f)
                close()
                moveTo(11.54f, 9.99f)
                curveToRelative(0.29f, 0.17f, 0.56f, 0.36f, 0.82f, 0.57f)
                curveToRelative(2.75f, -3.39f, 6.95f, -5.56f, 11.64f, -5.56f)
                verticalLineToRelative(-1f)
                curveToRelative(-5.04f, 0f, -9.53f, 2.34f, -12.46f, 5.99f)
                close()
            }
        }.also { _CloudRainbow = it}

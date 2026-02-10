package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tap: ImageVector? = null

val Icons.Ts.Tap: ImageVector
    get() = _Tap ?: UXIcon(name = "Tap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 11.18f)
                curveToRelative(-1.23f, -1.18f, -2f, -2.84f, -2f, -4.68f)
                curveTo(3f, 2.92f, 5.92f, 0f, 9.5f, 0f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                curveToRelative(0f, 1.84f, -0.77f, 3.5f, -2f, 4.68f)
                verticalLineToRelative(-1.53f)
                curveToRelative(0.63f, -0.89f, 1f, -1.98f, 1f, -3.15f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                curveToRelative(0f, 1.17f, 0.37f, 2.26f, 1f, 3.15f)
                verticalLineToRelative(1.53f)
                close()
                moveTo(12f, 12.1f)
                verticalLineToRelative(-6.49f)
                curveToRelative(0f, -1.27f, -0.9f, -2.38f, -2.08f, -2.57f)
                curveToRelative(-0.73f, -0.12f, -1.48f, 0.09f, -2.04f, 0.56f)
                curveToRelative(-0.56f, 0.48f, -0.88f, 1.17f, -0.88f, 1.91f)
                verticalLineToRelative(12.6f)
                lineToRelative(-1.8f, -1.43f)
                curveToRelative(-1.01f, -0.94f, -2.59f, -0.89f, -3.53f, 0.12f)
                curveToRelative(-0.94f, 1.01f, -0.89f, 2.59f, 0.11f, 3.53f)
                lineToRelative(3.86f, 3.67f)
                horizontalLineToRelative(1.45f)
                lineToRelative(-4.62f, -4.4f)
                curveToRelative(-0.6f, -0.57f, -0.64f, -1.52f, -0.07f, -2.12f)
                curveToRelative(0.56f, -0.6f, 1.51f, -0.64f, 2.15f, -0.04f)
                lineToRelative(3.45f, 2.75f)
                lineTo(8.0f, 5.5f)
                curveToRelative(0f, -0.44f, 0.19f, -0.86f, 0.53f, -1.14f)
                curveToRelative(0.34f, -0.29f, 0.78f, -0.41f, 1.23f, -0.34f)
                curveToRelative(0.71f, 0.12f, 1.25f, 0.8f, 1.25f, 1.59f)
                verticalLineToRelative(7.29f)
                lineToRelative(10f, 2.22f)
                verticalLineToRelative(8.88f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-9.68f)
                lineToRelative(-10f, -2.22f)
                close()
            }
        }.also { _Tap = it}

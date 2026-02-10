package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeLashes: ImageVector? = null

val Icons.Sr.EyeLashes: ImageVector
    get() = _EyeLashes ?: UXIcon(name = "EyeLashes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 14f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(23.27f, 16.49f)
                curveToRelative(-1.55f, 2.43f, -5.07f, 6.51f, -11.27f, 6.51f)
                reflectiveCurveToRelative(-9.72f, -4.08f, -11.27f, -6.52f)
                curveToRelative(-0.98f, -1.53f, -0.98f, -3.44f, 0.0f, -4.97f)
                curveToRelative(0.55f, -0.86f, 1.35f, -1.93f, 2.44f, -2.96f)
                lineToRelative(-1.94f, -2.43f)
                curveToRelative(-0.34f, -0.43f, -0.27f, -1.06f, 0.16f, -1.41f)
                curveToRelative(0.43f, -0.34f, 1.06f, -0.28f, 1.41f, 0.16f)
                lineToRelative(1.93f, 2.41f)
                curveToRelative(0.64f, -0.45f, 1.36f, -0.87f, 2.14f, -1.22f)
                lineToRelative(-0.99f, -2.88f)
                curveToRelative(-0.18f, -0.52f, 0.1f, -1.09f, 0.62f, -1.27f)
                curveToRelative(0.52f, -0.18f, 1.09f, 0.1f, 1.27f, 0.62f)
                lineToRelative(0.98f, 2.87f)
                curveToRelative(0.7f, -0.18f, 1.46f, -0.31f, 2.25f, -0.37f)
                verticalLineToRelative(-3.04f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.04f)
                curveToRelative(0.8f, 0.06f, 1.56f, 0.18f, 2.27f, 0.37f)
                lineToRelative(0.98f, -2.87f)
                curveToRelative(0.18f, -0.52f, 0.74f, -0.8f, 1.27f, -0.62f)
                curveToRelative(0.52f, 0.18f, 0.8f, 0.75f, 0.62f, 1.27f)
                lineToRelative(-0.99f, 2.88f)
                curveToRelative(0.77f, 0.34f, 1.47f, 0.75f, 2.11f, 1.2f)
                lineToRelative(1.92f, -2.41f)
                curveToRelative(0.34f, -0.43f, 0.97f, -0.51f, 1.41f, -0.16f)
                curveToRelative(0.43f, 0.34f, 0.5f, 0.97f, 0.16f, 1.41f)
                lineToRelative(-1.94f, 2.43f)
                curveToRelative(1.09f, 1.03f, 1.9f, 2.11f, 2.46f, 2.98f)
                curveToRelative(0.98f, 1.53f, 0.98f, 3.44f, -0.0f, 4.97f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _EyeLashes = it}

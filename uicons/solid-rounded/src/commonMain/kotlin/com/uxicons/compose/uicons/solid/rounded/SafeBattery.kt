package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SafeBattery: ImageVector? = null

val Icons.Sr.SafeBattery: ImageVector
    get() = _SafeBattery ?: UXIcon(name = "SafeBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 10.66f)
                curveToRelative(0f, 0.81f, -1.02f, 2.15f, -2.65f, 3.51f)
                curveToRelative(-0.2f, 0.17f, -0.49f, 0.17f, -0.7f, 0f)
                curveToRelative(-1.64f, -1.36f, -2.65f, -2.7f, -2.65f, -3.51f)
                curveToRelative(0f, -0.64f, 0.45f, -1.16f, 1f, -1.16f)
                curveToRelative(0.78f, 0f, 0.97f, 0.49f, 1.02f, 0.68f)
                curveToRelative(0.08f, 0.47f, 0.49f, 0.8f, 0.96f, 0.81f)
                curveToRelative(0.45f, -0.01f, 0.9f, -0.33f, 1f, -0.79f)
                curveToRelative(0.05f, -0.21f, 0.24f, -0.7f, 1.02f, -0.7f)
                curveToRelative(0.55f, 0f, 1f, 0.52f, 1f, 1.16f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.47f, 2.28f, -2.48f, 4f, -4.9f, 4f)
                horizontalLineToRelative(-12f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(12f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 10.66f)
                curveToRelative(0f, -1.74f, -1.35f, -3.16f, -3f, -3.16f)
                curveToRelative(-0.88f, 0f, -1.53f, 0.29f, -2f, 0.68f)
                curveToRelative(-0.47f, -0.39f, -1.12f, -0.68f, -2f, -0.68f)
                curveToRelative(-1.65f, 0f, -3f, 1.42f, -3f, 3.16f)
                curveToRelative(0f, 1.49f, 1.14f, 3.19f, 3.37f, 5.05f)
                curveToRelative(0.47f, 0.39f, 1.05f, 0.59f, 1.63f, 0.59f)
                reflectiveCurveToRelative(1.16f, -0.2f, 1.62f, -0.59f)
                curveToRelative(2.24f, -1.86f, 3.38f, -3.56f, 3.38f, -5.05f)
                close()
            }
        }.also { _SafeBattery = it}

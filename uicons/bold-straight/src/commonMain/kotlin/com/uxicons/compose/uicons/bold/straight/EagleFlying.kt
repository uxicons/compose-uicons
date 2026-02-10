package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EagleFlying: ImageVector? = null

val Icons.Bs.EagleFlying: ImageVector
    get() = _EagleFlying ?: UXIcon(name = "EagleFlying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.03f)
                verticalLineToRelative(-1.92f)
                lineToRelative(-15f, 3.75f)
                verticalLineToRelative(1.17f)
                curveToRelative(0f, 2.68f, -0.78f, 4.29f, -1.24f, 5f)
                horizontalLineToRelative(-3.77f)
                curveToRelative(-1.61f, 0f, -4f, 1.06f, -4f, 4f)
                horizontalLineToRelative(3.8f)
                curveToRelative(1.11f, 1.29f, 3.64f, 3.94f, 6.23f, 4.75f)
                lineToRelative(-0.74f, 2.34f)
                curveToRelative(-1.09f, 0.26f, -2.29f, 1.11f, -2.29f, 2.91f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.81f, 0.55f, -0.99f, 1f, -1f)
                horizontalLineToRelative(0.57f)
                lineToRelative(1.1f, -1.83f)
                lineToRelative(1.74f, -2.17f)
                horizontalLineToRelative(2.89f)
                lineToRelative(3.43f, 4f)
                reflectiveCurveToRelative(3f, 0.5f, 4f, -1.5f)
                reflectiveCurveToRelative(-1f, -4f, -1f, -4f)
                lineToRelative(-4.29f, -1.48f)
                lineToRelative(-0.96f, -1.93f)
                curveToRelative(4.16f, -2.56f, 6.53f, -5.6f, 6.53f, -12.09f)
                close()
                moveTo(9.12f, 13.03f)
                curveToRelative(0.87f, -0.97f, 2.29f, -1.97f, 2.84f, -6.82f)
                lineToRelative(8.95f, -2.24f)
                curveToRelative(-0.08f, 0.79f, -0.23f, 1.47f, -0.41f, 2.11f)
                lineToRelative(-6.99f, 1.94f)
                horizontalLineToRelative(6.18f)
                curveToRelative(-0.44f, 0.75f, -1.01f, 1.4f, -1.69f, 2f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(3.1f, 1.41f)
                curveToRelative(-0.41f, 0.26f, -0.86f, 0.52f, -1.33f, 0.78f)
                lineToRelative(-1.26f, 0.7f)
                lineToRelative(1.56f, 3.11f)
                horizontalLineToRelative(-3.57f)
                curveToRelative(-1.18f, 0f, -3.06f, -1.48f, -4.55f, -3f)
                close()
            }
        }.also { _EagleFlying = it}

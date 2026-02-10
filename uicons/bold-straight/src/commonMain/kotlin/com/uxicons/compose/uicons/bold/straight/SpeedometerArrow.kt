package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpeedometerArrow: ImageVector? = null

val Icons.Bs.SpeedometerArrow: ImageVector
    get() = _SpeedometerArrow ?: UXIcon(name = "SpeedometerArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.99f, 20.08f)
                curveToRelative(-0.04f, 1.07f, -0.92f, 1.92f, -1.99f, 1.92f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.04f, 0.8f, -1.88f, 1.81f, -1.98f)
                lineToRelative(3.6f, -3.6f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.54f, 3.54f)
                close()
                moveTo(21.0f, 12.12f)
                lineToRelative(0.01f, -5.12f)
                horizontalLineToRelative(2.49f)
                lineToRelative(-3.16f, -3.65f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0f)
                lineToRelative(-3.18f, 3.65f)
                horizontalLineToRelative(2.51f)
                lineToRelative(-0.01f, 2.64f)
                curveToRelative(-1.36f, -0.79f, -2.88f, -1.33f, -4.5f, -1.53f)
                lineToRelative(0.01f, -4.08f)
                horizontalLineToRelative(2.49f)
                lineTo(12.84f, 0.37f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0f)
                lineToRelative(-3.18f, 3.65f)
                horizontalLineToRelative(2.51f)
                lineToRelative(-0.01f, 4.08f)
                curveToRelative(-1.62f, 0.2f, -3.14f, 0.73f, -4.5f, 1.52f)
                lineToRelative(0.01f, -2.63f)
                horizontalLineToRelative(2.49f)
                lineToRelative(-3.16f, -3.65f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0f)
                lineTo(0.5f, 7f)
                horizontalLineToRelative(2.51f)
                lineToRelative(-0.01f, 5.11f)
                curveTo(1.17f, 14.21f, 0.05f, 16.95f, 0.05f, 19.95f)
                curveToRelative(0f, 0.96f, 0.13f, 1.94f, 0.38f, 2.92f)
                lineToRelative(0.29f, 1.13f)
                horizontalLineToRelative(6.28f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.88f)
                curveToRelative(-0.04f, -0.35f, -0.07f, -0.7f, -0.07f, -1.05f)
                curveToRelative(0f, -4.94f, 4.01f, -8.95f, 8.95f, -8.95f)
                reflectiveCurveToRelative(8.95f, 4.01f, 8.95f, 8.95f)
                curveToRelative(0f, 0.35f, -0.02f, 0.7f, -0.07f, 1.05f)
                horizontalLineToRelative(-3.88f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.28f)
                lineToRelative(0.29f, -1.13f)
                curveToRelative(0.25f, -0.98f, 0.38f, -1.96f, 0.38f, -2.92f)
                curveToRelative(0f, -3.0f, -1.12f, -5.74f, -2.95f, -7.83f)
                close()
            }
        }.also { _SpeedometerArrow = it}

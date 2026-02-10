package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationLock: ImageVector? = null

val Icons.Bs.LocationLock: ImageVector
    get() = _LocationLock ?: UXIcon(name = "LocationLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.99f, 10f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(11f, 20.75f)
                lineTo(10.99f, 20.75f)
                lineTo(11.0f, 20.74f)
                curveToRelative(-0.65f, -0.63f, -5.19f, -5.05f, -5.95f, -5.79f)
                curveToRelative(-1.32f, -1.32f, -2.05f, -3.08f, -2.05f, -4.95f)
                reflectiveCurveToRelative(0.73f, -3.63f, 2.05f, -4.95f)
                reflectiveCurveToRelative(3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                curveToRelative(0.66f, 0.66f, 1.17f, 1.43f, 1.52f, 2.27f)
                curveToRelative(0.64f, -0.21f, 1.32f, -0.33f, 2.03f, -0.33f)
                curveToRelative(0.36f, 0f, 0.72f, 0.04f, 1.06f, 0.1f)
                curveToRelative(-0.46f, -1.52f, -1.29f, -2.96f, -2.49f, -4.16f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveToRelative(-5.18f, 1.04f, -7.07f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.01f, 14.16f)
                curveToRelative(1.45f, 1.39f, 5.7f, 5.56f, 7.06f, 6.9f)
                lineToRelative(1.32f, -1.29f)
                curveToRelative(-0.2f, -0.53f, -0.32f, -1.1f, -0.32f, -1.7f)
                verticalLineToRelative(-0.24f)
                close()
            }
        }.also { _LocationLock = it}

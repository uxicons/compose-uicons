package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmergencyCall: ImageVector? = null

val Icons.Bs.EmergencyCall: ImageVector
    get() = _EmergencyCall ?: UXIcon(name = "EmergencyCall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.29f, 14.89f)
                curveToRelative(-2.33f, -1.1f, -4.04f, -2.82f, -5.21f, -5.23f)
                lineToRelative(2.96f, -2.96f)
                lineTo(5.41f, 0.06f)
                lineTo(1.77f, 3.71f)
                curveToRelative(-1.14f, 1.14f, -1.77f, 2.67f, -1.77f, 4.32f)
                curveToRelative(0f, 7.15f, 8.79f, 15.94f, 15.94f, 15.94f)
                curveToRelative(1.65f, 0f, 3.19f, -0.63f, 4.32f, -1.77f)
                lineToRelative(3.65f, -3.65f)
                lineToRelative(-6.64f, -6.64f)
                lineToRelative(-2.97f, 2.97f)
                close()
                moveTo(18.14f, 20.09f)
                curveToRelative(-0.57f, 0.57f, -1.35f, 0.89f, -2.2f, 0.89f)
                curveToRelative(-4.99f, 0f, -12.94f, -7.07f, -12.94f, -12.94f)
                curveToRelative(0f, -0.85f, 0.31f, -1.63f, 0.89f, -2.2f)
                lineToRelative(1.52f, -1.52f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(-2.27f, 2.27f)
                lineToRelative(0.37f, 0.92f)
                curveToRelative(1.59f, 3.96f, 4.35f, 6.71f, 8.2f, 8.18f)
                lineToRelative(0.91f, 0.35f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(-1.52f, 1.52f)
                close()
                moveTo(24.0f, 5.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                close()
                moveTo(15.0f, 6.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.5f)
                lineTo(17.5f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.5f)
                lineToRelative(2.5f, -0.01f)
                verticalLineToRelative(2.01f)
                lineToRelative(-2.5f, 0.01f)
                verticalLineToRelative(2.49f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.49f)
                lineToRelative(-2.5f, -0.01f)
                close()
            }
        }.also { _EmergencyCall = it}

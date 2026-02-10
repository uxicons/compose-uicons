package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergencyOn: ImageVector? = null

val Icons.Ss.LightEmergencyOn: ImageVector
    get() = _LightEmergencyOn ?: UXIcon(name = "LightEmergencyOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                close()
                moveTo(3.72f, 5.2f)
                lineTo(1.4f, 2.98f)
                lineTo(0.02f, 4.43f)
                lineToRelative(2.32f, 2.22f)
                lineToRelative(1.38f, -1.44f)
                close()
                moveTo(7.58f, 2.71f)
                lineTo(6.37f, -0.01f)
                lineToRelative(-1.83f, 0.81f)
                lineToRelative(1.21f, 2.72f)
                lineToRelative(1.83f, -0.81f)
                close()
                moveTo(23.98f, 4.43f)
                lineToRelative(-1.38f, -1.44f)
                lineToRelative(-2.32f, 2.22f)
                lineToRelative(1.38f, 1.44f)
                lineToRelative(2.32f, -2.22f)
                close()
                moveTo(19.46f, 0.81f)
                lineTo(17.63f, -0.01f)
                lineToRelative(-1.21f, 2.72f)
                lineToRelative(1.83f, 0.81f)
                lineToRelative(1.21f, -2.72f)
                close()
                moveTo(21f, 13f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 8.04f, 3f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-5f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _LightEmergencyOn = it}

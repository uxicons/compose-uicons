package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergencyOn: ImageVector? = null

val Icons.Rs.LightEmergencyOn: ImageVector
    get() = _LightEmergencyOn ?: UXIcon(name = "LightEmergencyOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 8.04f, 3f, 13f)
                verticalLineToRelative(5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(5f, 13f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(5f)
                lineTo(5f, 18f)
                verticalLineToRelative(-5f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(2.33f, 6.65f)
                lineTo(0.02f, 4.43f)
                lineToRelative(1.38f, -1.44f)
                lineToRelative(2.32f, 2.22f)
                lineToRelative(-1.38f, 1.44f)
                close()
                moveTo(5.75f, 3.52f)
                lineToRelative(-1.21f, -2.72f)
                lineTo(6.37f, -0.01f)
                lineToRelative(1.21f, 2.72f)
                lineToRelative(-1.83f, 0.81f)
                close()
                moveTo(21.67f, 6.65f)
                lineToRelative(-1.38f, -1.44f)
                lineToRelative(2.32f, -2.22f)
                lineToRelative(1.38f, 1.44f)
                lineToRelative(-2.32f, 2.22f)
                close()
                moveTo(18.25f, 3.52f)
                lineToRelative(-1.83f, -0.81f)
                lineTo(17.63f, -0.01f)
                lineToRelative(1.83f, 0.81f)
                lineToRelative(-1.21f, 2.72f)
                close()
                moveTo(12f, 9.0f)
                verticalLineToRelative(2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
        }.also { _LightEmergencyOn = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergencyOn: ImageVector? = null

val Icons.Bs.LightEmergencyOn: ImageVector
    get() = _LightEmergencyOn ?: UXIcon(name = "LightEmergencyOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19.04f)
                verticalLineToRelative(-5.04f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 9.04f, 3f, 14f)
                verticalLineToRelative(5.04f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.22f, -3f, -3.46f)
                close()
                moveTo(12f, 8f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                verticalLineToRelative(5f)
                lineTo(6f, 19f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                close()
                moveTo(2.42f, 7.32f)
                lineTo(0.04f, 5.05f)
                lineToRelative(2.08f, -2.17f)
                lineToRelative(2.38f, 2.27f)
                lineToRelative(-2.08f, 2.17f)
                close()
                moveTo(5.92f, 4.09f)
                lineToRelative(-1.22f, -2.84f)
                lineTo(7.46f, 0.07f)
                lineToRelative(1.22f, 2.84f)
                lineToRelative(-2.76f, 1.18f)
                close()
                moveTo(21.66f, 7.36f)
                lineToRelative(-2.08f, -2.17f)
                lineToRelative(2.38f, -2.27f)
                lineToRelative(2.08f, 2.17f)
                lineToRelative(-2.38f, 2.27f)
                close()
                moveTo(18.16f, 4.13f)
                lineToRelative(-2.76f, -1.18f)
                lineTo(16.62f, 0.1f)
                lineToRelative(2.76f, 1.18f)
                lineToRelative(-1.22f, 2.84f)
                close()
                moveTo(11f, 14.0f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                verticalLineToRelative(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _LightEmergencyOn = it}

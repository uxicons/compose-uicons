package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergency: ImageVector? = null

val Icons.Rs.LightEmergency: ImageVector
    get() = _LightEmergency ?: UXIcon(name = "LightEmergency") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 17f)
                verticalLineToRelative(-8f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                reflectiveCurveTo(3f, 4.04f, 3f, 9f)
                verticalLineToRelative(8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(5f, 9f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(8f)
                lineTo(5f, 17f)
                verticalLineToRelative(-8f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 5f)
                verticalLineToRelative(2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
        }.also { _LightEmergency = it}

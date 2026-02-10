package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergency: ImageVector? = null

val Icons.Sr.LightEmergency: ImageVector
    get() = _LightEmergency ?: UXIcon(name = "LightEmergency") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(4f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8f)
                curveTo(3f, 4.04f, 7.04f, 0f, 12f, 0f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(13f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(21f, 20f)
                lineTo(3f, 20f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _LightEmergency = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergency: ImageVector? = null

val Icons.Rr.LightEmergency: ImageVector
    get() = _LightEmergency ?: UXIcon(name = "LightEmergency") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 17.13f)
                verticalLineToRelative(-8.13f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                reflectiveCurveTo(3f, 4.04f, 3f, 9f)
                verticalLineToRelative(8.13f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.01f, -3f, 3.87f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.86f, -1.28f, -3.43f, -3f, -3.87f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                verticalLineToRelative(8f)
                lineTo(5f, 17f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                close()
                moveTo(21f, 22f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(8f, 9f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _LightEmergency = it}

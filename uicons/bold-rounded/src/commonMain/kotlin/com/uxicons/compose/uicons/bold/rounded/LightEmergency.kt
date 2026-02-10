package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergency: ImageVector? = null

val Icons.Br.LightEmergency: ImageVector
    get() = _LightEmergency ?: UXIcon(name = "LightEmergency") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.02f, 19.05f)
            verticalLineToRelative(-10.05f)
            curveTo(21.02f, 4.04f, 16.98f, 0f, 12.02f, 0f)
            reflectiveCurveTo(3.02f, 4.04f, 3.02f, 9f)
            verticalLineToRelative(10.05f)
            curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -1.76f, -1.31f, -3.2f, -3f, -3.45f)
            close()
            moveTo(6.02f, 9f)
            curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            verticalLineToRelative(10f)
            lineTo(6.02f, 19f)
            verticalLineToRelative(-10f)
            close()
            moveTo(13.02f, 6.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _LightEmergency = it }

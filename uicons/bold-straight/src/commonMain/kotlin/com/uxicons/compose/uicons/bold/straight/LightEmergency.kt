package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergency: ImageVector? = null

val Icons.Bs.LightEmergency: ImageVector
    get() = _LightEmergency ?: UXIcon(name = "LightEmergency") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19.04f)
                verticalLineToRelative(-10.04f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                reflectiveCurveTo(3f, 4.04f, 3f, 9f)
                verticalLineToRelative(10.04f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.22f, -3f, -3.46f)
                close()
                moveTo(6f, 9f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(10f)
                lineTo(6f, 19f)
                verticalLineToRelative(-10f)
                close()
                moveTo(12f, 5f)
                verticalLineToRelative(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
        }.also { _LightEmergency = it}

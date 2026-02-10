package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Sc.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 16.98f)
                curveToRelative(0f, 1.15f, -0.08f, 2.18f, -0.23f, 3.17f)
                curveToRelative(-0.08f, 0.49f, -0.5f, 0.84f, -0.99f, 0.84f)
                horizontalLineToRelative(-6.85f)
                curveToRelative(-0.26f, 1.4f, -1.14f, 2f, -2.91f, 2f)
                reflectiveCurveToRelative(-2.65f, -0.6f, -2.91f, -2f)
                horizontalLineToRelative(-6.85f)
                curveToRelative(-0.49f, 0f, -0.91f, -0.36f, -0.99f, -0.84f)
                curveToRelative(-0.16f, -0.99f, -0.23f, -2.02f, -0.23f, -3.15f)
                curveToRelative(0f, -7.19f, 2.86f, -10.53f, 9.48f, -10.95f)
                verticalLineToRelative(-3.55f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.55f)
                curveToRelative(6.62f, 0.42f, 9.48f, 3.76f, 9.48f, 10.93f)
                close()
            }
        }.also { _LightCeiling = it}

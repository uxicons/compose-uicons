package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergency: ImageVector? = null

val Icons.Sc.LightEmergency: ImageVector
    get() = _LightEmergency ?: UXIcon(name = "LightEmergency") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 15.31f)
                verticalLineToRelative(-6.27f)
                curveToRelative(0f, -5.53f, -2.47f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 2.47f, -8f, 8f)
                verticalLineToRelative(6.27f)
                curveToRelative(1.65f, -0.15f, 4.31f, -0.31f, 8f, -0.31f)
                reflectiveCurveToRelative(6.35f, 0.16f, 8f, 0.31f)
                close()
                moveTo(10.96f, 7f)
                curveToRelative(-0.88f, 0f, -1f, 0.12f, -1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.99f, 1.01f, -3f, 3f, -3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(23f, 20.5f)
                curveToRelative(0f, 0.42f, -0.04f, 0.82f, -0.13f, 1.24f)
                reflectiveCurveToRelative(-0.44f, 0.73f, -0.86f, 0.78f)
                curveToRelative(-1.2f, 0.14f, -4.58f, 0.48f, -10.01f, 0.48f)
                reflectiveCurveToRelative(-8.81f, -0.33f, -10.01f, -0.48f)
                curveToRelative(-0.42f, -0.05f, -0.77f, -0.36f, -0.86f, -0.78f)
                reflectiveCurveToRelative(-0.13f, -0.82f, -0.13f, -1.24f)
                curveToRelative(0.01f, -1.67f, 1.27f, -3.02f, 2.93f, -3.18f)
                curveToRelative(1.59f, -0.15f, 4.27f, -0.32f, 8.07f, -0.32f)
                reflectiveCurveToRelative(6.48f, 0.18f, 8.07f, 0.32f)
                curveToRelative(1.66f, 0.16f, 2.92f, 1.55f, 2.93f, 3.18f)
                close()
            }
        }.also { _LightEmergency = it}

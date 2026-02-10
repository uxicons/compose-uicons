package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerThreeQuarters: ImageVector? = null

val Icons.Br.ThermometerThreeQuarters: ImageVector
    get() = _ThermometerThreeQuarters ?: UXIcon(name = "ThermometerThreeQuarters") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 16.02f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            curveToRelative(0f, -1.11f, 0.61f, -2.06f, 1.5f, -2.58f)
            verticalLineToRelative(-4.93f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4.93f)
            curveToRelative(0.89f, 0.52f, 1.5f, 1.48f, 1.5f, 2.58f)
            close()
            moveTo(20f, 15.98f)
            curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
            curveToRelative(0f, -1.96f, 0.71f, -3.81f, 2f, -5.27f)
            verticalLineToRelative(-4.69f)
            curveTo(6f, 2.71f, 8.69f, 0.02f, 12f, 0.02f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            verticalLineToRelative(4.69f)
            curveToRelative(1.29f, 1.46f, 2f, 3.31f, 2f, 5.27f)
            close()
            moveTo(17f, 15.98f)
            curveToRelative(0f, -1.36f, -0.55f, -2.63f, -1.54f, -3.59f)
            curveToRelative(-0.29f, -0.28f, -0.46f, -0.67f, -0.46f, -1.08f)
            verticalLineToRelative(-5.29f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            verticalLineToRelative(5.29f)
            curveToRelative(0f, 0.41f, -0.17f, 0.8f, -0.46f, 1.08f)
            curveToRelative(-0.99f, 0.96f, -1.54f, 2.23f, -1.54f, 3.59f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
            close()
        }
    }.also { _ThermometerThreeQuarters = it }

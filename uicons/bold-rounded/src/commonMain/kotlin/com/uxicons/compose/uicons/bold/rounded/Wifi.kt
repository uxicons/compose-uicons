package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi: ImageVector? = null

val Icons.Br.Wifi: ImageVector
    get() = _Wifi ?: UXIcon(name = "Wifi") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 19f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            close()
            moveTo(18.36f, 14.76f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-3.51f, -3.51f, -9.22f, -3.51f, -12.73f, 0f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
            reflectiveCurveToRelative(1.54f, 0.59f, 2.12f, 0f)
            curveToRelative(2.34f, -2.34f, 6.15f, -2.34f, 8.49f, 0f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            close()
            moveTo(23.53f, 10.09f)
            curveToRelative(0.6f, -0.57f, 0.62f, -1.52f, 0.05f, -2.12f)
            curveToRelative(-0.09f, -0.09f, -0.18f, -0.19f, -0.27f, -0.28f)
            curveToRelative(-3.02f, -3.02f, -7.04f, -4.69f, -11.31f, -4.69f)
            reflectiveCurveTo(3.71f, 4.66f, 0.69f, 7.68f)
            curveToRelative(-0.09f, 0.09f, -0.18f, 0.19f, -0.27f, 0.28f)
            curveToRelative(-0.57f, 0.6f, -0.55f, 1.55f, 0.05f, 2.12f)
            curveToRelative(0.6f, 0.57f, 1.55f, 0.55f, 2.12f, -0.05f)
            lineToRelative(0.22f, -0.23f)
            curveToRelative(2.46f, -2.46f, 5.72f, -3.81f, 9.19f, -3.81f)
            reflectiveCurveToRelative(6.74f, 1.35f, 9.2f, 3.81f)
            lineToRelative(0.22f, 0.22f)
            curveToRelative(0.29f, 0.31f, 0.69f, 0.46f, 1.08f, 0.46f)
            curveToRelative(0.37f, 0f, 0.75f, -0.14f, 1.04f, -0.41f)
            close()
        }
    }.also { _Wifi = it }

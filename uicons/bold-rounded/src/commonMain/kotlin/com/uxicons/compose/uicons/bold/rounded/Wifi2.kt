package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi2: ImageVector? = null

val Icons.Br.Wifi2: ImageVector
    get() = _Wifi2 ?: UXIcon(name = "Wifi2") {
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
        }
    }.also { _Wifi2 = it }

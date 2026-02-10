package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi: ImageVector? = null

val Icons.Bs.Wifi: ImageVector
    get() = _Wifi ?: UXIcon(name = "Wifi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 19f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(23.31f, 7.69f)
                curveToRelative(-3.02f, -3.02f, -7.04f, -4.69f, -11.31f, -4.69f)
                reflectiveCurveTo(3.71f, 4.66f, 0.69f, 7.69f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(2.46f, -2.46f, 5.72f, -3.81f, 9.19f, -3.81f)
                reflectiveCurveToRelative(6.74f, 1.35f, 9.19f, 3.81f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(18.36f, 12.64f)
                curveToRelative(-3.51f, -3.51f, -9.22f, -3.51f, -12.73f, 0f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(2.34f, -2.34f, 6.15f, -2.34f, 8.49f, 0f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _Wifi = it}

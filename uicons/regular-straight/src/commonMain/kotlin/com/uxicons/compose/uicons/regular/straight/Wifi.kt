package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi: ImageVector? = null

val Icons.Rs.Wifi: ImageVector
    get() = _Wifi ?: UXIcon(name = "Wifi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 19f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(18.36f, 12.64f)
                curveToRelative(-3.51f, -3.51f, -9.22f, -3.51f, -12.73f, 0f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(2.73f, -2.73f, 7.17f, -2.73f, 9.9f, 0f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(23.31f, 7.69f)
                curveToRelative(-3.02f, -3.02f, -7.04f, -4.69f, -11.31f, -4.69f)
                reflectiveCurveTo(3.71f, 4.66f, 0.69f, 7.69f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(2.64f, -2.64f, 6.16f, -4.1f, 9.9f, -4.1f)
                reflectiveCurveToRelative(7.25f, 1.46f, 9.9f, 4.1f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _Wifi = it}

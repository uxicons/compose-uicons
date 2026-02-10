package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi: ImageVector? = null

val Icons.Ts.Wifi: ImageVector
    get() = _Wifi ?: UXIcon(name = "Wifi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18.36f, 12.64f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.64f, -6.36f, -2.64f)
                reflectiveCurveToRelative(-4.66f, 0.94f, -6.36f, 2.64f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(1.51f, -1.51f, 3.52f, -2.34f, 5.66f, -2.34f)
                reflectiveCurveToRelative(4.15f, 0.83f, 5.66f, 2.34f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(23.31f, 7.69f)
                curveToRelative(-3.02f, -3.02f, -7.04f, -4.69f, -11.31f, -4.69f)
                reflectiveCurveTo(3.71f, 4.66f, 0.69f, 7.69f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(2.83f, -2.83f, 6.6f, -4.39f, 10.61f, -4.39f)
                reflectiveCurveToRelative(7.77f, 1.56f, 10.61f, 4.39f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _Wifi = it}

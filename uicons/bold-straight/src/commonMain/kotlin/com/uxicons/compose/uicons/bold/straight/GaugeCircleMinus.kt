package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCircleMinus: ImageVector? = null

val Icons.Bs.GaugeCircleMinus: ImageVector
    get() = _GaugeCircleMinus ?: UXIcon(name = "GaugeCircleMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(22f, 19f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(7.57f, 16.33f)
                lineToRelative(1.87f, 2.35f)
                lineToRelative(-3.62f, 2.88f)
                lineToRelative(-0.92f, -0.65f)
                curveTo(1.83f, 18.75f, 0f, 15.24f, 0f, 11.5f)
                curveTo(0f, 5.16f, 5.16f, 0f, 11.5f, 0f)
                reflectiveCurveToRelative(11.5f, 5.16f, 11.5f, 11.5f)
                curveToRelative(0f, 0.09f, -0.01f, 0.17f, -0.01f, 0.25f)
                curveToRelative(-0.89f, -0.71f, -1.94f, -1.24f, -3.09f, -1.52f)
                curveToRelative(-0.61f, -4.09f, -4.14f, -7.24f, -8.4f, -7.24f)
                curveTo(6.81f, 3f, 3f, 6.81f, 3f, 11.5f)
                curveToRelative(0f, 2.39f, 1.02f, 4.66f, 2.76f, 6.26f)
                lineToRelative(1.8f, -1.44f)
                close()
                moveTo(11.5f, 13.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.5f, 0.19f, -0.96f, 0.5f, -1.31f)
                verticalLineToRelative(-5.19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5.19f)
                curveToRelative(0.31f, 0.35f, 0.5f, 0.81f, 0.5f, 1.31f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _GaugeCircleMinus = it}

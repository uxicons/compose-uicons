package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCircleMinus: ImageVector? = null

val Icons.Ss.GaugeCircleMinus: ImageVector
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
                moveTo(12.0f, 12.72f)
                curveToRelative(-1.24f, 1.41f, -2.0f, 3.25f, -2.0f, 5.28f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1.71f, 2.5f)
                lineToRelative(-0.59f, -0.41f)
                curveTo(1.76f, 18.02f, 0f, 14.64f, 0f, 11.05f)
                curveTo(0f, 4.96f, 4.96f, 0f, 11.05f, 0f)
                reflectiveCurveToRelative(11.05f, 4.96f, 11.05f, 11.05f)
                curveToRelative(0f, 0.03f, -0.01f, 0.06f, -0.01f, 0.09f)
                curveToRelative(-1.2f, -0.71f, -2.59f, -1.13f, -4.09f, -1.13f)
                curveToRelative(-2.02f, 0f, -3.87f, 0.76f, -5.28f, 2.0f)
                curveToRelative(0.17f, -0.29f, 0.28f, -0.63f, 0.28f, -1.0f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                lineTo(12f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.36f, 0f, 0.7f, -0.1f, 1.0f, -0.28f)
                close()
            }
        }.also { _GaugeCircleMinus = it}

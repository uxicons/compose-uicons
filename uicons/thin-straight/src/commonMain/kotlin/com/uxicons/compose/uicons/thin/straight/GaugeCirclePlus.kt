package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCirclePlus: ImageVector? = null

val Icons.Ts.GaugeCirclePlus: ImageVector
    get() = _GaugeCirclePlus ?: UXIcon(name = "GaugeCirclePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11f)
                curveToRelative(0f, -0.93f, -0.64f, -1.71f, -1.5f, -1.93f)
                lineTo(11.5f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.07f)
                curveToRelative(-0.86f, 0.22f, -1.5f, 1f, -1.5f, 1.93f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(10f, 11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(6.85f, 17.3f)
                lineToRelative(0.65f, 0.76f)
                lineToRelative(-2.5f, 2.17f)
                lineToRelative(-0.32f, -0.22f)
                curveTo(1.75f, 17.94f, 0f, 14.57f, 0f, 11f)
                curveTo(0f, 4.93f, 4.93f, 0f, 11f, 0f)
                curveToRelative(5.82f, 0f, 10.59f, 4.55f, 10.96f, 10.28f)
                curveToRelative(-0.34f, -0.21f, -0.69f, -0.4f, -1.05f, -0.56f)
                curveToRelative(-0.63f, -4.91f, -4.83f, -8.72f, -9.91f, -8.72f)
                curveTo(5.49f, 1f, 1f, 5.49f, 1f, 11f)
                curveToRelative(0f, 3.12f, 1.47f, 6.06f, 3.95f, 7.95f)
                lineToRelative(1.91f, -1.65f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _GaugeCirclePlus = it}

package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCirclePlus: ImageVector? = null

val Icons.Sc.GaugeCirclePlus: ImageVector
    get() = _GaugeCirclePlus ?: UXIcon(name = "GaugeCirclePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11f)
                curveToRelative(-4.15f, 0f, -6f, 1.85f, -6f, 6f)
                reflectiveCurveToRelative(1.85f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.85f, 6f, -6f)
                reflectiveCurveToRelative(-1.85f, -6f, -6f, -6f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(20.96f, 9.72f)
                curveToRelative(-1.1f, -0.47f, -2.42f, -0.72f, -3.96f, -0.72f)
                curveToRelative(-1.66f, 0f, -3.07f, 0.28f, -4.22f, 0.83f)
                curveToRelative(-0.16f, -0.33f, -0.42f, -0.55f, -0.78f, -0.68f)
                verticalLineToRelative(-3.15f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.15f)
                curveToRelative(-0.7f, 0.25f, -1f, 0.82f, -1f, 1.85f)
                curveToRelative(0f, 0.94f, 0.25f, 1.5f, 0.83f, 1.78f)
                curveToRelative(-0.55f, 1.15f, -0.83f, 2.56f, -0.83f, 4.22f)
                curveToRelative(0f, 0.34f, 0.01f, 0.67f, 0.04f, 0.99f)
                horizontalLineToRelative(-1.04f)
                lineToRelative(-1.69f, 1.77f)
                curveToRelative(-0.3f, 0.26f, -0.74f, 0.32f, -1.1f, 0.14f)
                curveToRelative(-2.88f, -1.43f, -4.22f, -4.26f, -4.22f, -8.9f)
                curveToRelative(0.0f, -7.01f, 2.99f, -10.0f, 10.0f, -10.0f)
                curveToRelative(6.57f, 0f, 9.61f, 2.63f, 9.96f, 8.73f)
                close()
            }
        }.also { _GaugeCirclePlus = it}

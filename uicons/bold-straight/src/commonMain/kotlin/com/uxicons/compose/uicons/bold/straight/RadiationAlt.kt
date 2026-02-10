package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadiationAlt: ImageVector? = null

val Icons.Bs.RadiationAlt: ImageVector
    get() = _RadiationAlt ?: UXIcon(name = "RadiationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(10.5f, 12f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(19f, 12f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(0f, -1.22f, -0.63f, -2.29f, -1.58f, -2.92f)
                lineToRelative(1.93f, -2.93f)
                curveToRelative(0.77f, 0.51f, 1.46f, 1.18f, 2f, 2f)
                curveToRelative(0.78f, 1.19f, 1.15f, 2.52f, 1.15f, 3.85f)
                close()
                moveTo(8.5f, 12f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.0f, -1.32f, 0.37f, -2.66f, 1.15f, -3.85f)
                curveToRelative(0.54f, -0.82f, 1.23f, -1.49f, 2f, -2f)
                lineToRelative(1.93f, 2.93f)
                curveToRelative(-0.95f, 0.63f, -1.58f, 1.7f, -1.58f, 2.92f)
                close()
                moveTo(13.84f, 14.97f)
                lineToRelative(1.84f, 2.97f)
                curveToRelative(-1.07f, 0.67f, -2.33f, 1.06f, -3.68f, 1.06f)
                reflectiveCurveToRelative(-2.61f, -0.4f, -3.68f, -1.06f)
                lineToRelative(1.84f, -2.97f)
                curveToRelative(0.54f, 0.33f, 1.16f, 0.53f, 1.84f, 0.53f)
                reflectiveCurveToRelative(1.3f, -0.2f, 1.84f, -0.53f)
                close()
            }
        }.also { _RadiationAlt = it}

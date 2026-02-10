package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MushroomAlt: ImageVector? = null

val Icons.Bs.MushroomAlt: ImageVector
    get() = _MushroomAlt ?: UXIcon(name = "MushroomAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 13f)
                horizontalLineToRelative(-7.8f)
                curveToRelative(0.51f, 2.64f, 0.8f, 6.13f, 0.8f, 7f)
                curveToRelative(0f, 1.2f, -0.49f, 4f, -5f, 4f)
                reflectiveCurveToRelative(-5f, -2.8f, -5f, -4f)
                curveToRelative(0f, -0.87f, 0.29f, -4.36f, 0.8f, -7f)
                lineTo(0f, 13f)
                verticalLineToRelative(-1.5f)
                curveTo(0f, 5.16f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.16f, 12f, 11.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(14f, 20f)
                curveToRelative(0f, -0.88f, -0.34f, -4.66f, -0.86f, -7f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-0.52f, 2.34f, -0.86f, 6.12f, -0.86f, 7f)
                curveToRelative(0f, 0.4f, 0f, 1f, 2f, 1f)
                reflectiveCurveToRelative(2f, -0.6f, 2f, -1f)
                close()
                moveTo(20.86f, 10f)
                curveToRelative(-0.75f, -3.97f, -4.44f, -7f, -8.86f, -7f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.04f, 0f)
                curveToRelative(0.02f, 0.16f, 0.04f, 0.33f, 0.04f, 0.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.19f, 0f, -2.23f, -0.6f, -2.86f, -1.5f)
                curveToRelative(-1.27f, 1.2f, -2.17f, 2.76f, -2.5f, 4.5f)
                horizontalLineToRelative(5.86f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(7.86f)
                close()
            }
        }.also { _MushroomAlt = it}

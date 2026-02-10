package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Inhaler: ImageVector? = null

val Icons.Ss.Inhaler: ImageVector
    get() = _Inhaler ?: UXIcon(name = "Inhaler") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 12.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(1.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 18.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.19f, 7f)
                lineToRelative(0.77f, -4.03f)
                curveToRelative(0.14f, -0.73f, -0.05f, -1.49f, -0.53f, -2.06f)
                curveToRelative(-0.48f, -0.58f, -1.18f, -0.91f, -1.93f, -0.91f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.43f, 0f, -2.67f, 1.02f, -2.94f, 2.42f)
                lineToRelative(-0.9f, 4.58f)
                horizontalLineToRelative(9.04f)
                close()
                moveTo(13.76f, 9f)
                lineToRelative(-0.79f, 4f)
                horizontalLineToRelative(-3.97f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(8.86f)
                curveToRelative(1.44f, 0f, 2.68f, -1.03f, 2.95f, -2.44f)
                lineToRelative(2.0f, -10.56f)
                horizontalLineToRelative(-9.05f)
                close()
            }
        }.also { _Inhaler = it}

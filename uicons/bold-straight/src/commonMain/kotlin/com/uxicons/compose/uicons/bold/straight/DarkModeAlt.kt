package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DarkModeAlt: ImageVector? = null

val Icons.Bs.DarkModeAlt: ImageVector
    get() = _DarkModeAlt ?: UXIcon(name = "DarkModeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                lineTo(8f, 24f)
                curveTo(3.59f, 24f, 0f, 20.41f, 0f, 16f)
                curveToRelative(0f, -3.66f, 2.47f, -6.74f, 5.83f, -7.69f)
                curveToRelative(0.6f, 1.11f, 1.49f, 2.04f, 2.58f, 2.69f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(1.08f, -0.65f, 1.98f, -1.57f, 2.57f, -2.69f)
                curveToRelative(3.36f, 0.95f, 5.83f, 4.03f, 5.83f, 7.69f)
                close()
                moveTo(16f, 19f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveTo(6.96f, 5f)
                curveTo(6.96f, 2.24f, 9.2f, 0f, 11.96f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(8.96f, 5f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                curveToRelative(0.56f, 0f, 1.07f, -0.16f, 1.52f, -0.42f)
                curveToRelative(-1.16f, -0.29f, -2.02f, -1.33f, -2.02f, -2.58f)
                reflectiveCurveToRelative(0.86f, -2.28f, 2.02f, -2.58f)
                curveToRelative(-0.45f, -0.26f, -0.96f, -0.42f, -1.52f, -0.42f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
            }
        }.also { _DarkModeAlt = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DarkModeAlt: ImageVector? = null

val Icons.Ss.DarkModeAlt: ImageVector
    get() = _DarkModeAlt ?: UXIcon(name = "DarkModeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 0f, 12f, 0f)
                close()
                moveTo(9f, 5f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                curveToRelative(0.56f, 0f, 1.07f, 0.16f, 1.52f, 0.42f)
                curveToRelative(-1.16f, 0.29f, -2.02f, 1.33f, -2.02f, 2.58f)
                reflectiveCurveToRelative(0.86f, 2.28f, 2.02f, 2.58f)
                curveToRelative(-0.45f, 0.26f, -0.96f, 0.42f, -1.52f, 0.42f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
                moveTo(18.17f, 8.31f)
                curveToRelative(-0.61f, 1.14f, -1.54f, 2.09f, -2.66f, 2.74f)
                curveToRelative(0.16f, -0.02f, 0.32f, -0.05f, 0.49f, -0.05f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -1.7f, 0.86f, -3.2f, 2.16f, -4.1f)
                curveToRelative(-0.38f, 0.06f, -0.76f, 0.1f, -1.16f, 0.1f)
                curveToRelative(-2.67f, 0f, -4.99f, -1.5f, -6.17f, -3.69f)
                curveToRelative(-3.36f, 0.95f, -5.83f, 4.04f, -5.83f, 7.69f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(8f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.66f, -2.47f, -6.74f, -5.83f, -7.69f)
                close()
            }
        }.also { _DarkModeAlt = it}

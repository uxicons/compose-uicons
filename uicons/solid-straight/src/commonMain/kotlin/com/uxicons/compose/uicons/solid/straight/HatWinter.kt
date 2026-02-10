package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWinter: ImageVector? = null

val Icons.Ss.HatWinter: ImageVector
    get() = _HatWinter ?: UXIcon(name = "HatWinter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 16f)
                curveToRelative(0.25f, 0f, 0.49f, 0.04f, 0.73f, 0.07f)
                curveToRelative(-0.85f, -5.0f, -3.74f, -10.56f, -7.96f, -11.81f)
                curveToRelative(0.45f, -0.45f, 0.73f, -1.07f, 0.73f, -1.76f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.69f, 0.28f, 1.31f, 0.73f, 1.76f)
                curveToRelative(-2.79f, 0.83f, -5f, 3.54f, -6.42f, 6.74f)
                horizontalLineToRelative(14.16f)
                curveToRelative(0.33f, 0.64f, 0.61f, 1.31f, 0.87f, 2f)
                lineTo(3.04f, 13f)
                curveToRelative(-0.33f, 1.02f, -0.59f, 2.06f, -0.77f, 3.07f)
                curveToRelative(0.24f, -0.04f, 0.48f, -0.07f, 0.73f, -0.07f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _HatWinter = it}

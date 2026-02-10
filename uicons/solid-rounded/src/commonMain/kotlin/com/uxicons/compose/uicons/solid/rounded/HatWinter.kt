package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWinter: ImageVector? = null

val Icons.Sr.HatWinter: ImageVector
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
                curveToRelative(0.59f, -0.59f, 0.88f, -1.47f, 0.65f, -2.4f)
                curveToRelative(-0.21f, -0.85f, -0.9f, -1.56f, -1.76f, -1.78f)
                curveToRelative(-1.67f, -0.43f, -3.17f, 0.82f, -3.17f, 2.41f)
                curveToRelative(0f, 0.69f, 0.28f, 1.31f, 0.73f, 1.76f)
                curveToRelative(-2.79f, 0.83f, -5f, 3.54f, -6.42f, 6.74f)
                horizontalLineToRelative(13.53f)
                curveToRelative(0.38f, 0f, 0.74f, 0.21f, 0.9f, 0.56f)
                curveToRelative(0.0f, 0.01f, 0.01f, 0.01f, 0.01f, 0.02f)
                curveToRelative(0.3f, 0.66f, -0.18f, 1.42f, -0.9f, 1.42f)
                lineTo(3.04f, 13.0f)
                curveToRelative(-0.33f, 1.02f, -0.59f, 2.06f, -0.77f, 3.07f)
                curveToRelative(0.24f, -0.04f, 0.48f, -0.07f, 0.73f, -0.07f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _HatWinter = it}

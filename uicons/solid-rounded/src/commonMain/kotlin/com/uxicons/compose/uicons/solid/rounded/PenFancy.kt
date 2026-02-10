package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancy: ImageVector? = null

val Icons.Sr.PenFancy: ImageVector
    get() = _PenFancy ?: UXIcon(name = "PenFancy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 2.51f)
                curveToRelative(0f, 0.68f, -0.26f, 1.32f, -0.74f, 1.79f)
                lineToRelative(-9.55f, 9.55f)
                lineToRelative(-3.59f, -3.59f)
                lineTo(19.64f, 0.71f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0f)
                curveToRelative(0.48f, 0.48f, 0.74f, 1.12f, 0.74f, 1.79f)
                close()
                moveTo(8.2f, 11.2f)
                lineToRelative(-3.56f, 1.09f)
                curveToRelative(-1.44f, 0.45f, -2.55f, 1.65f, -2.89f, 3.11f)
                lineTo(0.09f, 22.5f)
                lineToRelative(5.2f, -5.2f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-5.2f, 5.2f)
                lineToRelative(7.09f, -1.66f)
                curveToRelative(1.47f, -0.34f, 2.66f, -1.45f, 3.11f, -2.89f)
                lineToRelative(1.11f, -3.53f)
                lineToRelative(-4.62f, -4.62f)
                close()
            }
        }.also { _PenFancy = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrumstickBite: ImageVector? = null

val Icons.Ss.DrumstickBite: ImageVector
    get() = _DrumstickBite ?: UXIcon(name = "DrumstickBite") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.51f, 2.49f)
                curveToRelative(-3.31f, -3.31f, -8.71f, -3.31f, -12.02f, 0f)
                curveToRelative(-3.17f, 3.17f, -3.48f, 11.14f, -3.49f, 11.48f)
                lineToRelative(-0.02f, 0.43f)
                lineToRelative(1.1f, 1.1f)
                lineToRelative(-4.28f, 4.28f)
                curveToRelative(-0.26f, -0.46f, -0.74f, -0.78f, -1.31f, -0.78f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.24f, 0f, 0.46f, -0.06f, 0.66f, -0.16f)
                curveToRelative(-0.1f, 0.2f, -0.16f, 0.42f, -0.16f, 0.66f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.56f, -0.32f, -1.05f, -0.78f, -1.31f)
                lineToRelative(4.28f, -4.28f)
                lineToRelative(1.1f, 1.1f)
                lineToRelative(0.44f, -0.02f)
                curveToRelative(0.09f, -0.0f, 2.29f, -0.09f, 4.83f, -0.59f)
                lineToRelative(1.0f, -0.2f)
                lineToRelative(-0.22f, -1.0f)
                curveToRelative(-0.09f, -0.41f, -0.14f, -0.81f, -0.14f, -1.21f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(0.57f, 0f, 1.13f, 0.09f, 1.67f, 0.26f)
                lineToRelative(1.25f, 0.4f)
                lineToRelative(0.05f, -1.31f)
                curveToRelative(0.1f, -2.37f, -0.8f, -4.69f, -2.47f, -6.36f)
                close()
            }
        }.also { _DrumstickBite = it}

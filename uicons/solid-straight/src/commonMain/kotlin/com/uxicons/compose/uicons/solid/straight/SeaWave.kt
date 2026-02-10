package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SeaWave: ImageVector? = null

val Icons.Ss.SeaWave: ImageVector
    get() = _SeaWave ?: UXIcon(name = "SeaWave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.26f)
                curveToRelative(2.06f, 0f, 3.74f, -1.67f, 3.74f, -3.73f)
                curveToRelative(0f, -1.43f, -0.42f, -2.55f, -1.22f, -3.38f)
                curveToRelative(-0.33f, 0.65f, -1.0f, 1.1f, -1.78f, 1.1f)
                curveToRelative(-0.87f, 0f, -1.61f, -0.56f, -1.88f, -1.34f)
                curveToRelative(-0.32f, 0.22f, -0.7f, 0.34f, -1.12f, 0.34f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -2.25f, 3.49f, -4f, 6.5f, -4f)
                curveToRelative(5.89f, 0f, 10.5f, 4.39f, 10.5f, 10f)
                close()
                moveTo(10.56f, 0f)
                curveToRelative(-3.69f, 0f, -6.13f, 1.36f, -7.09f, 2.73f)
                curveToRelative(-0.29f, 0.34f, -0.46f, 0.81f, -0.47f, 1.27f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.62f, 0f, 1.16f, -0.29f, 1.53f, -0.72f)
                curveToRelative(0.14f, 0.97f, 0.96f, 1.73f, 1.97f, 1.73f)
                curveToRelative(0.96f, 0f, 1.77f, -0.68f, 1.96f, -1.59f)
                curveToRelative(1.43f, 0.72f, 2.63f, 1.9f, 3.19f, 3.7f)
                curveToRelative(3.25f, 2.15f, 5.35f, 5.74f, 5.35f, 9.89f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.06f, -11.24f)
                curveToRelative(-0.0f, -7.15f, -5.93f, -12.76f, -13.49f, -12.76f)
                close()
            }
        }.also { _SeaWave = it}

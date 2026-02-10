package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveTriangle: ImageVector? = null

val Icons.Br.WaveTriangle: ImageVector
    get() = _WaveTriangle ?: UXIcon(name = "WaveTriangle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.5f, 22f)
            curveToRelative(-0.01f, 0f, -0.03f, 0f, -0.04f, 0f)
            curveToRelative(-0.54f, -0.01f, -1.03f, -0.32f, -1.29f, -0.8f)
            lineTo(7.42f, 6.55f)
            lineToRelative(-4.63f, 7.72f)
            curveToRelative(-0.43f, 0.71f, -1.35f, 0.94f, -2.06f, 0.51f)
            curveToRelative(-0.71f, -0.43f, -0.94f, -1.35f, -0.51f, -2.06f)
            lineTo(6.21f, 2.73f)
            curveToRelative(0.28f, -0.46f, 0.79f, -0.76f, 1.33f, -0.73f)
            curveToRelative(0.54f, 0.01f, 1.03f, 0.32f, 1.29f, 0.8f)
            lineToRelative(7.76f, 14.65f)
            lineToRelative(4.63f, -7.72f)
            curveToRelative(0.43f, -0.71f, 1.35f, -0.94f, 2.06f, -0.51f)
            curveToRelative(0.71f, 0.43f, 0.94f, 1.35f, 0.51f, 2.06f)
            lineToRelative(-6f, 10f)
            curveToRelative(-0.27f, 0.45f, -0.76f, 0.73f, -1.29f, 0.73f)
            close()
        }
    }.also { _WaveTriangle = it }

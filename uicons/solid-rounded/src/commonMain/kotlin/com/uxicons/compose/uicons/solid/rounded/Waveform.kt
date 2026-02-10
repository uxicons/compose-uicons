package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Waveform: ImageVector? = null

val Icons.Sr.Waveform: ImageVector
    get() = _Waveform ?: UXIcon(name = "Waveform") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.23f, 11.03f)
                curveToRelative(-0.54f, -0.13f, -1.07f, 0.21f, -1.2f, 0.75f)
                lineToRelative(-0.85f, 3.64f)
                lineToRelative(-1.47f, -11.18f)
                curveToRelative(-0.09f, -0.71f, -0.68f, -1.23f, -1.41f, -1.23f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.73f, 0.0f, -1.33f, 0.52f, -1.41f, 1.24f)
                lineToRelative(-1.68f, 13.51f)
                lineTo(13.42f, 1.29f)
                curveToRelative(-0.08f, -0.73f, -0.68f, -1.25f, -1.42f, -1.25f)
                reflectiveCurveToRelative(-1.34f, 0.53f, -1.42f, 1.26f)
                lineToRelative(-1.78f, 16.46f)
                lineToRelative(-1.68f, -13.5f)
                curveToRelative(-0.09f, -0.72f, -0.68f, -1.24f, -1.42f, -1.24f)
                curveToRelative(-0.73f, 0f, -1.32f, 0.52f, -1.41f, 1.23f)
                lineToRelative(-1.47f, 11.18f)
                lineToRelative(-0.85f, -3.64f)
                curveToRelative(-0.12f, -0.54f, -0.66f, -0.87f, -1.2f, -0.75f)
                curveToRelative(-0.54f, 0.12f, -0.87f, 0.66f, -0.75f, 1.2f)
                lineToRelative(1.56f, 6.69f)
                curveToRelative(0.16f, 0.68f, 0.76f, 1.13f, 1.46f, 1.09f)
                curveToRelative(0.7f, -0.04f, 1.26f, -0.54f, 1.35f, -1.23f)
                lineToRelative(1.29f, -9.85f)
                lineToRelative(1.72f, 13.81f)
                curveToRelative(0.09f, 0.73f, 0.69f, 1.26f, 1.43f, 1.26f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.75f, -0.0f, 1.35f, -0.54f, 1.43f, -1.27f)
                lineToRelative(1.73f, -15.96f)
                lineToRelative(1.73f, 15.96f)
                curveToRelative(0.08f, 0.73f, 0.68f, 1.27f, 1.43f, 1.27f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.74f, 0f, 1.34f, -0.53f, 1.43f, -1.25f)
                lineToRelative(1.72f, -13.82f)
                lineToRelative(1.29f, 9.85f)
                curveToRelative(0.09f, 0.69f, 0.64f, 1.19f, 1.35f, 1.23f)
                curveToRelative(0.69f, 0.04f, 1.31f, -0.41f, 1.46f, -1.09f)
                lineToRelative(1.56f, -6.69f)
                curveToRelative(0.13f, -0.54f, -0.21f, -1.07f, -0.75f, -1.2f)
                close()
            }
        }.also { _Waveform = it}

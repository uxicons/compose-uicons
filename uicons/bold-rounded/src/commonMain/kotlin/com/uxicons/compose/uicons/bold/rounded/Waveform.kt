package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Waveform: ImageVector? = null

val Icons.Br.Waveform: ImageVector
    get() = _Waveform ?: UXIcon(name = "Waveform") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 24f)
            horizontalLineToRelative(-0.03f)
            curveToRelative(-0.73f, -0.01f, -1.35f, -0.56f, -1.46f, -1.29f)
            lineToRelative(-1.51f, -10.61f)
            lineToRelative(-1.51f, 10.61f)
            curveToRelative(-0.1f, 0.73f, -0.72f, 1.27f, -1.46f, 1.29f)
            horizontalLineToRelative(-0.03f)
            curveToRelative(-0.72f, 0f, -1.35f, -0.52f, -1.48f, -1.23f)
            lineToRelative(-1.66f, -9.1f)
            lineToRelative(-0.9f, 4.15f)
            curveToRelative(-0.14f, 0.66f, -0.71f, 1.14f, -1.39f, 1.18f)
            curveToRelative(-0.67f, 0.03f, -1.29f, -0.38f, -1.5f, -1.02f)
            lineTo(0.08f, 11.97f)
            curveToRelative(-0.26f, -0.79f, 0.16f, -1.64f, 0.95f, -1.9f)
            reflectiveCurveToRelative(1.64f, 0.16f, 1.9f, 0.95f)
            lineToRelative(0.27f, 0.82f)
            lineToRelative(1.34f, -6.16f)
            curveToRelative(0.15f, -0.7f, 0.79f, -1.15f, 1.49f, -1.18f)
            curveToRelative(0.72f, 0.01f, 1.32f, 0.53f, 1.45f, 1.23f)
            lineToRelative(1.35f, 7.41f)
            lineToRelative(1.69f, -11.85f)
            curveToRelative(0.11f, -0.74f, 0.74f, -1.29f, 1.49f, -1.29f)
            reflectiveCurveToRelative(1.38f, 0.55f, 1.49f, 1.29f)
            lineToRelative(1.69f, 11.85f)
            lineToRelative(1.35f, -7.41f)
            curveToRelative(0.13f, -0.7f, 0.73f, -1.22f, 1.45f, -1.23f)
            curveToRelative(0.69f, -0.01f, 1.34f, 0.48f, 1.49f, 1.18f)
            lineToRelative(1.34f, 6.16f)
            lineToRelative(0.27f, -0.82f)
            curveToRelative(0.26f, -0.79f, 1.11f, -1.21f, 1.9f, -0.95f)
            curveToRelative(0.79f, 0.26f, 1.21f, 1.11f, 0.95f, 1.9f)
            lineToRelative(-2f, 6f)
            curveToRelative(-0.21f, 0.64f, -0.84f, 1.05f, -1.5f, 1.02f)
            curveToRelative(-0.67f, -0.04f, -1.24f, -0.52f, -1.39f, -1.18f)
            lineToRelative(-0.9f, -4.15f)
            lineToRelative(-1.66f, 9.1f)
            curveToRelative(-0.13f, 0.71f, -0.75f, 1.23f, -1.48f, 1.23f)
            close()
        }
    }.also { _Waveform = it }

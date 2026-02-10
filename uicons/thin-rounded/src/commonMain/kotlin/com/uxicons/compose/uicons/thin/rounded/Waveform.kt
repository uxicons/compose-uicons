package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Waveform: ImageVector? = null

val Icons.Tr.Waveform: ImageVector
    get() = _Waveform ?: UXIcon(name = "Waveform") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.31f, 24.02f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.5f, -0.0f, -0.9f, -0.35f, -0.95f, -0.84f)
                lineTo(12f, 1.47f)
                lineToRelative(-2.35f, 21.71f)
                curveToRelative(-0.05f, 0.48f, -0.45f, 0.84f, -0.95f, 0.84f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.5f, 0f, -0.9f, -0.35f, -0.95f, -0.83f)
                lineTo(5.41f, 4.37f)
                lineToRelative(-1.91f, 14.82f)
                curveToRelative(-0.06f, 0.46f, -0.43f, 0.79f, -0.9f, 0.81f)
                curveToRelative(-0.46f, 0f, -0.87f, -0.27f, -0.97f, -0.72f)
                lineTo(0.01f, 11.6f)
                curveToRelative(-0.06f, -0.27f, 0.12f, -0.54f, 0.39f, -0.59f)
                curveToRelative(0.27f, -0.05f, 0.54f, 0.11f, 0.59f, 0.39f)
                lineToRelative(1.56f, 7.37f)
                lineToRelative(1.93f, -14.96f)
                curveToRelative(0.06f, -0.47f, 0.45f, -0.81f, 0.94f, -0.81f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.48f, 0f, 0.88f, 0.34f, 0.94f, 0.82f)
                lineToRelative(2.38f, 19.25f)
                lineTo(11.06f, 0.85f)
                curveToRelative(0.05f, -0.48f, 0.45f, -0.83f, 0.94f, -0.83f)
                reflectiveCurveToRelative(0.89f, 0.35f, 0.94f, 0.83f)
                lineToRelative(2.41f, 22.23f)
                lineToRelative(2.3f, -19.26f)
                curveToRelative(0.06f, -0.47f, 0.45f, -0.81f, 0.94f, -0.81f)
                curveToRelative(0.47f, -0.01f, 0.88f, 0.34f, 0.94f, 0.81f)
                lineToRelative(1.93f, 14.96f)
                lineToRelative(1.57f, -7.37f)
                curveToRelative(0.06f, -0.27f, 0.33f, -0.43f, 0.59f, -0.39f)
                curveToRelative(0.27f, 0.06f, 0.44f, 0.32f, 0.39f, 0.59f)
                lineToRelative(-1.63f, 7.66f)
                curveToRelative(-0.11f, 0.46f, -0.52f, 0.73f, -0.97f, 0.73f)
                curveToRelative(-0.47f, -0.02f, -0.83f, -0.35f, -0.9f, -0.81f)
                lineToRelative(-1.91f, -14.82f)
                lineToRelative(-2.33f, 18.82f)
                curveToRelative(-0.06f, 0.48f, -0.46f, 0.83f, -0.95f, 0.83f)
                close()
            }
        }.also { _Waveform = it}

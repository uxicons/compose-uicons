package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tags: ImageVector? = null

val Icons.Bs.Tags: ImageVector
    get() = _Tags ?: UXIcon(name = "Tags") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.07f, 8.6f)
                lineTo(13.46f, 0.03f)
                lineTo(4.83f, 1.01f)
                lineToRelative(0.34f, 2.98f)
                lineToRelative(7.2f, -0.82f)
                lineToRelative(7.59f, 7.55f)
                curveToRelative(0.06f, 0.05f, 0.06f, 0.18f, -0.04f, 0.27f)
                lineToRelative(-1.18f, 1.27f)
                lineToRelative(-7.55f, -7.5f)
                lineTo(1.68f, 6.01f)
                lineTo(0.94f, 15.27f)
                lineToRelative(7.86f, 7.81f)
                curveToRelative(0.6f, 0.6f, 1.39f, 0.93f, 2.24f, 0.93f)
                reflectiveCurveToRelative(1.64f, -0.33f, 2.25f, -0.94f)
                lineToRelative(5.79f, -5.98f)
                curveToRelative(0.47f, -0.47f, 0.78f, -1.07f, 0.89f, -1.73f)
                lineToRelative(2.12f, -2.27f)
                curveToRelative(0.6f, -0.6f, 0.93f, -1.39f, 0.93f, -2.24f)
                reflectiveCurveToRelative(-0.33f, -1.64f, -0.93f, -2.24f)
                close()
                moveTo(16.94f, 14.97f)
                lineToRelative(-5.79f, 5.98f)
                curveToRelative(-0.05f, 0.05f, -0.18f, 0.05f, -0.23f, -0.0f)
                lineToRelative(-6.87f, -6.83f)
                lineToRelative(0.43f, -5.45f)
                lineToRelative(5.64f, -0.74f)
                lineToRelative(6.84f, 6.8f)
                curveToRelative(0.06f, 0.05f, 0.06f, 0.18f, -0.02f, 0.25f)
                close()
                moveTo(9.0f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Tags = it}

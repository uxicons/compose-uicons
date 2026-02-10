package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tags: ImageVector? = null

val Icons.Ss.Tags: ImageVector
    get() = _Tags ?: UXIcon(name = "Tags") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.19f, 9.02f)
                lineTo(13.18f, 0.01f)
                lineTo(4.9f, 0.9f)
                lineToRelative(0.21f, 1.99f)
                lineToRelative(7.33f, -0.79f)
                lineToRelative(8.34f, 8.34f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.78f, -0.01f, 1.08f)
                lineToRelative(-0.96f, 0.99f)
                lineTo(11.1f, 3.81f)
                lineTo(1.96f, 5.06f)
                lineTo(0.95f, 14.18f)
                lineToRelative(9.01f, 9.01f)
                curveToRelative(0.52f, 0.52f, 1.21f, 0.81f, 1.95f, 0.81f)
                reflectiveCurveToRelative(1.43f, -0.29f, 1.96f, -0.82f)
                lineToRelative(6.24f, -6.45f)
                curveToRelative(0.67f, -0.67f, 0.92f, -1.59f, 0.76f, -2.45f)
                lineToRelative(1.31f, -1.36f)
                curveToRelative(1.07f, -1.08f, 1.07f, -2.83f, 0f, -3.9f)
                close()
                moveTo(6f, 10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Tags = it}

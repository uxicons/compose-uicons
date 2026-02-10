package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tags: ImageVector? = null

val Icons.Rs.Tags: ImageVector
    get() = _Tags ?: UXIcon(name = "Tags") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.71f, 9.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
                moveTo(22.18f, 12.92f)
                lineToRelative(-1.24f, 1.28f)
                curveToRelative(0.19f, 0.88f, -0.06f, 1.84f, -0.74f, 2.53f)
                lineToRelative(-6.24f, 6.45f)
                curveToRelative(-0.53f, 0.53f, -1.23f, 0.82f, -1.96f, 0.82f)
                reflectiveCurveToRelative(-1.43f, -0.29f, -1.95f, -0.81f)
                lineTo(1.02f, 14.18f)
                lineTo(2.03f, 5.06f)
                lineToRelative(9.14f, -1.25f)
                lineToRelative(8.66f, 8.66f)
                lineToRelative(0.92f, -0.95f)
                curveToRelative(0.31f, -0.31f, 0.31f, -0.79f, 0.01f, -1.08f)
                lineTo(12.44f, 2.11f)
                lineToRelative(-7.25f, 0.94f)
                lineToRelative(-0.26f, -1.98f)
                lineTo(13.15f, -0.0f)
                lineToRelative(9.03f, 9.03f)
                curveToRelative(1.07f, 1.07f, 1.07f, 2.83f, 0f, 3.9f)
                close()
                moveTo(18.78f, 14.24f)
                lineTo(10.46f, 5.92f)
                lineToRelative(-6.61f, 0.9f)
                lineToRelative(-0.73f, 6.62f)
                lineToRelative(8.33f, 8.33f)
                curveToRelative(0.29f, 0.29f, 0.79f, 0.29f, 1.07f, 0f)
                lineToRelative(6.24f, -6.45f)
                curveToRelative(0.31f, -0.31f, 0.31f, -0.79f, 0.01f, -1.08f)
                close()
            }
        }.also { _Tags = it}

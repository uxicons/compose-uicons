package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenClip: ImageVector? = null

val Icons.Ss.PenClip: ImageVector
    get() = _PenClip ?: UXIcon(name = "PenClip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.15f, 2.85f)
                lineToRelative(5.14f, 5.14f)
                lineTo(7.45f, 20.81f)
                curveToRelative(-0.83f, 0.83f, -2.96f, 1.18f, -4.16f, 1.31f)
                lineToRelative(-1.84f, 1.84f)
                lineTo(0.04f, 22.54f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(0.13f, -1.18f, 0.47f, -3.39f, 1.32f, -4.23f)
                lineTo(14.6f, 5.13f)
                lineToRelative(-0.87f, -0.87f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0f)
                lineToRelative(-4.85f, 4.85f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(10.9f, 2.85f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0f)
                close()
                moveTo(22.89f, 0.68f)
                curveToRelative(-1.18f, -0.97f, -3f, -0.84f, -4.13f, 0.3f)
                lineToRelative(-1.33f, 1.33f)
                lineToRelative(4.27f, 4.27f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(0.6f, -0.6f, 0.92f, -1.44f, 0.88f, -2.29f)
                curveToRelative(-0.04f, -0.85f, -0.45f, -1.65f, -1.11f, -2.19f)
                close()
            }
        }.also { _PenClip = it}

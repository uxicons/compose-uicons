package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tents: ImageVector? = null

val Icons.Ss.Tents: ImageVector
    get() = _Tents ?: UXIcon(name = "Tents") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.68f, 16.7f)
                curveToRelative(-0.45f, 0.8f, -1.31f, 1.3f, -2.25f, 1.3f)
                horizontalLineToRelative(-0.85f)
                lineTo(11.33f, 3.98f)
                lineTo(14f, 0.06f)
                lineToRelative(9.61f, 14.09f)
                curveToRelative(0.5f, 0.82f, 0.52f, 1.76f, 0.07f, 2.55f)
                close()
                moveTo(7.24f, 24f)
                horizontalLineToRelative(5.53f)
                lineToRelative(-2.77f, -4.19f)
                lineToRelative(-2.77f, 4.19f)
                close()
                moveTo(19.61f, 20.16f)
                lineTo(10f, 5.6f)
                lineTo(0.37f, 20.19f)
                curveToRelative(-0.47f, 0.78f, -0.49f, 1.72f, -0.04f, 2.51f)
                curveToRelative(0.45f, 0.8f, 1.31f, 1.3f, 2.25f, 1.3f)
                horizontalLineToRelative(2.27f)
                lineToRelative(5.16f, -7.81f)
                lineToRelative(5.16f, 7.81f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.94f, 0f, 1.79f, -0.5f, 2.25f, -1.3f)
                curveToRelative(0.45f, -0.79f, 0.43f, -1.73f, -0.06f, -2.54f)
                close()
            }
        }.also { _Tents = it}

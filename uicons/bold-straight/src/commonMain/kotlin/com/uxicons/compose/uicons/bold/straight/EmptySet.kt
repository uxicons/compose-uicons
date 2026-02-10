package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmptySet: ImageVector? = null

val Icons.Bs.EmptySet: ImageVector
    get() = _EmptySet ?: UXIcon(name = "EmptySet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 2.16f)
                lineTo(21.84f, 0.04f)
                lineToRelative(-3.21f, 3.21f)
                curveToRelative(-1.85f, -1.4f, -4.14f, -2.25f, -6.63f, -2.25f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                curveToRelative(0f, 2.49f, 0.84f, 4.79f, 2.25f, 6.63f)
                lineTo(0.04f, 21.84f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.21f, -3.21f)
                curveToRelative(1.85f, 1.4f, 4.14f, 2.25f, 6.63f, 2.25f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -2.49f, -0.84f, -4.79f, -2.25f, -6.63f)
                lineToRelative(3.21f, -3.21f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                curveToRelative(1.67f, 0f, 3.21f, 0.51f, 4.49f, 1.39f)
                lineToRelative(-11.11f, 11.11f)
                curveToRelative(-0.87f, -1.28f, -1.39f, -2.83f, -1.39f, -4.49f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                curveToRelative(-1.67f, 0f, -3.21f, -0.51f, -4.49f, -1.39f)
                lineToRelative(11.11f, -11.11f)
                curveToRelative(0.87f, 1.28f, 1.39f, 2.83f, 1.39f, 4.49f)
                close()
            }
        }.also { _EmptySet = it}

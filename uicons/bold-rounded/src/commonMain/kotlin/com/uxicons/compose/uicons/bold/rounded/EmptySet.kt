package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmptySet: ImageVector? = null

val Icons.Br.EmptySet: ImageVector
    get() = _EmptySet ?: UXIcon(name = "EmptySet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 0.44f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-2.81f, 2.81f)
            curveToRelative(-1.85f, -1.4f, -4.14f, -2.25f, -6.63f, -2.25f)
            curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
            curveToRelative(0f, 2.49f, 0.84f, 4.79f, 2.25f, 6.63f)
            lineToRelative(-2.81f, 2.81f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(2.81f, -2.81f)
            curveToRelative(1.85f, 1.4f, 4.14f, 2.25f, 6.63f, 2.25f)
            curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
            curveToRelative(0f, -2.49f, -0.84f, -4.79f, -2.25f, -6.63f)
            lineToRelative(2.81f, -2.81f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
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
    }.also { _EmptySet = it }

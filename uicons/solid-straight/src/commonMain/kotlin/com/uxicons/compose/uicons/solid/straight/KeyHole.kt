package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyHole: ImageVector? = null

val Icons.Ss.KeyHole: ImageVector
    get() = _KeyHole ?: UXIcon(name = "KeyHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.99f, 24f)
                horizontalLineTo(5.01f)
                lineToRelative(2.52f, -11.62f)
                curveToRelative(-1.59f, -1.32f, -2.52f, -3.29f, -2.52f, -5.38f)
                curveTo(5f, 3.14f, 8.14f, 0f, 12f, 0f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 2.09f, -0.93f, 4.06f, -2.52f, 5.38f)
                lineToRelative(2.52f, 11.62f)
                close()
            }
        }.also { _KeyHole = it}

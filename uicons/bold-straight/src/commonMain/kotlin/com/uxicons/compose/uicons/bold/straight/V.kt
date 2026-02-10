package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _V: ImageVector? = null

val Icons.Bs.V: ImageVector
    get() = _V ?: UXIcon(name = "V") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.76f, 0f)
                lineTo(12.42f, 20.79f)
                curveToRelative(-0.1f, 0.2f, -0.7f, 0.26f, -0.85f, -0.04f)
                lineTo(3.25f, 0f)
                horizontalLineTo(0f)
                lineTo(8.84f, 22.0f)
                curveToRelative(0.62f, 1.25f, 1.8f, 2.0f, 3.16f, 2.0f)
                curveToRelative(1.33f, 0f, 2.54f, -0.74f, 3.15f, -1.97f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-3.24f)
                close()
            }
        }.also { _V = it}

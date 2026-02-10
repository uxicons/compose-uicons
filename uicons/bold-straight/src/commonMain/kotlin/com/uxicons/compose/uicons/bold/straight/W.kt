package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _W: ImageVector? = null

val Icons.Bs.W: ImageVector
    get() = _W ?: UXIcon(name = "W") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 0f)
                lineToRelative(-3.67f, 20.91f)
                lineToRelative(-5.28f, -12.05f)
                lineToRelative(-5.31f, 12.13f)
                lineTo(3.05f, 0f)
                horizontalLineTo(0f)
                lineTo(3.74f, 21.56f)
                curveToRelative(0.24f, 1.26f, 1.21f, 2.2f, 2.48f, 2.4f)
                curveToRelative(0.16f, 0.03f, 0.33f, 0.04f, 0.49f, 0.04f)
                curveToRelative(1.1f, 0f, 2.09f, -0.6f, 2.67f, -1.68f)
                lineToRelative(2.62f, -5.98f)
                lineToRelative(2.68f, 6.1f)
                curveToRelative(0.6f, 1.1f, 1.84f, 1.72f, 3.1f, 1.52f)
                curveToRelative(1.27f, -0.2f, 2.24f, -1.14f, 2.48f, -2.4f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-3.06f)
                close()
            }
        }.also { _W = it}

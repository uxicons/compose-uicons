package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _M: ImageVector? = null

val Icons.Bs.M: ImageVector
    get() = _M ?: UXIcon(name = "M") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3.34f)
                lineToRelative(-9f, 13.81f)
                lineTo(3.0f, 3.34f)
                lineToRelative(-0.01f, 20.66f)
                horizontalLineTo(0f)
                verticalLineTo(2.92f)
                curveTo(0f, 1.6f, 0.77f, 0.51f, 1.96f, 0.13f)
                curveToRelative(1.21f, -0.38f, 2.53f, 0.08f, 3.27f, 1.15f)
                lineToRelative(6.76f, 10.37f)
                lineTo(18.73f, 1.32f)
                curveToRelative(0.77f, -1.11f, 2.09f, -1.57f, 3.3f, -1.19f)
                curveToRelative(1.19f, 0.38f, 1.96f, 1.47f, 1.96f, 2.79f)
                verticalLineTo(24f)
                close()
            }
        }.also { _M = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Up: ImageVector? = null

val Icons.Ss.Up: ImageVector
    get() = _Up ?: UXIcon(name = "Up") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.99f, 24f)
                horizontalLineTo(6.99f)
                verticalLineTo(11f)
                horizontalLineTo(0.06f)
                lineTo(9.86f, 0.88f)
                curveTo(10.43f, 0.31f, 11.18f, 0f, 11.99f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.8f, 0f, 1.56f, 0.31f, 2.13f, 0.88f)
                lineToRelative(9.82f, 10.12f)
                horizontalLineToRelative(-6.95f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _Up = it}

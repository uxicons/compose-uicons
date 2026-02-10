package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Ss.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.65f, 22f)
                horizontalLineTo(3.41f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                verticalLineToRelative(-7.23f)
                lineToRelative(8.65f, 8.65f)
                close()
                moveTo(23.12f, 3.54f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-1.12f, -1.12f, -2.93f, -1.18f, -4.12f, -0.12f)
                lineTo(3.49f, 12.02f)
                lineToRelative(8.51f, 8.51f)
                lineTo(23.24f, 7.66f)
                curveToRelative(1.06f, -1.19f, 1.01f, -3.0f, -0.12f, -4.12f)
                close()
            }
        }.also { _Highlighter = it}

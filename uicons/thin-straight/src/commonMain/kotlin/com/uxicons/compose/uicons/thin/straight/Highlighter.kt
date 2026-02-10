package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Ts.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.24f, 3.56f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.97f, -0.97f, -2.54f, -1.02f, -3.57f, -0.1f)
                lineTo(2f, 13.93f)
                verticalLineToRelative(7.37f)
                lineToRelative(-1.85f, 1.85f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(1.85f, -1.85f)
                horizontalLineToRelative(7.37f)
                lineTo(23.34f, 7.12f)
                curveToRelative(0.92f, -1.03f, 0.87f, -2.6f, -0.1f, -3.57f)
                close()
                moveTo(3f, 14.71f)
                lineToRelative(6.29f, 6.29f)
                horizontalLineTo(3f)
                verticalLineToRelative(-6.29f)
                close()
                moveTo(22.59f, 6.46f)
                lineToRelative(-12.46f, 13.97f)
                lineTo(3.57f, 13.86f)
                lineTo(17.54f, 1.41f)
                curveToRelative(0.64f, -0.57f, 1.6f, -0.54f, 2.2f, 0.06f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.6f, 0.6f, 0.63f, 1.56f, 0.06f, 2.2f)
                close()
            }
        }.also { _Highlighter = it}

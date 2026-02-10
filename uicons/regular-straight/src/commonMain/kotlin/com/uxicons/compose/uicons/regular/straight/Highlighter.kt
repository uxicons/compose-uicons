package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Rs.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 3.54f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-1.12f, -1.12f, -2.93f, -1.18f, -4.12f, -0.12f)
                lineTo(2f, 13.55f)
                verticalLineToRelative(7.03f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.71f, -1.71f)
                horizontalLineToRelative(7.03f)
                lineTo(23.24f, 7.66f)
                curveToRelative(1.06f, -1.19f, 1.01f, -3.0f, -0.12f, -4.12f)
                close()
                moveTo(4f, 15.35f)
                lineToRelative(4.65f, 4.65f)
                horizontalLineTo(4f)
                verticalLineToRelative(-4.65f)
                close()
                moveTo(21.75f, 6.33f)
                lineToRelative(-11.29f, 12.66f)
                lineToRelative(-5.44f, -5.44f)
                lineTo(17.67f, 2.25f)
                horizontalLineToRelative(0f)
                curveToRelative(0.4f, -0.35f, 1.0f, -0.34f, 1.37f, 0.04f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.38f, 0.38f, 0.39f, 0.98f, 0.04f, 1.37f)
                close()
            }
        }.also { _Highlighter = it}

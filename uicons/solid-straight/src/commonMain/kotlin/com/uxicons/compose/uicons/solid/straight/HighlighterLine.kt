package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Ss.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(4f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(2.01f, 11.34f)
                verticalLineToRelative(7.23f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.71f, -1.71f)
                horizontalLineToRelative(7.23f)
                lineTo(2.01f, 11.34f)
                close()
                moveTo(21.24f, 7.65f)
                lineToRelative(-9.23f, 10.86f)
                lineTo(3.5f, 10.01f)
                lineTo(14.35f, 0.76f)
                curveToRelative(1.19f, -1.06f, 2.99f, -1f, 4.12f, 0.12f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(1.12f, 1.12f, 1.18f, 2.93f, 0.12f, 4.12f)
                close()
            }
        }.also { _HighlighterLine = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Bs.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.84f, 19f)
                lineToRelative(9.3f, -10.81f)
                curveToRelative(1.2f, -1.34f, 1.14f, -3.39f, -0.13f, -4.67f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(-1.27f, -1.27f, -3.31f, -1.33f, -4.66f, -0.14f)
                lineTo(3f, 10.16f)
                verticalLineToRelative(6.72f)
                lineToRelative(-2.06f, 2.06f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.06f, -2.06f)
                horizontalLineToRelative(6.72f)
                close()
                moveTo(15.79f, 3.12f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(0.16f, -0.14f, 0.4f, -0.14f, 0.55f, 0.02f)
                lineToRelative(2.53f, 2.53f)
                curveToRelative(0.15f, 0.15f, 0.16f, 0.39f, 0f, 0.57f)
                lineTo(10.77f, 15.65f)
                lineToRelative(-4.41f, -4.41f)
                lineTo(15.79f, 3.12f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(6f, 24f)
                verticalLineToRelative(-3f)
                lineTo(24f, 21f)
                close()
            }
        }.also { _HighlighterLine = it}

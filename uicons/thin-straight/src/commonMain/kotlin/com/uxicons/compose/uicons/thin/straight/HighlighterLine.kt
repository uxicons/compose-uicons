package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Ts.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.08f, 21f)
                lineTo(22.34f, 7.12f)
                curveToRelative(0.92f, -1.03f, 0.87f, -2.6f, -0.1f, -3.57f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.97f, -0.97f, -2.54f, -1.02f, -3.57f, -0.1f)
                lineTo(2f, 12.92f)
                verticalLineToRelative(7.37f)
                lineToRelative(-1.85f, 1.85f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(1.85f, -1.85f)
                horizontalLineToRelative(7.37f)
                close()
                moveTo(3f, 13.71f)
                lineToRelative(6.29f, 6.29f)
                lineTo(3f, 20f)
                verticalLineToRelative(-6.29f)
                close()
                moveTo(16.54f, 1.41f)
                horizontalLineToRelative(0f)
                curveToRelative(0.63f, -0.57f, 1.6f, -0.54f, 2.2f, 0.06f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.6f, 0.6f, 0.63f, 1.56f, 0.06f, 2.2f)
                lineToRelative(-11.46f, 12.96f)
                lineTo(3.57f, 12.87f)
                lineTo(16.54f, 1.41f)
                close()
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(4f, 24f)
                verticalLineToRelative(-1f)
                lineTo(24f, 23f)
                close()
            }
        }.also { _HighlighterLine = it}

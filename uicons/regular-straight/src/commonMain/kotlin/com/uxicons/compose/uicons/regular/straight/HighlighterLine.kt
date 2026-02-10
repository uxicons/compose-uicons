package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighlighterLine: ImageVector? = null

val Icons.Rs.HighlighterLine: ImageVector
    get() = _HighlighterLine ?: UXIcon(name = "HighlighterLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.45f, 20f)
                lineTo(21.24f, 7.66f)
                curveToRelative(1.06f, -1.19f, 1.01f, -3f, -0.12f, -4.12f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-1.12f, -1.12f, -2.93f, -1.18f, -4.11f, -0.12f)
                lineTo(2f, 11.55f)
                verticalLineToRelative(7.04f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.71f, -1.71f)
                horizontalLineToRelative(7.04f)
                close()
                moveTo(4f, 13.35f)
                lineToRelative(4.65f, 4.65f)
                lineTo(4f, 18f)
                verticalLineToRelative(-4.65f)
                close()
                moveTo(15.67f, 2.26f)
                horizontalLineToRelative(0f)
                curveToRelative(0.4f, -0.36f, 1f, -0.34f, 1.37f, 0.03f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.38f, 0.38f, 0.39f, 0.98f, 0.03f, 1.38f)
                lineToRelative(-9.29f, 10.64f)
                lineToRelative(-5.42f, -5.42f)
                lineTo(15.67f, 2.26f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(4f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                close()
            }
        }.also { _HighlighterLine = it}

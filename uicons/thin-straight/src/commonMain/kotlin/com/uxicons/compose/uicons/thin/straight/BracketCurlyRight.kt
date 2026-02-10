package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketCurlyRight: ImageVector? = null

val Icons.Ts.BracketCurlyRight: ImageVector
    get() = _BracketCurlyRight ?: UXIcon(name = "BracketCurlyRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 24f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.71f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(-2.79f, -2.79f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(6.29f)
                lineToRelative(3.21f, 3.21f)
                lineToRelative(-3.21f, 3.21f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _BracketCurlyRight = it}

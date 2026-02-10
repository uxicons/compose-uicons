package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketCurlyRight: ImageVector? = null

val Icons.Bs.BracketCurlyRight: ImageVector
    get() = _BracketCurlyRight ?: UXIcon(name = "BracketCurlyRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 24f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.12f)
                lineToRelative(2.38f, -2.38f)
                lineToRelative(-2.38f, -2.38f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.88f)
                lineToRelative(3.62f, 3.62f)
                lineToRelative(-3.62f, 3.62f)
                verticalLineToRelative(4.88f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _BracketCurlyRight = it}

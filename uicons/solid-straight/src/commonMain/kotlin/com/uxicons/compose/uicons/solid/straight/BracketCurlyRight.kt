package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketCurlyRight: ImageVector? = null

val Icons.Ss.BracketCurlyRight: ImageVector
    get() = _BracketCurlyRight ?: UXIcon(name = "BracketCurlyRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6.41f)
                lineToRelative(2.59f, -2.59f)
                lineToRelative(-2.59f, -2.59f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineTo(0f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5.59f)
                lineToRelative(3.41f, 3.41f)
                lineToRelative(-3.41f, 3.41f)
                verticalLineToRelative(5.59f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _BracketCurlyRight = it}

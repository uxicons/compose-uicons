package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsCurly: ImageVector? = null

val Icons.Ts.BracketsCurly: ImageVector
    get() = _BracketsCurly ?: UXIcon(name = "BracketsCurly") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.21f, 12f)
                lineToRelative(-3.21f, 3.21f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
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
                close()
                moveTo(4f, 2.5f)
                verticalLineToRelative(6.29f)
                lineTo(0.79f, 12f)
                lineToRelative(3.21f, 3.21f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 1.41f, 1.61f, 2.5f, 3f, 2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.87f, 0f, -2f, -0.73f, -2f, -1.5f)
                verticalLineToRelative(-6.71f)
                lineToRelative(-2.79f, -2.79f)
                lineToRelative(2.79f, -2.79f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                close()
            }
        }.also { _BracketsCurly = it}

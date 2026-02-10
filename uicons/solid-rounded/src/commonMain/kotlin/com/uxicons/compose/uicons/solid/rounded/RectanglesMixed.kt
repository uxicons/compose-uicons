package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglesMixed: ImageVector? = null

val Icons.Sr.RectanglesMixed: ImageVector
    get() = _RectanglesMixed ?: UXIcon(name = "RectanglesMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11f)
                lineTo(2f, 11f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3.5f)
                curveTo(0f, 3.02f, 2.02f, 1f, 4.5f, 1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(19.5f, 20f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(15f, 5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(11f, 23f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _RectanglesMixed = it}

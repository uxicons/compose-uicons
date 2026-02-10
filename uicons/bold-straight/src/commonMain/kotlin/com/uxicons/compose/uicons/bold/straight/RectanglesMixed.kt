package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglesMixed: ImageVector? = null

val Icons.Bs.RectanglesMixed: ImageVector
    get() = _RectanglesMixed ?: UXIcon(name = "RectanglesMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 4.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(13f)
                lineTo(13f, 1f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                close()
                moveTo(10f, 8f)
                lineTo(3f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(20.5f, 3f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 16.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(18f, 6f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(10f)
                close()
                moveTo(2f, 19.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-10f)
                lineTo(2f, 13f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(5f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.also { _RectanglesMixed = it}

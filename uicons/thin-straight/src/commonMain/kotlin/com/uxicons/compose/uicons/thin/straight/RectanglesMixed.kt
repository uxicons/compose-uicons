package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglesMixed: ImageVector? = null

val Icons.Ts.RectanglesMixed: ImageVector
    get() = _RectanglesMixed ?: UXIcon(name = "RectanglesMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 20.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-10f)
                lineTo(2f, 13f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(3f, 14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(21.5f, 3f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.5f)
                lineTo(16f, 4f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12f)
                close()
                moveTo(0f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(13f)
                lineTo(13f, 1f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                close()
                moveTo(12f, 10f)
                lineTo(1f, 10f)
                lineTo(1f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _RectanglesMixed = it}

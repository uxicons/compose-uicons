package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglesMixed: ImageVector? = null

val Icons.Ss.RectanglesMixed: ImageVector
    get() = _RectanglesMixed ?: UXIcon(name = "RectanglesMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(-7f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                close()
                moveTo(21f, 20f)
                horizontalLineToRelative(-6f)
                lineTo(15f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(13f, 23f)
                lineTo(5f, 23f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _RectanglesMixed = it}

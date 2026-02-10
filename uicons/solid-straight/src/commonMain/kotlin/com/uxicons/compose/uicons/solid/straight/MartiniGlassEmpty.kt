package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MartiniGlassEmpty: ImageVector? = null

val Icons.Ss.MartiniGlassEmpty: ImageVector
    get() = _MartiniGlassEmpty ?: UXIcon(name = "MartiniGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.1f, 0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.55f, -0.66f, 3.04f, -1.81f, 4.08f)
                lineToRelative(-9.19f, 8.36f)
                verticalLineToRelative(8.56f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(6.1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-8.56f)
                lineTo(1.91f, 5.08f)
                curveTo(0.76f, 4.04f, 0.1f, 2.55f, 0.1f, 1f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                close()
            }
        }.also { _MartiniGlassEmpty = it}

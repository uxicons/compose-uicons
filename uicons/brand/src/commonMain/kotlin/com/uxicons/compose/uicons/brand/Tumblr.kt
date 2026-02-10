package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tumblr: ImageVector? = null

val Icons.Brand.Tumblr: ImageVector
    get() = _Tumblr ?: UXIcon(name = "Tumblr") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.79f, 24f)
            curveToRelative(-3.61f, 0f, -6.3f, -1.86f, -6.3f, -6.3f)
            verticalLineToRelative(-7.12f)
            horizontalLineToRelative(-3.28f)
            verticalLineTo(6.73f)
            curveTo(8.81f, 5.8f, 10.32f, 2.69f, 10.5f, 0f)
            horizontalLineToRelative(3.75f)
            verticalLineToRelative(6.11f)
            horizontalLineToRelative(4.37f)
            verticalLineToRelative(4.48f)
            horizontalLineToRelative(-4.37f)
            verticalLineToRelative(6.2f)
            curveToRelative(0f, 1.86f, 0.94f, 2.5f, 2.43f, 2.5f)
            horizontalLineToRelative(2.12f)
            verticalLineTo(24f)
            horizontalLineTo(14.79f)
            close()
        }
    }.also { _Tumblr = it }

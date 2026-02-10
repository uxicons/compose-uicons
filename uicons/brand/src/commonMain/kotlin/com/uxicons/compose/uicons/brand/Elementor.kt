package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Elementor: ImageVector? = null

val Icons.Brand.Elementor: ImageVector
    get() = _Elementor ?: UXIcon(name = "Elementor") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.0f, 0f)
            curveTo(5.38f, -0.0f, 0.0f, 5.37f, 0f, 12.0f)
            curveTo(-0.0f, 18.62f, 5.37f, 24.0f, 12.0f, 24f)
            curveTo(18.62f, 24.0f, 24.0f, 18.63f, 24f, 12.0f)
            verticalLineTo(12f)
            curveTo(24f, 5.37f, 18.63f, 0.0f, 12.0f, 0f)
            close()
            moveTo(9.0f, 17.0f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-10f)
            horizontalLineToRelative(2f)
            verticalLineTo(17.0f)
            close()
            moveTo(17.0f, 17.0f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(6f)
            verticalLineTo(17.0f)
            close()
            moveTo(17.0f, 13.0f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(6f)
            verticalLineTo(13.0f)
            close()
            moveTo(17.0f, 9.0f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(6f)
            verticalLineTo(9.0f)
            close()
        }
    }.also { _Elementor = it }

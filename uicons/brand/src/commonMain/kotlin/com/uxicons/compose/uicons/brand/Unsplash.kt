package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unsplash: ImageVector? = null

val Icons.Brand.Unsplash: ImageVector
    get() = _Unsplash ?: UXIcon(name = "Unsplash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 10.62f)
            verticalLineToRelative(13.38f)
            horizontalLineTo(0f)
            verticalLineTo(10.62f)
            horizontalLineToRelative(7.56f)
            verticalLineToRelative(6.69f)
            horizontalLineToRelative(8.88f)
            verticalLineToRelative(-6.69f)
            horizontalLineTo(24f)
            close()
            moveTo(16.44f, 0.0f)
            horizontalLineTo(7.56f)
            verticalLineToRelative(6.69f)
            horizontalLineToRelative(8.88f)
            verticalLineTo(0.0f)
            close()
        }
    }.also { _Unsplash = it }

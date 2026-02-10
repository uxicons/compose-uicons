package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Windows: ImageVector? = null

val Icons.Brand.Windows: ImageVector
    get() = _Windows ?: UXIcon(name = "Windows") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 0f)
            horizontalLineToRelative(11.59f)
            verticalLineToRelative(11.59f)
            horizontalLineTo(0f)
            verticalLineTo(0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.41f, 11.59f)
            verticalLineTo(0f)
            horizontalLineTo(24f)
            verticalLineToRelative(11.59f)
            horizontalLineTo(12.41f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 12.41f)
            horizontalLineToRelative(11.59f)
            verticalLineTo(24f)
            horizontalLineTo(0f)
            verticalLineTo(12.41f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.41f, 24f)
            verticalLineTo(12.41f)
            horizontalLineTo(24f)
            verticalLineTo(24f)
            horizontalLineTo(12.41f)
            close()
        }
    }.also { _Windows = it }

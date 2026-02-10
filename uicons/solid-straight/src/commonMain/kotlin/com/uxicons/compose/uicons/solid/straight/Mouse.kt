package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mouse: ImageVector? = null

val Icons.Ss.Mouse: ImageVector
    get() = _Mouse ?: UXIcon(name = "Mouse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(0f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(8.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 7.5f)
                verticalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(7.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 3f)
                close()
                moveTo(13f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Mouse = it}

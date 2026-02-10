package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZoomIn: ImageVector? = null

val Icons.Ss.ZoomIn: ImageVector
    get() = _ZoomIn ?: UXIcon(name = "ZoomIn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.74f, 16.33f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.42f, 1.42f)
                lineTo(22.59f, 24f)
                lineTo(24f, 22.59f)
                close()
                moveTo(14f, 11f)
                horizontalLineTo(11f)
                verticalLineToRelative(3f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _ZoomIn = it}

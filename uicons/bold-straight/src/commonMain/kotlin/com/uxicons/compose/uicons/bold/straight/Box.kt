package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Box: ImageVector? = null

val Icons.Bs.Box: ImageVector
    get() = _Box ?: UXIcon(name = "Box") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineToRelative(7f)
                horizontalLineTo(1f)
                verticalLineTo(24f)
                horizontalLineTo(23f)
                verticalLineTo(10f)
                horizontalLineToRelative(1f)
                close()
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                close()
                moveTo(20f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _Box = it}

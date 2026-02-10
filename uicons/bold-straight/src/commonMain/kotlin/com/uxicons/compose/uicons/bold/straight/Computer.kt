package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Computer: ImageVector? = null

val Icons.Bs.Computer: ImageVector
    get() = _Computer ?: UXIcon(name = "Computer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(19f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(13.5f)
                verticalLineTo(19f)
                close()
                moveTo(21f, 3f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
            }
        }.also { _Computer = it}

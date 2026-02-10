package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reflect: ImageVector? = null

val Icons.Bs.Reflect: ImageVector
    get() = _Reflect ?: UXIcon(name = "Reflect") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(24f)
                close()
                moveTo(9.67f, 0.52f)
                lineTo(9.54f, 0.43f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(21.01f)
                close()
                moveTo(8f, 3.01f)
                lineTo(11.99f, 6f)
                horizontalLineTo(8f)
                close()
                moveTo(9.54f, 23.57f)
                lineTo(21.01f, 15f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.54f, 23.57f)
                close()
                moveTo(11.99f, 18f)
                lineTo(8f, 20.99f)
                verticalLineTo(18f)
                close()
            }
        }.also { _Reflect = it}

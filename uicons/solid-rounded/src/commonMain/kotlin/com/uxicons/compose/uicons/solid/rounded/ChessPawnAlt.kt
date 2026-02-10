package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawnAlt: ImageVector? = null

val Icons.Sr.ChessPawnAlt: ImageVector
    get() = _ChessPawnAlt ?: UXIcon(name = "ChessPawnAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                horizontalLineToRelative(0.54f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.93f, 0f)
                horizontalLineTo(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 7f)
                close()
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                close()
                moveTo(15.07f, 10f)
                horizontalLineTo(8.93f)
                curveTo(8.57f, 15.26f, 6.78f, 18f, 5f, 18f)
                horizontalLineTo(19f)
                curveTo(17.23f, 18f, 15.43f, 15.26f, 15.07f, 10f)
                close()
            }
        }.also { _ChessPawnAlt = it}

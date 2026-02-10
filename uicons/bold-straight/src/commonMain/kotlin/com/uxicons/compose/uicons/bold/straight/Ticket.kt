package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ticket: ImageVector? = null

val Icons.Bs.Ticket: ImageVector
    get() = _Ticket ?: UXIcon(name = "Ticket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                horizontalLineTo(13.31f)
                verticalLineTo(1.5f)
                arcToRelative(1.31f, 1.31f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.62f, 0f)
                verticalLineTo(0f)
                horizontalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                verticalLineTo(24f)
                horizontalLineToRelative(7.69f)
                verticalLineTo(22.5f)
                arcToRelative(1.31f, 1.31f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.62f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 0f)
                close()
                moveTo(16.05f, 21f)
                arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.1f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(7.95f)
                arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.1f, 0f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Ticket = it}

package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ticket: ImageVector? = null

val Icons.Rs.Ticket: ImageVector
    get() = _Ticket ?: UXIcon(name = "Ticket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                horizontalLineTo(14f)
                verticalLineTo(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                verticalLineTo(0f)
                horizontalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                verticalLineTo(24f)
                horizontalLineToRelative(7f)
                verticalLineTo(23f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 0f)
                close()
                moveTo(15.87f, 22f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.75f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(8.13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, 0f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Ticket = it}

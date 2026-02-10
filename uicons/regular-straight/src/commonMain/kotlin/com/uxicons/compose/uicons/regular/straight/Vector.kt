package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vector: ImageVector? = null

val Icons.Rs.Vector: ImageVector
    get() = _Vector ?: UXIcon(name = "Vector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                lineTo(2.98f, 11f)
                lineToRelative(2f, 0.01f)
                lineTo(5f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(4.98f)
                lineTo(11f, 5f)
                lineToRelative(0.01f, -2f)
                lineTo(8f, 2.98f)
                close()
                moveTo(6f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 3f)
                lineToRelative(-3.0f, -0.02f)
                lineToRelative(-0.01f, 2f)
                lineTo(16f, 5f)
                lineTo(16f, 8f)
                horizontalLineToRelative(3.02f)
                lineTo(19f, 11f)
                lineToRelative(2f, 0.01f)
                lineTo(21.02f, 8f)
                lineTo(24f, 8f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(22f, 6f)
                lineTo(18f, 6f)
                lineTo(18f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.02f, 13.01f)
                lineToRelative(-2f, -0.01f)
                lineTo(19.0f, 16f)
                horizontalLineTo(16f)
                verticalLineToRelative(3.02f)
                lineTo(13.01f, 19f)
                lineTo(13f, 21f)
                lineTo(16f, 21.02f)
                verticalLineTo(24f)
                horizontalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(16f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(22f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineToRelative(4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 16f)
                horizontalLineTo(4.99f)
                lineTo(5f, 13.01f)
                lineTo(3f, 13f)
                lineTo(2.98f, 16f)
                horizontalLineTo(0f)
                verticalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3f)
                lineTo(11f, 21.02f)
                lineToRelative(0.01f, -2f)
                lineTo(8f, 19.0f)
                close()
                moveTo(6f, 22f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                close()
            }
        }.also { _Vector = it}

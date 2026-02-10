package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Upload: ImageVector? = null

val Icons.Rs.Upload: ImageVector
    get() = _Upload ?: UXIcon(name = "Upload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 16f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                verticalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.97f, 0f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.85f, 0.87f)
                lineTo(5.93f, 4.79f)
                lineTo(7.34f, 6.21f)
                lineToRelative(3.63f, -3.63f)
                lineTo(11f, 19f)
                lineToRelative(2f, 0f)
                lineTo(12.97f, 2.59f)
                lineToRelative(3.62f, 3.62f)
                lineToRelative(1.41f, -1.41f)
                lineTo(14.09f, 0.87f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.97f, 0f)
                close()
            }
        }.also { _Upload = it}

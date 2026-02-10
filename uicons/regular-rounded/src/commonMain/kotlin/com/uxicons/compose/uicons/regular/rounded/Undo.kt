package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Undo: ImageVector? = null

val Icons.Rr.Undo: ImageVector
    get() = _Undo ?: UXIcon(name = "Undo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                horizontalLineTo(10.17f)
                verticalLineToRelative(1.59f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.76f, 20f)
                lineTo(0.88f, 14.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.24f)
                lineTo(6.76f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.17f, 5.41f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 9f)
                verticalLineToRelative(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 24f)
                close()
                moveTo(8.17f, 5.41f)
                lineTo(2.29f, 11.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                lineTo(8.17f, 18.59f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineTo(16f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2.71f)
                verticalLineTo(16f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -7f)
                horizontalLineTo(9.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
            }
        }.also { _Undo = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Edit: ImageVector? = null

val Icons.Rr.Edit: ImageVector
    get() = _Edit ?: UXIcon(name = "Edit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.66f, 0.93f)
                lineTo(6.46f, 13.12f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 16.66f)
                lineTo(5f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                lineTo(7.34f, 19f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, -1.46f)
                lineTo(23.07f, 5.34f)
                arcToRelative(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.41f)
                arcTo(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.66f, 0.93f)
                close()
                moveTo(21.66f, 3.93f)
                lineTo(9.46f, 16.12f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.34f, 17f)
                lineTo(7f, 17f)
                verticalLineToRelative(-0.34f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.88f, -2.12f)
                lineTo(20.07f, 2.34f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, 0f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.66f, 3.93f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                horizontalLineToRelative(9.04f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(16.34f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, -1.46f)
                lineToRelative(2.66f, -2.66f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.34f)
                verticalLineTo(9.98f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 8.98f)
                close()
                moveTo(18.46f, 21.12f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.47f, 0.8f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(3.92f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, 1.46f)
                close()
            }
        }.also { _Edit = it}

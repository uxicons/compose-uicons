package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Edit: ImageVector? = null

val Icons.Rs.Edit: ImageVector
    get() = _Edit ?: UXIcon(name = "Edit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 19f)
                lineTo(9.41f, 19f)
                lineTo(23.06f, 5.36f)
                arcToRelative(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.41f)
                arcToRelative(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.41f, 0f)
                lineTo(5f, 14.59f)
                close()
                moveTo(7f, 15.41f)
                lineTo(20.06f, 2.36f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, 0f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.59f)
                lineTo(8.59f, 17f)
                lineTo(7f, 17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.62f, 7.62f)
                lineTo(22f, 9.24f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineToRelative(6f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(14.76f)
                lineTo(16.38f, 0.38f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.84f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(18.41f)
                lineTo(24f, 18.41f)
                verticalLineTo(7.16f)
                arcTo(5.15f, 5.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.62f, 7.62f)
                close()
                moveTo(18f, 21.59f)
                verticalLineTo(18f)
                horizontalLineToRelative(3.59f)
                close()
            }
        }.also { _Edit = it}

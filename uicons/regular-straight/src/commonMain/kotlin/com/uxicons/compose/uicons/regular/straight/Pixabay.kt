package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pixabay: ImageVector? = null

val Icons.Rs.Pixabay: ImageVector
    get() = _Pixabay ?: UXIcon(name = "Pixabay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(13f)
                moveToRelative(2f, -2f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineToRelative(8f)
                horizontalLineTo(15f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                moveToRelative(0f, -2f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineToRelative(7f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 15f)
                verticalLineToRelative(7f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                moveToRelative(2f, -2f)
                horizontalLineTo(0f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                moveToRelative(2f, -2f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(13f)
                close()
            }
        }.also { _Pixabay = it}

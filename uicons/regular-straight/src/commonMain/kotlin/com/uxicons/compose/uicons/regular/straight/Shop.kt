package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shop: ImageVector? = null

val Icons.Rs.Shop: ImageVector
    get() = _Shop ?: UXIcon(name = "Shop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                lineTo(21.8f, 0f)
                horizontalLineTo(2.2f)
                lineTo(0.02f, 9.78f)
                lineTo(0f, 11f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2.62f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(13.62f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11f)
                close()
                moveTo(2f, 10.11f)
                lineTo(3.8f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                horizontalLineToRelative(3.2f)
                lineTo(22f, 10.11f)
                verticalLineTo(11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                horizontalLineTo(15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
                moveTo(20f, 22f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(14.86f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 15f)
                horizontalLineTo(5f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -1.38f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15f)
                horizontalLineToRelative(2f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -1.36f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                horizontalLineToRelative(1f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -0.14f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                close()
            }
        }.also { _Shop = it}

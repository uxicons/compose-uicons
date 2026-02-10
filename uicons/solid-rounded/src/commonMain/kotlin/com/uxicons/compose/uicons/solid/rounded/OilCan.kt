package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilCan: ImageVector? = null

val Icons.Sr.OilCan: ImageVector
    get() = _OilCan ?: UXIcon(name = "OilCan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.59f, 8.19f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, -0.14f)
                lineTo(16.86f, 9.96f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.91f, -0.19f)
                arcTo(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.69f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(5.97f)
                lineTo(4.05f, 7.19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                verticalLineToRelative(1.47f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.67f, 3.77f)
                lineTo(4f, 15.71f)
                verticalLineTo(16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(5.15f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.81f, -1.76f)
                lineToRelative(6.8f, -8.01f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 9.58f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.59f, 8.19f)
                close()
                moveTo(3.33f, 13.35f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11.47f)
                verticalLineTo(10f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, -0.82f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.88f, -0.13f)
                lineTo(4f, 9.34f)
                verticalLineToRelative(4.25f)
                close()
                moveTo(23.41f, 16.6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.83f, 0f)
                lineToRelative(0.8f, -0.9f)
                arcToRelative(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.23f, 0f)
                close()
            }
        }.also { _OilCan = it}

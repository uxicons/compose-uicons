package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheese: ImageVector? = null

val Icons.Rr.Cheese: ImageVector
    get() = _Cheese ?: UXIcon(name = "Cheese") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 11f)
                close()
                moveTo(8f, 17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.59f, 6.7f)
                lineTo(13.75f, 0.85f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.04f, 0.96f)
                arcTo(19.89f, 19.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, 10.57f)
                arcToRelative(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.03f, 0.16f)
                arcToRelative(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.28f, 0.67f)
                arcToRelative(13.86f, 13.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.53f, 24f)
                horizontalLineTo(9.15f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.92f, -1.46f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.86f, 0f)
                arcTo(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.85f, 24f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(11.51f)
                arcTo(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.59f, 6.7f)
                close()
                moveTo(9.24f, 2.56f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.36f, -0.08f)
                lineTo(19.99f, 8f)
                horizontalLineTo(5.53f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.16f, 0.14f)
                arcTo(18.19f, 18.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.24f, 2.56f)
                close()
                moveTo(22f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineToRelative(-3.17f, -0.07f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.15f, 22f)
                horizontalLineTo(5.53f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.84f, -2.04f)
                arcToRelative(11.87f, 11.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.92f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.53f, 10f)
                horizontalLineTo(21.7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.3f, 1.51f)
                close()
            }
        }.also { _Cheese = it}

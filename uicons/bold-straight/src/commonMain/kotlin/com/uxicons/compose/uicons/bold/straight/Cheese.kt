package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheese: ImageVector? = null

val Icons.Bs.Cheese: ImageVector
    get() = _Cheese ?: UXIcon(name = "Cheese") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 16f)
                close()
                moveTo(8f, 17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17f)
                close()
                moveTo(24f, 8.77f)
                verticalLineTo(24f)
                horizontalLineTo(5.23f)
                arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.08f, -2.61f)
                arcToRelative(13.32f, 13.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.52f, -9.41f)
                curveToRelative(0.4f, -1.44f, 2.26f, -7.28f, 7.12f, -10.92f)
                arcTo(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.03f, 0.93f)
                close()
                moveTo(5.58f, 8f)
                horizontalLineTo(18.17f)
                lineTo(12.32f, 3.4f)
                arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.98f, 3f)
                arcToRelative(2.26f, 2.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.44f, 0.46f)
                arcTo(15.48f, 15.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.58f, 8f)
                close()
                moveTo(21f, 11f)
                horizontalLineTo(5.23f)
                arcToRelative(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.35f, 0.84f)
                arcTo(11.19f, 11.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 16f)
                arcToRelative(10.28f, 10.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.88f, 4.16f)
                arcTo(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.23f, 21f)
                horizontalLineTo(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.31f, -2.98f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.99f, 21f)
                horizontalLineTo(21f)
                close()
            }
        }.also { _Cheese = it}

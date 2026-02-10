package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Feather: ImageVector? = null

val Icons.Bs.Feather: ImageVector
    get() = _Feather ?: UXIcon(name = "Feather") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 0.88f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.56f, -0.85f)
                arcToRelative(28.43f, 28.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.26f, 7.58f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.97f, 9.93f)
                lineToRelative(-4.27f, 4.26f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.27f, -4.27f)
                arcToRelative(7.61f, 7.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.29f, 1.33f)
                arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -2.59f)
                arcToRelative(28.73f, 28.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.23f, -14.99f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.85f, -2.54f)
                close()
                moveTo(6.01f, 13.42f)
                arcToRelative(4.9f, 4.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.42f, -3.69f)
                curveToRelative(0.19f, -0.19f, 0.38f, -0.36f, 0.58f, -0.54f)
                verticalLineToRelative(4.69f)
                lineToRelative(-1.49f, 1.49f)
                arcToRelative(4.86f, 4.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.51f, -1.95f)
                close()
                moveTo(14.57f, 16.33f)
                arcToRelative(5.13f, 5.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.95f, 1.17f)
                lineToRelative(4.5f, -4.5f)
                horizontalLineToRelative(4.06f)
                arcToRelative(22.07f, 22.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.61f, 3.33f)
                close()
                moveTo(18.84f, 10f)
                horizontalLineToRelative(-2.71f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-4.94f, 4.94f)
                verticalLineToRelative(-4.03f)
                arcToRelative(26.73f, 26.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, -3.86f)
                arcToRelative(26.5f, 26.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.16f, 7.01f)
                close()
            }
        }.also { _Feather = it}

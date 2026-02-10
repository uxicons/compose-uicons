package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Sr.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.87f, 11.02f)
                horizontalLineTo(5.13f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, -3.56f)
                lineTo(10.05f, 0.87f)
                arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.94f, 0.03f)
                lineToRelative(6.43f, 6.53f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.54f, 3.59f)
                close()
                moveTo(12f, 24.01f)
                arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.99f, -0.89f)
                lineTo(3.58f, 16.6f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.54f, -3.59f)
                horizontalLineTo(18.87f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, 3.56f)
                lineToRelative(-6.49f, 6.59f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24.01f)
                close()
            }
        }.also { _Sort = it}

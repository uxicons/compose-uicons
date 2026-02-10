package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Rr.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.87f, 11.02f)
                lineTo(5.13f, 11.02f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, -3.56f)
                lineTo(10.05f, 0.87f)
                arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.94f, 0.03f)
                lineToRelative(6.43f, 6.53f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.54f, 3.59f)
                close()
                moveTo(5.01f, 8.84f)
                arcToRelative(0.12f, 0.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.11f)
                arcToRelative(0.11f, 0.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.11f, 0.07f)
                lineTo(18.87f, 9.02f)
                arcToRelative(0.11f, 0.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.11f, -0.07f)
                arcToRelative(0.11f, 0.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, -0.14f)
                lineTo(12.53f, 2.28f)
                arcTo(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.02f)
                arcToRelative(0.66f, 0.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.22f)
                lineTo(5.01f, 8.84f)
                close()
                moveTo(12f, 24.01f)
                arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.99f, -0.89f)
                lineTo(3.58f, 16.6f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.54f, -3.59f)
                lineTo(18.87f, 13.01f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, 3.56f)
                lineToRelative(-6.49f, 6.59f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24.01f)
                close()
                moveTo(5.13f, 15.01f)
                arcToRelative(0.12f, 0.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.09f, 0.21f)
                lineToRelative(6.44f, 6.53f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.53f, 0.26f)
                arcToRelative(0.67f, 0.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.22f)
                lineToRelative(6.49f, -6.6f)
                horizontalLineToRelative(0f)
                arcToRelative(0.11f, 0.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.11f)
                arcToRelative(0.11f, 0.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.11f, -0.07f)
                close()
            }
        }.also { _Sort = it}

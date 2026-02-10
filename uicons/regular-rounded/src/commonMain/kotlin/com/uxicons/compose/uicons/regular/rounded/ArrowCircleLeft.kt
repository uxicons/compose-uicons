package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleLeft: ImageVector? = null

val Icons.Rr.ArrowCircleLeft: ImageVector
    get() = _ArrowCircleLeft ?: UXIcon(name = "ArrowCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 22f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                close()
                moveTo(10.88f, 17.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                lineTo(7.59f, 13f)
                lineTo(18f, 12.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(7.59f, 11f)
                lineToRelative(3.29f, -3.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9.49f, 6.27f)
                lineToRelative(-0.03f, 0.02f)
                lineTo(5.88f, 9.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                horizontalLineToRelative(0f)
                lineToRelative(3.59f, 3.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.88f, 17.71f)
                close()
            }
        }.also { _ArrowCircleLeft = it}

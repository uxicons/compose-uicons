package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallRight: ImageVector? = null

val Icons.Rr.AngleDoubleSmallRight: ImageVector
    get() = _AngleDoubleSmallRight ?: UXIcon(name = "AngleDoubleSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.1f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, -1.71f)
                lineTo(17f, 12.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.42f)
                lineTo(12.4f, 6.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.42f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                lineTo(18.4f, 9.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.24f)
                lineToRelative(-4.59f, 4.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.1f, 19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.1f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, -1.71f)
                lineTo(10.69f, 12f)
                lineTo(5.4f, 6.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.42f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                lineToRelative(6f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.42f)
                lineToRelative(-6f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.1f, 19f)
                close()
            }
        }.also { _AngleDoubleSmallRight = it}

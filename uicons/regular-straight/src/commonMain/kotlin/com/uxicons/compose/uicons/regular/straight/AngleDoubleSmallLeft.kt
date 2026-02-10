package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallLeft: ImageVector? = null

val Icons.Rs.AngleDoubleSmallLeft: ImageVector
    get() = _AngleDoubleSmallLeft ?: UXIcon(name = "AngleDoubleSmallLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.19f, 6.71f)
                lineTo(9.78f, 5.29f)
                lineTo(4.48f, 10.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.83f)
                lineToRelative(5.29f, 5.29f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.9f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.19f, 6.71f)
                lineTo(16.77f, 5.29f)
                lineToRelative(-6f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                lineToRelative(6f, 6f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.9f, 12f)
                close()
            }
        }.also { _AngleDoubleSmallLeft = it}

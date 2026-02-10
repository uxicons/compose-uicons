package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleRight: ImageVector? = null

val Icons.Rr.AngleRight: ImageVector
    get() = _AngleRight ?: UXIcon(name = "AngleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.42f)
                lineToRelative(8.17f, -8.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                lineTo(6.29f, 1.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.71f, 0.29f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7.08f)
                lineTo(7.71f, 23.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 24f)
                close()
            }
        }.also { _AngleRight = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleRight: ImageVector? = null

val Icons.Rr.AngleDoubleRight: ImageVector
    get() = _AngleDoubleRight ?: UXIcon(name = "AngleDoubleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.83f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.42f)
                lineToRelative(8.17f, -8.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                lineTo(11.12f, 1.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.54f, 0.29f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7.08f)
                lineToRelative(-8.17f, 8.17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.83f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.83f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.42f)
                lineToRelative(9.59f, -9.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.42f)
                lineTo(1.12f, 1.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.54f, 0.29f)
                lineToRelative(9.58f, 9.59f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.24f)
                lineTo(2.54f, 23.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, 24f)
                close()
            }
        }.also { _AngleDoubleRight = it}

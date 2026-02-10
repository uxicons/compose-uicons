package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleLeft: ImageVector? = null

val Icons.Rr.AngleDoubleLeft: ImageVector
    get() = _AngleDoubleLeft ?: UXIcon(name = "AngleDoubleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -0.29f)
                lineTo(3.12f, 15.54f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.08f)
                lineTo(11.29f, 0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.42f, 1.42f)
                lineTo(4.54f, 9.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.42f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -0.29f)
                lineToRelative(-9.58f, -9.59f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.24f)
                lineTo(21.29f, 0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.42f, 1.42f)
                lineToRelative(-9.59f, 9.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.42f)
                lineToRelative(9.59f, 9.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.42f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 24f)
                close()
            }
        }.also { _AngleDoubleLeft = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fork: ImageVector? = null

val Icons.Rr.Fork: ImageVector
    get() = _Fork ?: UXIcon(name = "Fork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 5.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineToRelative(-5.17f, 5.17f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.4f, 0.57f)
                lineToRelative(6.98f, -6.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, -1.41f)
                lineTo(12.3f, 10.29f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.58f, -3.41f)
                lineTo(18.05f, 1.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.64f, 0.29f)
                lineTo(11.46f, 5.46f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, 6.29f)
                lineTo(0.29f, 22.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                lineTo(12.24f, 13.17f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.29f, -0.64f)
                lineToRelative(5.17f, -5.17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.71f, 5.95f)
                close()
            }
        }.also { _Fork = it}

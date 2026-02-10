package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fork: ImageVector? = null

val Icons.Bs.Fork: ImageVector
    get() = _Fork ?: UXIcon(name = "Fork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.79f, 7.16f)
                lineTo(15.07f, 13.88f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
                lineTo(13.3f, 12.82f)
                lineToRelative(7.07f, -7.07f)
                lineTo(18.25f, 3.63f)
                lineTo(11.18f, 10.7f)
                lineTo(10.12f, 9.64f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.71f)
                lineToRelative(6.72f, -6.72f)
                lineTo(14.72f, 0.09f)
                lineTo(8f, 6.81f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-9f, 8.99f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(8.99f, -9f)
                lineTo(12.24f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
                lineToRelative(6.72f, -6.72f)
                close()
            }
        }.also { _Fork = it}

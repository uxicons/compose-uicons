package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fork: ImageVector? = null

val Icons.Rs.Fork: ImageVector
    get() = _Fork ?: UXIcon(name = "Fork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.61f, 5.64f)
                lineToRelative(-6.07f, 6.07f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineTo(14.41f, 11f)
                lineToRelative(6.78f, -6.78f)
                lineTo(19.78f, 2.81f)
                lineTo(13f, 9.59f)
                lineToRelative(-0.71f, -0.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
                lineToRelative(6.07f, -6.07f)
                lineTo(16.95f, -0.02f)
                lineTo(10.88f, 6.05f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(0.71f, 0.71f)
                lineTo(0.04f, 22.54f)
                lineToRelative(1.41f, 1.41f)
                lineTo(13f, 12.41f)
                lineToRelative(0.71f, 0.71f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(24.02f, 7.05f)
                close()
            }
        }.also { _Fork = it}

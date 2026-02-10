package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Share: ImageVector? = null

val Icons.Ss.Share: ImageVector
    get() = _Share ?: UXIcon(name = "Share") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.33f, 14.67f)
                arcTo(4.66f, 4.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.49f, 16.69f)
                lineToRelative(-6.5f, -2.94f)
                arcTo(4.67f, 4.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10.26f)
                lineToRelative(6.49f, -2.95f)
                arcToRelative(4.67f, 4.67f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.82f, -2.65f)
                arcToRelative(4.71f, 4.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.07f, 0.79f)
                lineTo(7.85f, 8.59f)
                arcToRelative(4.67f, 4.67f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.01f, 6.84f)
                lineToRelative(6.9f, 3.12f)
                arcToRelative(4.67f, 4.67f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.6f, -3.88f)
                close()
            }
        }.also { _Share = it}

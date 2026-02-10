package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clip: ImageVector? = null

val Icons.Bs.Clip: ImageVector
    get() = _Clip ?: UXIcon(name = "Clip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.14f, 24f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.78f, 8.65f)
                lineTo(9.53f, 1.9f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.19f, 9.19f)
                lineToRelative(-6.74f, 6.74f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -5.66f)
                lineToRelative(6.39f, -6.39f)
                lineToRelative(2.12f, 2.12f)
                lineTo(8.44f, 14.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineTo(16.6f, 8.97f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.95f, -4.95f)
                lineTo(4.9f, 10.77f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.48f, 8.48f)
                lineToRelative(6.39f, -6.39f)
                lineTo(21.9f, 14.98f)
                lineToRelative(-6.39f, 6.39f)
                arcTo(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.14f, 24f)
                close()
            }
        }.also { _Clip = it}

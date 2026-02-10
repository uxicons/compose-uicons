package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clip: ImageVector? = null

val Icons.Rr.Clip: ImageVector
    get() = _Clip ?: UXIcon(name = "Clip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.95f, 9.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(10.64f, 20.54f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.07f, -7.07f)
                lineTo(14.12f, 2.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 4.24f)
                lineTo(7.82f, 17.71f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
                lineToRelative(9.39f, -9.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                lineTo(4.99f, 14.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(19.78f, 8.53f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, -7.07f)
                lineTo(2.16f, 12.05f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.9f, 9.9f)
                lineTo(22.95f, 11.02f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.95f, 9.6f)
                close()
            }
        }.also { _Clip = it}

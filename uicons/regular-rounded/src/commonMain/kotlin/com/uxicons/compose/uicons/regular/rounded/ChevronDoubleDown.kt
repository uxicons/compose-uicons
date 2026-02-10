package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDown: ImageVector? = null

val Icons.Rr.ChevronDoubleDown: ImageVector
    get() = _ChevronDoubleDown ?: UXIcon(name = "ChevronDoubleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.3f, 12.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(8.17f, -8.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-8.17f, 8.17f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0.3f, 13.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.3f, 2.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                lineToRelative(9.59f, 9.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(9.59f, -9.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-9.59f, 9.59f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineTo(0.3f, 3.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
                close()
            }
        }.also { _ChevronDoubleDown = it}

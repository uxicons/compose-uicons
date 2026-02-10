package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleUp: ImageVector? = null

val Icons.Sr.ChevronDoubleUp: ImageVector
    get() = _ChevronDoubleUp ?: UXIcon(name = "ChevronDoubleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.01f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, -0.71f)
                lineTo(8.48f, 3.12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.07f, 0f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 1.41f)
                lineTo(14.13f, 4.54f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineTo(1.72f, 12.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.01f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, -0.71f)
                lineToRelative(9.59f, -9.59f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                lineToRelative(9.59f, 9.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 1.41f)
                lineToRelative(-9.59f, -9.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(1.72f, 22.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 22f)
                close()
            }
        }.also { _ChevronDoubleUp = it}

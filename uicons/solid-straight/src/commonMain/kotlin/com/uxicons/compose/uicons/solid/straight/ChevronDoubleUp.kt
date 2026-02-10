package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleUp: ImageVector? = null

val Icons.Ss.ChevronDoubleUp: ImageVector
    get() = _ChevronDoubleUp ?: UXIcon(name = "ChevronDoubleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.71f, 3.12f)
                lineToRelative(9.89f, 9.89f)
                lineTo(24.02f, 11.6f)
                lineTo(14.13f, 1.71f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineTo(0f, 11.59f)
                lineTo(1.41f, 13f)
                lineTo(11.3f, 3.12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.71f, 3.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.59f, 23f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-11.29f, -11.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(0.01f, 21.58f)
                lineTo(1.42f, 23f)
                lineTo(12.01f, 12.41f)
                close()
            }
        }.also { _ChevronDoubleUp = it}

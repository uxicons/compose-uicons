package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagicWand: ImageVector? = null

val Icons.Bs.MagicWand: ImageVector
    get() = _MagicWand ?: UXIcon(name = "MagicWand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.45f, 4.33f)
                lineTo(1.15f, 17.3f)
                arcTo(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.92f, 24f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.76f, -1.14f)
                lineTo(20f, 9.88f)
                close()
                moveTo(15.73f, 9.85f)
                lineTo(13.12f, 12.39f)
                lineToRelative(-1.31f, -1.31f)
                lineToRelative(2.61f, -2.54f)
                close()
                moveTo(4.58f, 20.73f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.31f, 0f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, -1.29f)
                lineToRelative(6.41f, -6.25f)
                lineToRelative(1.31f, 1.31f)
                close()
                moveTo(21.33f, 15.67f)
                lineTo(24f, 17f)
                lineToRelative(-2.67f, 1.33f)
                lineTo(20f, 21f)
                lineToRelative(-1.33f, -2.67f)
                lineTo(16f, 17f)
                lineToRelative(2.67f, -1.33f)
                lineTo(20f, 13f)
                close()
                moveTo(5.67f, 5.33f)
                lineTo(3f, 4f)
                lineTo(5.67f, 2.67f)
                lineTo(7f, 0f)
                lineTo(8.33f, 2.67f)
                lineTo(11f, 4f)
                lineTo(8.33f, 5.33f)
                lineTo(7f, 8f)
                close()
                moveTo(19.33f, 4.67f)
                lineTo(17f, 3.5f)
                lineToRelative(2.33f, -1.17f)
                lineTo(20.5f, 0f)
                lineToRelative(1.17f, 2.33f)
                lineTo(24f, 3.5f)
                lineTo(21.67f, 4.67f)
                lineTo(20.5f, 7f)
                close()
            }
        }.also { _MagicWand = it}

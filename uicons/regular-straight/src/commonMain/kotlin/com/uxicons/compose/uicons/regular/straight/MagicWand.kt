package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagicWand: ImageVector? = null

val Icons.Rs.MagicWand: ImageVector
    get() = _MagicWand ?: UXIcon(name = "MagicWand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.08f, 5.59f)
                lineTo(0.9f, 18.77f)
                arcTo(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.23f, 23.1f)
                lineTo(18.41f, 9.92f)
                close()
                moveTo(15.59f, 9.92f)
                lineTo(13f, 12.51f)
                lineTo(11.5f, 11f)
                lineToRelative(2.59f, -2.59f)
                close()
                moveTo(3.82f, 21.69f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                arcToRelative(1.06f, 1.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                lineToRelative(7.77f, -7.77f)
                lineToRelative(1.5f, 1.5f)
                close()
                moveTo(21.33f, 14.63f)
                lineTo(24f, 15.96f)
                lineTo(21.33f, 17.3f)
                lineTo(20f, 19.96f)
                lineTo(18.67f, 17.3f)
                lineTo(16f, 15.96f)
                lineToRelative(2.67f, -1.33f)
                lineTo(20f, 11.96f)
                close()
                moveTo(6.67f, 5.33f)
                lineTo(4f, 4f)
                lineTo(6.67f, 2.67f)
                lineTo(8f, 0f)
                lineTo(9.33f, 2.67f)
                lineTo(12f, 4f)
                lineTo(9.33f, 5.33f)
                lineTo(8f, 8f)
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

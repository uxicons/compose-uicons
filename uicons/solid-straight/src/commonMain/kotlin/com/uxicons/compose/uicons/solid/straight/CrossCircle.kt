package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossCircle: ImageVector? = null

val Icons.Ss.CrossCircle: ImageVector
    get() = _CrossCircle ?: UXIcon(name = "CrossCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(16.71f, 15.29f)
                lineTo(15.29f, 16.71f)
                lineTo(12f, 13.41f)
                lineTo(8.71f, 16.71f)
                lineTo(7.29f, 15.29f)
                lineTo(10.59f, 12f)
                lineTo(7.29f, 8.71f)
                lineTo(8.71f, 7.29f)
                lineTo(12f, 10.59f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(1.41f, 1.41f)
                lineTo(13.41f, 12f)
                close()
            }
        }.also { _CrossCircle = it}

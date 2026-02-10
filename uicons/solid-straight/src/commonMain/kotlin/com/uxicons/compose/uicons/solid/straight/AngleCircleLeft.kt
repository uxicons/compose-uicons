package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleLeft: ImageVector? = null

val Icons.Ss.AngleCircleLeft: ImageVector
    get() = _AngleCircleLeft ?: UXIcon(name = "AngleCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(8.59f, 13.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.83f)
                lineToRelative(4.67f, -4.67f)
                lineToRelative(1.41f, 1.41f)
                lineTo(10f, 12f)
                lineToRelative(4.71f, 4.71f)
                lineTo(13.3f, 18.13f)
                close()
            }
        }.also { _AngleCircleLeft = it}

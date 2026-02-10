package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleDown: ImageVector? = null

val Icons.Ss.AngleCircleDown: ImageVector
    get() = _AngleCircleDown ?: UXIcon(name = "AngleCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(13.41f, 15.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 0f)
                lineTo(5.91f, 10.74f)
                lineTo(7.33f, 9.33f)
                lineTo(12f, 14f)
                lineToRelative(4.71f, -4.71f)
                lineTo(18.13f, 10.7f)
                close()
            }
        }.also { _AngleCircleDown = it}

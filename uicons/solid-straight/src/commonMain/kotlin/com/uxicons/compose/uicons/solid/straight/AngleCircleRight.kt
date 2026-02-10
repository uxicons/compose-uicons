package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleRight: ImageVector? = null

val Icons.Ss.AngleCircleRight: ImageVector
    get() = _AngleCircleRight ?: UXIcon(name = "AngleCircleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                close()
                moveTo(15.41f, 10.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.83f)
                lineToRelative(-4.67f, 4.67f)
                lineTo(9.33f, 16.67f)
                lineTo(14f, 12f)
                lineTo(9.29f, 7.29f)
                lineTo(10.7f, 5.87f)
                close()
            }
        }.also { _AngleCircleRight = it}

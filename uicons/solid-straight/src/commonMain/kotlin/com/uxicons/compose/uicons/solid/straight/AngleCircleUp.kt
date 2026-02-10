package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleUp: ImageVector? = null

val Icons.Ss.AngleCircleUp: ImageVector
    get() = _AngleCircleUp ?: UXIcon(name = "AngleCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
                close()
                moveTo(10.59f, 8.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 0f)
                lineToRelative(4.67f, 4.67f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12f, 10f)
                lineTo(7.29f, 14.71f)
                lineTo(5.87f, 13.3f)
                close()
            }
        }.also { _AngleCircleUp = it}

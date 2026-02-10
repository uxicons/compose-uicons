package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleLeft: ImageVector? = null

val Icons.Bs.AngleCircleLeft: ImageVector
    get() = _AngleCircleLeft ?: UXIcon(name = "AngleCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
                moveTo(8.73f, 13.77f)
                lineToRelative(4.25f, 4.25f)
                lineTo(15.1f, 15.9f)
                lineToRelative(-3.9f, -3.9f)
                lineToRelative(3.9f, -3.9f)
                lineTo(12.98f, 5.98f)
                lineToRelative(-4.25f, 4.25f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
                close()
            }
        }.also { _AngleCircleLeft = it}

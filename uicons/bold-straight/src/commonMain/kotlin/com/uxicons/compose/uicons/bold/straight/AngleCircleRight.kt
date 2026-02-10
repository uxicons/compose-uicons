package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleRight: ImageVector? = null

val Icons.Bs.AngleCircleRight: ImageVector
    get() = _AngleCircleRight ?: UXIcon(name = "AngleCircleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(3f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, -9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                close()
                moveTo(15.27f, 10.23f)
                lineTo(11.02f, 5.98f)
                lineTo(8.9f, 8.1f)
                lineToRelative(3.9f, 3.9f)
                lineTo(8.9f, 15.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.54f)
                close()
            }
        }.also { _AngleCircleRight = it}

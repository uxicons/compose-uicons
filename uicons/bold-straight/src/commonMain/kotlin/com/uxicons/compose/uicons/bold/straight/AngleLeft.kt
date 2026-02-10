package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleLeft: ImageVector? = null

val Icons.Bs.AngleLeft: ImageVector
    get() = _AngleLeft ?: UXIcon(name = "AngleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.04f, 24f)
                lineTo(6.53f, 14.48f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.95f)
                lineTo(16.05f, 0f)
                lineTo(18.17f, 2.12f)
                lineTo(8.65f, 11.65f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.71f)
                lineToRelative(9.51f, 9.52f)
                close()
            }
        }.also { _AngleLeft = it}

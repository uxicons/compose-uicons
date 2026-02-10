package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleLeft: ImageVector? = null

val Icons.Ss.AngleLeft: ImageVector
    get() = _AngleLeft ?: UXIcon(name = "AngleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.75f, 23.99f)
                lineTo(6.88f, 14.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.24f)
                lineTo(16.75f, 0.01f)
                lineTo(18.16f, 1.43f)
                lineTo(8.29f, 11.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                lineToRelative(9.87f, 9.87f)
                close()
            }
        }.also { _AngleLeft = it}

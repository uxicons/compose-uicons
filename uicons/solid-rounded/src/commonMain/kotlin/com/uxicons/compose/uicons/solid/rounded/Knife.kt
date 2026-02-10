package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Sr.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2.15f)
                curveToRelative(0.08f, 4.1f, -3.87f, 14.64f, -17.09f, 15.93f)
                lineToRelative(-5.18f, 5.6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.27f, 22.32f)
                lineTo(20.23f, 0.71f)
                arcTo(2.17f, 2.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 2.15f)
                close()
            }
        }.also { _Knife = it}

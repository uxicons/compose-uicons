package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Melon: ImageVector? = null

val Icons.Sr.Melon: ImageVector
    get() = _Melon ?: UXIcon(name = "Melon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.6f, 12.18f)
                lineTo(12.17f, 4.6f)
                lineToRelative(0.67f, 0.67f)
                curveToRelative(3.89f, 5.03f, -2.6f, 11.48f, -7.6f, 7.56f)
                close()
                moveTo(22.37f, 2.32f)
                arcTo(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 1.27f)
                lineTo(13.59f, 3.18f)
                curveToRelative(7.31f, 7.13f, -3.29f, 17.7f, -10.4f, 10.4f)
                lineTo(1.27f, 15.5f)
                arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, 19.24f)
                curveToRelative(0.72f, 3.92f, 5.82f, 4.61f, 9.04f, 4.76f)
                curveTo(19.97f, 24.16f, 27.52f, 12.05f, 22.37f, 2.32f)
                close()
            }
        }.also { _Melon = it}

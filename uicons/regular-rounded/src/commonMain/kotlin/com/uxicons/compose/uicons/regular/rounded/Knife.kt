package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Rr.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.68f, 0.16f)
                arcToRelative(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.44f, 0.56f)
                lineTo(0.27f, 22.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.47f, 1.36f)
                lineToRelative(5.18f, -5.6f)
                curveTo(19.92f, 16.92f, 24.01f, 6.24f, 24f, 2.5f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.68f, 0.16f)
                close()
                moveTo(22f, 2.5f)
                curveToRelative(0f, 1.88f, -2.32f, 11.13f, -12.94f, 13.25f)
                lineTo(21.69f, 2.08f)
                arcToRelative(0.23f, 0.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.24f, -0.07f)
                curveTo(22.05f, 2.02f, 21.98f, 2.42f, 22f, 2.5f)
                close()
            }
        }.also { _Knife = it}

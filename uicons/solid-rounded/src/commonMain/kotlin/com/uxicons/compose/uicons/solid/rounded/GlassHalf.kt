package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassHalf: ImageVector? = null

val Icons.Sr.GlassHalf: ImageVector
    get() = _GlassHalf ?: UXIcon(name = "GlassHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.01f, 3.25f)
                curveToRelative(-0.07f, -0.83f, 0.22f, -1.66f, 0.78f, -2.28f)
                reflectiveCurveToRelative(1.37f, -0.97f, 2.21f, -0.97f)
                horizontalLineToRelative(16f)
                curveToRelative(0.84f, 0f, 1.65f, 0.35f, 2.21f, 0.97f)
                curveToRelative(0.57f, 0.62f, 0.85f, 1.45f, 0.78f, 2.29f)
                lineToRelative(-0.68f, 7.74f)
                lineTo(1.65f, 11f)
                lineToRelative(-0.64f, -7.75f)
                close()
                moveTo(1.81f, 13f)
                lineToRelative(0.53f, 6.41f)
                curveToRelative(0.21f, 2.57f, 2.4f, 4.59f, 4.98f, 4.59f)
                horizontalLineToRelative(9.26f)
                curveToRelative(2.61f, 0f, 4.75f, -1.96f, 4.98f, -4.56f)
                lineToRelative(0.57f, -6.44f)
                lineTo(1.81f, 13f)
                close()
            }
        }.also { _GlassHalf = it}

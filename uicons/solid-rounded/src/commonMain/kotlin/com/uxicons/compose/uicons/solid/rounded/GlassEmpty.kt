package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassEmpty: ImageVector? = null

val Icons.Sr.GlassEmpty: ImageVector
    get() = _GlassEmpty ?: UXIcon(name = "GlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.59f, 24f)
                horizontalLineTo(7.32f)
                curveToRelative(-2.58f, 0f, -4.77f, -2.02f, -4.98f, -4.59f)
                lineTo(1.01f, 3.25f)
                curveToRelative(-0.07f, -0.83f, 0.22f, -1.66f, 0.78f, -2.28f)
                reflectiveCurveToRelative(1.37f, -0.97f, 2.21f, -0.97f)
                horizontalLineToRelative(16f)
                curveToRelative(0.84f, 0f, 1.65f, 0.35f, 2.21f, 0.97f)
                curveToRelative(0.57f, 0.62f, 0.85f, 1.45f, 0.78f, 2.29f)
                lineToRelative(-1.42f, 16.18f)
                curveToRelative(-0.23f, 2.6f, -2.37f, 4.56f, -4.98f, 4.56f)
                close()
            }
        }.also { _GlassEmpty = it}

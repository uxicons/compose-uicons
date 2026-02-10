package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassHalf: ImageVector? = null

val Icons.Rr.GlassHalf: ImageVector
    get() = _GlassHalf ?: UXIcon(name = "GlassHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.21f, 0.97f)
                curveToRelative(-0.57f, -0.62f, -1.37f, -0.97f, -2.21f, -0.97f)
                lineTo(4f, 0f)
                curveToRelative(-0.84f, 0f, -1.64f, 0.35f, -2.21f, 0.97f)
                reflectiveCurveToRelative(-0.85f, 1.45f, -0.78f, 2.28f)
                lineToRelative(1.33f, 16.16f)
                curveToRelative(0.21f, 2.57f, 2.4f, 4.59f, 4.98f, 4.59f)
                horizontalLineToRelative(9.26f)
                curveToRelative(2.61f, 0f, 4.75f, -1.96f, 4.98f, -4.56f)
                lineToRelative(1.42f, -16.18f)
                curveToRelative(0.07f, -0.84f, -0.21f, -1.67f, -0.78f, -2.29f)
                close()
                moveTo(3.27f, 2.32f)
                curveToRelative(0.19f, -0.21f, 0.45f, -0.32f, 0.73f, -0.32f)
                horizontalLineToRelative(16f)
                curveToRelative(0.28f, 0f, 0.55f, 0.12f, 0.74f, 0.32f)
                curveToRelative(0.19f, 0.21f, 0.28f, 0.48f, 0.26f, 0.76f)
                lineToRelative(-0.7f, 7.91f)
                lineTo(3.65f, 11f)
                lineToRelative(-0.65f, -7.92f)
                curveToRelative(-0.02f, -0.28f, 0.07f, -0.55f, 0.26f, -0.76f)
                close()
                moveTo(16.59f, 22f)
                lineTo(7.32f, 22f)
                curveToRelative(-1.55f, 0f, -2.86f, -1.21f, -2.99f, -2.75f)
                lineToRelative(-0.51f, -6.25f)
                horizontalLineToRelative(16.3f)
                lineToRelative(-0.55f, 6.26f)
                curveToRelative(-0.14f, 1.56f, -1.42f, 2.74f, -2.99f, 2.74f)
                close()
            }
        }.also { _GlassHalf = it}

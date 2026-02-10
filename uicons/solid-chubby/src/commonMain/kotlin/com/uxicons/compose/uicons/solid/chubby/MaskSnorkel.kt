package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Sc.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 14f)
                curveToRelative(2.66f, 0f, 5.5f, -1.51f, 5.5f, -5.76f)
                curveToRelative(0f, -4.14f, -3.03f, -6.24f, -9f, -6.24f)
                curveToRelative(-2.46f, 0f, -9f, 0f, -9f, 6.24f)
                curveToRelative(0f, 4.25f, 2.84f, 5.76f, 5.5f, 5.76f)
                curveToRelative(1.51f, 0f, 2.77f, -0.66f, 3.5f, -1.16f)
                curveToRelative(0.73f, 0.5f, 1.99f, 1.16f, 3.5f, 1.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(12.35f)
                curveToRelative(0f, 2.37f, -1.94f, 4.15f, -4.5f, 4.15f)
                curveToRelative(-1.82f, 0f, -4f, -0.61f, -4f, -3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 3.95f, 2.75f, 6.5f, 7f, 6.5f)
                curveToRelative(4.21f, 0f, 7.5f, -3.14f, 7.5f, -7.15f)
                verticalLineToRelative(-12.35f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _MaskSnorkel = it}

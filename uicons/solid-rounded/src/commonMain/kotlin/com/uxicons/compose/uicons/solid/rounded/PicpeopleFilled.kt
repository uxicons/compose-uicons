package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PicpeopleFilled: ImageVector? = null

val Icons.Sr.PicpeopleFilled: ImageVector
    get() = _PicpeopleFilled ?: UXIcon(name = "PicpeopleFilled") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                lineTo(5f, 2f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 6f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(7.64f, 20f)
                curveToRelative(-0.64f, 0f, -1.02f, -0.72f, -0.67f, -1.26f)
                curveToRelative(1.07f, -1.65f, 2.92f, -2.74f, 5.03f, -2.74f)
                reflectiveCurveToRelative(3.97f, 1.09f, 5.03f, 2.74f)
                curveToRelative(0.35f, 0.54f, -0.03f, 1.26f, -0.67f, 1.26f)
                lineTo(7.64f, 20f)
                close()
            }
        }.also { _PicpeopleFilled = it}

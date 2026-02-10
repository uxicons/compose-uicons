package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMat: ImageVector? = null

val Icons.Ss.YogaMat: ImageVector
    get() = _YogaMat ?: UXIcon(name = "YogaMat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 20f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveTo(0f, 22.21f, 0f, 20f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(18f, 15f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.33f, 0f, 2.55f, 0.47f, 3.5f, 1.26f)
                lineTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 15f)
                close()
                moveTo(4f, 14f)
                curveToRelative(1.54f, 0f, 2.94f, 0.59f, 4f, 1.54f)
                lineTo(8f, 4f)
                curveTo(8f, 1.79f, 6.21f, 0f, 4f, 0f)
                reflectiveCurveTo(0f, 1.79f, 0f, 4f)
                lineTo(0f, 15.54f)
                curveToRelative(1.06f, -0.95f, 2.46f, -1.54f, 4f, -1.54f)
                close()
                moveTo(20.5f, 17f)
                horizontalLineToRelative(-4.5f)
                lineTo(16f, 6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.54f, -0.59f, 2.94f, -1.54f, 4f)
                horizontalLineToRelative(12.04f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _YogaMat = it}

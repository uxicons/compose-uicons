package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMat: ImageVector? = null

val Icons.Bs.YogaMat: ImageVector
    get() = _YogaMat ?: UXIcon(name = "YogaMat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                horizontalLineToRelative(-4.5f)
                lineTo(15f, 6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1.5f)
                curveTo(9f, 2.02f, 6.98f, 0f, 4.5f, 0f)
                reflectiveCurveTo(0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(6f, 15.28f)
                curveToRelative(-0.47f, -0.17f, -0.97f, -0.28f, -1.5f, -0.28f)
                reflectiveCurveToRelative(-1.03f, 0.11f, -1.5f, 0.28f)
                lineTo(3f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3f, 19.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 21f)
                lineTo(8.72f, 21f)
                curveToRelative(0.17f, -0.47f, 0.28f, -0.97f, 0.28f, -1.5f)
                lineTo(9f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21f, 15.26f)
                curveToRelative(-0.47f, -0.17f, -0.97f, -0.26f, -1.5f, -0.26f)
                horizontalLineToRelative(-1.5f)
                lineTo(18f, 3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(21f, 15.26f)
                close()
            }
        }.also { _YogaMat = it}

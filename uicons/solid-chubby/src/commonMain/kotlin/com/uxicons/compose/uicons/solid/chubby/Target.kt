package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Target: ImageVector? = null

val Icons.Sc.Target: ImageVector
    get() = _Target ?: UXIcon(name = "Target") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.03f, 12f)
                curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.97f)
                curveTo(22.63f, 2.74f, 17.68f, 1.17f, 13.0f, 1f)
                lineTo(13.0f, 3.97f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(11.0f, 1f)
                curveTo(6.32f, 1.17f, 1.37f, 2.74f, 1.0f, 11.0f)
                lineTo(3.97f, 11.0f)
                curveToRelative(0.55f, 0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 13.0f)
                curveToRelative(0.37f, 8.26f, 5.31f, 9.83f, 9.99f, 10.0f)
                verticalLineToRelative(-2.97f)
                curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.97f)
                curveToRelative(4.68f, -0.17f, 9.63f, -1.74f, 9.99f, -10.0f)
                horizontalLineToRelative(-2.97f)
                curveToRelative(-0.55f, 0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(14.27f, 13.0f)
                horizontalLineToRelative(-1.27f)
                verticalLineToRelative(1.27f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.27f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(-0.55f, 0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.27f)
                verticalLineToRelative(-1.27f)
                curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.27f)
                horizontalLineToRelative(1.27f)
                curveToRelative(0.55f, 0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }.also { _Target = it}

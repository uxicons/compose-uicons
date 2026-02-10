package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exclamation: ImageVector? = null

val Icons.Sc.Exclamation: ImageVector
    get() = _Exclamation ?: UXIcon(name = "Exclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.92f, 1f, 1.08f, 2.25f, 1.08f, 12f)
                reflectiveCurveToRelative(5.83f, 11f, 10.92f, 11f)
                reflectiveCurveToRelative(10.92f, -1.25f, 10.92f, -11f)
                reflectiveCurveTo(17.08f, 1f, 12f, 1f)
                close()
                moveTo(11f, 6.82f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.67f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(11f, 6.82f)
                close()
                moveTo(12f, 18.03f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Exclamation = it}

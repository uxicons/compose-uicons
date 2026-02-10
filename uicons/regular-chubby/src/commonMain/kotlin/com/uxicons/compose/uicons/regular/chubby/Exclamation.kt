package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exclamation: ImageVector? = null

val Icons.Rc.Exclamation: ImageVector
    get() = _Exclamation ?: UXIcon(name = "Exclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.92f, 1f, 1.08f, 2.25f, 1.08f, 12f)
                reflectiveCurveToRelative(5.83f, 11f, 10.92f, 11f)
                reflectiveCurveToRelative(10.92f, -1.25f, 10.92f, -11f)
                reflectiveCurveTo(17.08f, 1f, 12f, 1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.35f, 0f, -8.92f, -1.53f, -8.92f, -9f)
                reflectiveCurveTo(6.65f, 3f, 12f, 3f)
                reflectiveCurveToRelative(8.92f, 1.53f, 8.92f, 9f)
                reflectiveCurveToRelative(-3.56f, 9f, -8.92f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.46f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.67f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(7.46f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.54f)
                curveToRelative(-0.55f, 0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }.also { _Exclamation = it}

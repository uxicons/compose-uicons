package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Manhole: ImageVector? = null

val Icons.Sc.Manhole: ImageVector
    get() = _Manhole ?: UXIcon(name = "Manhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 3f)
                curveToRelative(0.72f, 0f, 1.38f, 0.04f, 2.0f, 0.1f)
                curveToRelative(-0.03f, 1.35f, -0.6f, 1.91f, -2.0f, 1.91f)
                reflectiveCurveToRelative(-1.97f, -0.55f, -2.0f, -1.91f)
                curveToRelative(0.62f, -0.06f, 1.28f, -0.1f, 2.0f, -0.1f)
                close()
                moveTo(6.5f, 7f)
                horizontalLineToRelative(11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-0.72f, 0f, -1.38f, -0.04f, -2.0f, -0.1f)
                curveToRelative(0.03f, -1.35f, 0.6f, -1.91f, 2.0f, -1.91f)
                reflectiveCurveToRelative(1.97f, 0.55f, 2.0f, 1.91f)
                curveToRelative(-0.62f, 0.06f, -1.28f, 0.1f, -2.0f, 0.1f)
                close()
                moveTo(17.5f, 17f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Manhole = it}

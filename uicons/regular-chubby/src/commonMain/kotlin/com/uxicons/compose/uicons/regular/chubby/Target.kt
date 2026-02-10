package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Target: ImageVector? = null

val Icons.Rc.Target: ImageVector
    get() = _Target ?: UXIcon(name = "Target") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(13f, 20.98f)
                verticalLineToRelative(-0.96f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.96f)
                curveToRelative(-4.6f, -0.19f, -7.68f, -1.81f, -7.98f, -7.98f)
                horizontalLineToRelative(0.96f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.96f)
                curveToRelative(0.29f, -6.17f, 3.38f, -7.79f, 7.98f, -7.98f)
                verticalLineToRelative(0.96f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.96f)
                curveToRelative(4.6f, 0.19f, 7.68f, 1.81f, 7.98f, 7.98f)
                horizontalLineToRelative(-0.96f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.96f)
                curveToRelative(-0.29f, 6.17f, -3.38f, 7.79f, -7.98f, 7.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.27f, 11f)
                horizontalLineToRelative(-1.27f)
                verticalLineToRelative(-1.27f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.27f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.27f)
                verticalLineToRelative(1.27f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.27f)
                horizontalLineToRelative(1.27f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Target = it}

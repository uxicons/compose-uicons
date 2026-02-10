package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleMicrophone: ImageVector? = null

val Icons.Sc.CircleMicrophone: ImageVector
    get() = _CircleMicrophone ?: UXIcon(name = "CircleMicrophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0f, -1.4f, 0.6f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.6f, 2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.4f, -0.6f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.6f, -2f, -2f)
                close()
                moveTo(13f, 16.94f)
                verticalLineToRelative(1.06f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.06f)
                curveToRelative(-3.43f, -0.29f, -5f, -2.15f, -5f, -5.94f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 3.03f, 0.97f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -0.97f, 4f, -4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 3.79f, -1.57f, 5.64f, -5f, 5.94f)
                close()
            }
        }.also { _CircleMicrophone = it}

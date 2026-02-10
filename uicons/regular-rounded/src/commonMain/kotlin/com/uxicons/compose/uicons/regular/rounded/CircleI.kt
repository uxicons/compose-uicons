package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleI: ImageVector? = null

val Icons.Rr.CircleI: ImageVector
    get() = _CircleI ?: UXIcon(name = "CircleI") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.04f, 8.02f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(24.04f, 12.02f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0.04f, 18.64f, 0.04f, 12.02f)
                reflectiveCurveTo(5.42f, 0.02f, 12.04f, 0.02f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(22.04f, 12.02f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2.04f, 6.5f, 2.04f, 12.02f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                close()
            }
        }.also { _CircleI = it}

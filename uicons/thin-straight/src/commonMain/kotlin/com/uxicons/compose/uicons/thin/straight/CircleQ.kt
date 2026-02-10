package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQ: ImageVector? = null

val Icons.Ts.CircleQ: ImageVector
    get() = _CircleQ ?: UXIcon(name = "CircleQ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(17f, 13.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(1.26f, 0f, 2.42f, -0.47f, 3.3f, -1.25f)
                lineToRelative(1.6f, 1.6f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-1.62f, -1.62f)
                curveToRelative(0.64f, -0.84f, 1.02f, -1.89f, 1.02f, -3.02f)
                close()
                moveTo(12f, 17.25f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.86f, -0.27f, 1.66f, -0.73f, 2.31f)
                lineToRelative(-1.91f, -1.91f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.94f, 1.94f)
                curveToRelative(-0.7f, 0.59f, -1.6f, 0.95f, -2.59f, 0.95f)
                close()
            }
        }.also { _CircleQ = it}

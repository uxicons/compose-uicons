package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleR: ImageVector? = null

val Icons.Rr.CircleR: ImageVector
    get() = _CircleR ?: UXIcon(name = "CircleR") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.54f, 10.02f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.52f)
                lineToRelative(1.85f, 3.47f)
                curveToRelative(0.18f, 0.34f, 0.53f, 0.53f, 0.88f, 0.53f)
                curveToRelative(0.16f, 0f, 0.32f, -0.04f, 0.47f, -0.12f)
                curveToRelative(0.49f, -0.26f, 0.67f, -0.87f, 0.41f, -1.35f)
                lineToRelative(-1.53f, -2.87f)
                curveToRelative(1.41f, -0.62f, 2.4f, -2.03f, 2.4f, -3.66f)
                close()
                moveTo(13.54f, 12.02f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(12.04f, 0.02f)
                curveTo(5.42f, 0.02f, 0.04f, 5.4f, 0.04f, 12.02f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.66f, 0.02f, 12.04f, 0.02f)
                close()
                moveTo(12.04f, 22.02f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.52f, 2.02f, 12.04f, 2.02f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _CircleR = it}

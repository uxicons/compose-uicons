package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleN: ImageVector? = null

val Icons.Rr.CircleN: ImageVector
    get() = _CircleN ?: UXIcon(name = "CircleN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.04f, 0.02f)
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
                moveTo(17.04f, 7.27f)
                verticalLineToRelative(8.64f)
                curveToRelative(0f, 1.02f, -0.68f, 1.84f, -1.69f, 2.06f)
                curveToRelative(-0.15f, 0.03f, -0.31f, 0.05f, -0.46f, 0.05f)
                curveToRelative(-0.84f, 0f, -1.6f, -0.48f, -1.95f, -1.27f)
                lineToRelative(-3.65f, -8.66f)
                curveToRelative(-0.01f, -0.02f, -0.03f, -0.08f, -0.16f, -0.05f)
                curveToRelative(-0.1f, 0.02f, -0.1f, 0.06f, -0.1f, 0.1f)
                verticalLineToRelative(8.64f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8.64f)
                curveToRelative(0f, -1.02f, 0.68f, -1.84f, 1.69f, -2.06f)
                curveToRelative(1.01f, -0.21f, 2.0f, 0.29f, 2.41f, 1.22f)
                lineToRelative(3.65f, 8.66f)
                curveToRelative(0.01f, 0.02f, 0.04f, 0.09f, 0.16f, 0.05f)
                curveToRelative(0.1f, -0.02f, 0.1f, -0.06f, 0.1f, -0.1f)
                lineTo(15.04f, 7.27f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CircleN = it}

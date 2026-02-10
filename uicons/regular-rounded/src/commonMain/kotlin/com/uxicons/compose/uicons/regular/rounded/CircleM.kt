package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleM: ImageVector? = null

val Icons.Rr.CircleM: ImageVector
    get() = _CircleM ?: UXIcon(name = "CircleM") {
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
                moveTo(18.04f, 8.14f)
                verticalLineToRelative(8.89f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8.9f)
                reflectiveCurveToRelative(-0.0f, 0.01f, -0.01f, 0.01f)
                lineToRelative(-3.1f, 6.32f)
                curveToRelative(-0.17f, 0.34f, -0.52f, 0.56f, -0.9f, 0.56f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.38f, -0.0f, -0.73f, -0.23f, -0.9f, -0.57f)
                lineToRelative(-3.0f, -6.35f)
                reflectiveCurveToRelative(-0.03f, -0.08f, -0.07f, -0.06f)
                curveToRelative(-0.03f, 0.01f, -0.03f, 0.09f, -0.03f, 0.11f)
                verticalLineToRelative(8.89f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8.89f)
                curveToRelative(0f, -1.01f, 0.63f, -1.83f, 1.57f, -2.06f)
                curveToRelative(0.94f, -0.22f, 1.88f, 0.24f, 2.32f, 1.14f)
                lineToRelative(2.12f, 4.49f)
                lineToRelative(2.19f, -4.46f)
                curveToRelative(0.45f, -0.91f, 1.37f, -1.37f, 2.28f, -1.15f)
                curveToRelative(0.91f, 0.21f, 1.52f, 1.04f, 1.52f, 2.04f)
                close()
            }
        }.also { _CircleM = it}

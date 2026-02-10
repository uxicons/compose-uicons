package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleY: ImageVector? = null

val Icons.Rr.CircleY: ImageVector
    get() = _CircleY ?: UXIcon(name = "CircleY") {
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
                moveTo(16.82f, 7.89f)
                lineToRelative(-3.78f, 4.73f)
                verticalLineToRelative(4.4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.4f)
                lineToRelative(-3.78f, -4.73f)
                curveToRelative(-0.34f, -0.43f, -0.27f, -1.06f, 0.16f, -1.41f)
                curveToRelative(0.43f, -0.35f, 1.06f, -0.27f, 1.41f, 0.16f)
                lineToRelative(3.22f, 4.02f)
                lineToRelative(3.22f, -4.02f)
                curveToRelative(0.35f, -0.43f, 0.97f, -0.5f, 1.41f, -0.16f)
                curveToRelative(0.43f, 0.35f, 0.5f, 0.97f, 0.16f, 1.41f)
                close()
            }
        }.also { _CircleY = it}

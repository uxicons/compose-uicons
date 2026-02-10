package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleY: ImageVector? = null

val Icons.Sr.CircleY: ImageVector
    get() = _CircleY ?: UXIcon(name = "CircleY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(16.78f, 7.88f)
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

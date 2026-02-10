package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleX: ImageVector? = null

val Icons.Rr.CircleX: ImageVector
    get() = _CircleX ?: UXIcon(name = "CircleX") {
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
                moveTo(16.8f, 7.92f)
                lineToRelative(-3.46f, 4.11f)
                lineToRelative(3.46f, 4.11f)
                curveToRelative(0.36f, 0.42f, 0.3f, 1.05f, -0.12f, 1.41f)
                curveToRelative(-0.19f, 0.16f, -0.42f, 0.23f, -0.64f, 0.23f)
                curveToRelative(-0.28f, 0f, -0.57f, -0.12f, -0.77f, -0.35f)
                lineToRelative(-3.23f, -3.84f)
                lineToRelative(-3.23f, 3.84f)
                curveToRelative(-0.2f, 0.23f, -0.48f, 0.35f, -0.77f, 0.35f)
                curveToRelative(-0.23f, 0f, -0.46f, -0.08f, -0.64f, -0.23f)
                curveToRelative(-0.42f, -0.35f, -0.48f, -0.99f, -0.12f, -1.41f)
                lineToRelative(3.46f, -4.11f)
                lineToRelative(-3.46f, -4.11f)
                curveToRelative(-0.36f, -0.42f, -0.3f, -1.05f, 0.12f, -1.41f)
                curveToRelative(0.42f, -0.36f, 1.05f, -0.3f, 1.41f, 0.12f)
                lineToRelative(3.23f, 3.84f)
                lineToRelative(3.23f, -3.84f)
                curveToRelative(0.35f, -0.42f, 0.99f, -0.48f, 1.41f, -0.12f)
                curveToRelative(0.42f, 0.35f, 0.48f, 0.99f, 0.12f, 1.41f)
                close()
            }
        }.also { _CircleX = it}

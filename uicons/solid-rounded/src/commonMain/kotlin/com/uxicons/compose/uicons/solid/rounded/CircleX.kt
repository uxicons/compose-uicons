package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleX: ImageVector? = null

val Icons.Sr.CircleX: ImageVector
    get() = _CircleX ?: UXIcon(name = "CircleX") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(16.77f, 16.11f)
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
                lineToRelative(-3.46f, 4.11f)
                lineToRelative(3.46f, 4.11f)
                close()
            }
        }.also { _CircleX = it}

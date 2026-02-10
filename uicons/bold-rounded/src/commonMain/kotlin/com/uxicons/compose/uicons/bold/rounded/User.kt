package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _User: ImageVector? = null

val Icons.Br.User: ImageVector
    get() = _User ?: UXIcon(name = "User", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(244.32f, 299.05f)
            curveToRelative(-90.92f, 8.22f, -160.18f, 85.04f, -158.98f, 176.32f)
            verticalLineTo(480f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            verticalLineToRelative(-5.91f)
            curveToRelative(-0.96f, -56.04f, 40.4f, -103.84f, 96f, -110.93f)
            curveToRelative(58.69f, -5.82f, 110.99f, 37.04f, 116.81f, 95.74f)
            curveToRelative(0.34f, 3.47f, 0.52f, 6.95f, 0.52f, 10.44f)
            verticalLineTo(480f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            verticalLineToRelative(-10.67f)
            curveToRelative(-0.1f, -94.36f, -76.68f, -170.77f, -171.05f, -170.67f)
            curveTo(251.85f, 298.67f, 248.08f, 298.8f, 244.32f, 299.05f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(256.01f, 256f)
            curveToRelative(70.69f, 0f, 128f, -57.31f, 128f, -128f)
            reflectiveCurveTo(326.7f, 0f, 256.01f, 0f)
            reflectiveCurveToRelative(-128f, 57.31f, -128f, 128f)
            curveTo(128.08f, 198.66f, 185.35f, 255.93f, 256.01f, 256f)
            close()
            moveTo(256.01f, 64f)
            curveToRelative(35.35f, 0f, 64f, 28.65f, 64f, 64f)
            reflectiveCurveToRelative(-28.65f, 64f, -64f, 64f)
            reflectiveCurveToRelative(-64f, -28.65f, -64f, -64f)
            reflectiveCurveTo(220.66f, 64f, 256.01f, 64f)
            close()
        }
    }.also { _User = it }

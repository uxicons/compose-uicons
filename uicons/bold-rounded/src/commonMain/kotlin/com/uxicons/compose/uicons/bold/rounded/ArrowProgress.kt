package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowProgress: ImageVector? = null

val Icons.Br.ArrowProgress: ImageVector
    get() = _ArrowProgress ?: UXIcon(name = "ArrowProgress") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5f, 19.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(21.5f, 17f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(21.5f, 7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(20.14f, 14.14f)
            curveToRelative(0.26f, 0.54f, 0.8f, 0.86f, 1.36f, 0.86f)
            curveToRelative(0.22f, 0f, 0.43f, -0.05f, 0.64f, -0.15f)
            curveToRelative(0.75f, -0.35f, 1.07f, -1.25f, 0.71f, -2.0f)
            curveToRelative(-0.82f, -1.74f, -2.6f, -2.86f, -4.52f, -2.86f)
            lineTo(5f, 10f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(1.54f)
            curveToRelative(0f, 0.86f, 1.04f, 1.28f, 1.65f, 0.68f)
            lineToRelative(3.06f, -3.04f)
            curveToRelative(0.38f, -0.38f, 0.38f, -0.98f, 0f, -1.36f)
            lineToRelative(-3.06f, -3.04f)
            curveToRelative(-0.61f, -0.6f, -1.65f, -0.18f, -1.65f, 0.68f)
            verticalLineToRelative(1.54f)
            horizontalLineToRelative(-7f)
            curveTo(2.24f, 3f, 0f, 5.24f, 0f, 8f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(13.34f)
            curveToRelative(0.77f, 0f, 1.48f, 0.45f, 1.81f, 1.14f)
            close()
            moveTo(13.65f, 15.78f)
            curveToRelative(-0.61f, -0.6f, -1.65f, -0.18f, -1.65f, 0.68f)
            verticalLineToRelative(1.54f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(1.54f)
            curveToRelative(0f, 0.86f, 1.04f, 1.28f, 1.65f, 0.68f)
            lineToRelative(3.06f, -3.04f)
            curveToRelative(0.38f, -0.38f, 0.38f, -0.98f, 0f, -1.36f)
            lineToRelative(-3.06f, -3.04f)
            close()
        }
    }.also { _ArrowProgress = it }

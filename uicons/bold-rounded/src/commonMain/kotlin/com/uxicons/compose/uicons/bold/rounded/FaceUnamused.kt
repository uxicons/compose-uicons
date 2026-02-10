package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceUnamused: ImageVector? = null

val Icons.Br.FaceUnamused: ImageVector
    get() = _FaceUnamused ?: UXIcon(name = "FaceUnamused") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(19f, 10f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(7f, 10f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            close()
            moveTo(16.2f, 17.4f)
            curveToRelative(-0.29f, 0.4f, -0.75f, 0.6f, -1.2f, 0.6f)
            curveToRelative(-0.31f, 0f, -0.62f, -0.1f, -0.9f, -0.3f)
            curveToRelative(-0.0f, 0f, -0.99f, -0.7f, -2.1f, -0.7f)
            reflectiveCurveToRelative(-2.1f, 0.7f, -2.11f, 0.71f)
            curveToRelative(-0.67f, 0.48f, -1.6f, 0.34f, -2.09f, -0.33f)
            curveToRelative(-0.49f, -0.67f, -0.35f, -1.59f, 0.31f, -2.09f)
            curveToRelative(0.18f, -0.13f, 1.8f, -1.3f, 3.9f, -1.3f)
            reflectiveCurveToRelative(3.72f, 1.16f, 3.9f, 1.3f)
            curveToRelative(0.67f, 0.49f, 0.8f, 1.44f, 0.31f, 2.1f)
            close()
        }
    }.also { _FaceUnamused = it }

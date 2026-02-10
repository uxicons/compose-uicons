package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceConfused: ImageVector? = null

val Icons.Br.FaceConfused: ImageVector
    get() = _FaceConfused ?: UXIcon(name = "FaceConfused") {
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
            moveTo(17f, 15.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.82f, 0f, -1.75f, 0.32f, -2.69f, 0.92f)
            curveToRelative(-0.25f, 0.16f, -0.53f, 0.24f, -0.81f, 0.24f)
            curveToRelative(-0.49f, 0f, -0.98f, -0.24f, -1.26f, -0.69f)
            curveToRelative(-0.45f, -0.7f, -0.24f, -1.62f, 0.45f, -2.07f)
            curveToRelative(1.42f, -0.91f, 2.91f, -1.4f, 4.31f, -1.4f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(18f, 10f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
            moveTo(8f, 12f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _FaceConfused = it }

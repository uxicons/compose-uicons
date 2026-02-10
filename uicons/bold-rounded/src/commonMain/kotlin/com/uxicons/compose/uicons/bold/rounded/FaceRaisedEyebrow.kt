package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceRaisedEyebrow: ImageVector? = null

val Icons.Br.FaceRaisedEyebrow: ImageVector
    get() = _FaceRaisedEyebrow ?: UXIcon(name = "FaceRaisedEyebrow") {
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
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
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
            moveTo(6f, 6f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            close()
            moveTo(18.56f, 7.06f)
            curveToRelative(-0.31f, 0.46f, -0.94f, 0.57f, -1.39f, 0.26f)
            curveToRelative(-0.01f, -0.0f, -0.53f, -0.33f, -1.44f, -0.33f)
            curveToRelative(-1.11f, 0f, -2.09f, 0.77f, -2.1f, 0.78f)
            curveToRelative(-0.18f, 0.15f, -0.41f, 0.22f, -0.62f, 0.22f)
            curveToRelative(-0.29f, 0f, -0.58f, -0.13f, -0.78f, -0.37f)
            curveToRelative(-0.34f, -0.43f, -0.28f, -1.05f, 0.15f, -1.4f)
            curveToRelative(0.15f, -0.12f, 1.56f, -1.22f, 3.36f, -1.22f)
            curveToRelative(1.53f, 0f, 2.46f, 0.6f, 2.56f, 0.68f)
            curveToRelative(0.46f, 0.31f, 0.57f, 0.93f, 0.26f, 1.39f)
            close()
        }
    }.also { _FaceRaisedEyebrow = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDisappointed: ImageVector? = null

val Icons.Br.FaceDisappointed: ImageVector
    get() = _FaceDisappointed ?: UXIcon(name = "FaceDisappointed") {
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
            moveTo(9.97f, 12.92f)
            lineToRelative(-3f, 1f)
            curveToRelative(-0.16f, 0.05f, -0.32f, 0.08f, -0.47f, 0.08f)
            curveToRelative(-0.63f, 0f, -1.21f, -0.4f, -1.42f, -1.02f)
            curveToRelative(-0.26f, -0.79f, 0.16f, -1.64f, 0.95f, -1.9f)
            lineToRelative(3f, -1f)
            curveToRelative(0.79f, -0.26f, 1.64f, 0.16f, 1.9f, 0.95f)
            curveToRelative(0.26f, 0.79f, -0.16f, 1.64f, -0.95f, 1.9f)
            close()
            moveTo(18.92f, 12.97f)
            curveToRelative(-0.21f, 0.63f, -0.8f, 1.02f, -1.42f, 1.02f)
            curveToRelative(-0.16f, 0f, -0.32f, -0.02f, -0.47f, -0.08f)
            lineToRelative(-3f, -1f)
            curveToRelative(-0.79f, -0.26f, -1.21f, -1.11f, -0.95f, -1.9f)
            curveToRelative(0.26f, -0.79f, 1.11f, -1.21f, 1.9f, -0.95f)
            lineToRelative(3f, 1f)
            curveToRelative(0.79f, 0.26f, 1.21f, 1.11f, 0.95f, 1.9f)
            close()
            moveTo(15.84f, 17.67f)
            curveToRelative(-0.26f, 0.53f, -0.79f, 0.83f, -1.34f, 0.83f)
            curveToRelative(-0.23f, 0f, -0.45f, -0.05f, -0.67f, -0.16f)
            curveToRelative(0f, 0f, -0.74f, -0.34f, -1.83f, -0.34f)
            curveToRelative(-1.09f, 0f, -1.84f, 0.35f, -1.84f, 0.35f)
            curveToRelative(-0.75f, 0.35f, -1.64f, 0.04f, -2.0f, -0.7f)
            curveToRelative(-0.36f, -0.74f, -0.07f, -1.62f, 0.67f, -1.99f)
            curveToRelative(0.14f, -0.07f, 1.37f, -0.66f, 3.17f, -0.66f)
            reflectiveCurveToRelative(3.04f, 0.59f, 3.17f, 0.66f)
            curveToRelative(0.74f, 0.37f, 1.04f, 1.27f, 0.67f, 2.01f)
            close()
        }
    }.also { _FaceDisappointed = it }

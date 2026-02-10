package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceZany: ImageVector? = null

val Icons.Bs.FaceZany: ImageVector
    get() = _FaceZany ?: UXIcon(name = "FaceZany") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(17f, 8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 5.42f, 3.62f, 10.01f, 8.56f, 11.49f)
                curveToRelative(-1.51f, -0.81f, -2.56f, -2.51f, -2.56f, -4.49f)
                verticalLineToRelative(-0.32f)
                curveToRelative(-1.83f, -1.65f, -3f, -4.03f, -3f, -6.68f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 4.0f, -2.63f, 7.38f, -6.24f, 8.55f)
                curveToRelative(-0.54f, 1.84f, -2.01f, 3.19f, -3.79f, 3.4f)
                curveToRelative(0.34f, 0.03f, 0.69f, 0.05f, 1.03f, 0.05f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 19f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0.3f, -0.1f, 0.6f, -0.21f, 0.89f, -0.33f)
                curveToRelative(0.38f, -0.15f, 0.75f, -0.33f, 1.11f, -0.51f)
                curveToRelative(0f, 0f, -0.01f, 2.08f, -0.02f, 2.18f)
                curveToRelative(2.8f, -1.37f, 3.61f, -4.48f, 3.33f, -6.73f)
                curveToRelative(0f, -0.0f, -2.4f, 2.07f, -5.18f, 3.21f)
                curveToRelative(-2.77f, 1.14f, -5.93f, 1.35f, -5.93f, 1.35f)
                curveToRelative(0.23f, 0.3f, 0.5f, 0.59f, 0.8f, 0.88f)
                verticalLineToRelative(1.99f)
                curveToRelative(0f, 1.5f, 1f, 3f, 2.5f, 3f)
                reflectiveCurveToRelative(2.5f, -1.5f, 2.5f, -3f)
                close()
            }
        }.also { _FaceZany = it}

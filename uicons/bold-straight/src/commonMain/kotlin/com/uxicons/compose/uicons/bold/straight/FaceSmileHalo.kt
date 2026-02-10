package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileHalo: ImageVector? = null

val Icons.Bs.FaceSmileHalo: ImageVector
    get() = _FaceSmileHalo ?: UXIcon(name = "FaceSmileHalo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                curveToRelative(4.11f, 0f, 11f, -0.46f, 11f, -3.5f)
                reflectiveCurveTo(16.11f, 0f, 12f, 0f)
                reflectiveCurveTo(1f, 0.46f, 1f, 3.5f)
                reflectiveCurveToRelative(6.89f, 3.5f, 11f, 3.5f)
                close()
                moveTo(12f, 3f)
                curveToRelative(2.65f, 0f, 4.72f, 0.23f, 6.14f, 0.5f)
                curveToRelative(-1.42f, 0.27f, -3.49f, 0.5f, -6.14f, 0.5f)
                reflectiveCurveToRelative(-4.72f, -0.23f, -6.14f, -0.5f)
                curveToRelative(1.42f, -0.27f, 3.49f, -0.5f, 6.14f, -0.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -1.77f, 0.4f, -3.44f, 1.08f, -4.96f)
                curveToRelative(0.73f, 0.46f, 1.66f, 0.84f, 2.78f, 1.14f)
                curveToRelative(-0.55f, 1.16f, -0.86f, 2.45f, -0.86f, 3.82f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -1.37f, -0.32f, -2.66f, -0.86f, -3.82f)
                curveToRelative(1.12f, -0.3f, 2.05f, -0.68f, 2.78f, -1.14f)
                curveToRelative(0.69f, 1.51f, 1.08f, 3.19f, 1.08f, 4.96f)
                close()
                moveTo(11f, 13f)
                reflectiveCurveToRelative(-2f, -2f, -3f, -2f)
                reflectiveCurveToRelative(-3f, 2f, -3f, 2f)
                curveToRelative(0f, -1.63f, 0.73f, -5f, 3f, -5f)
                reflectiveCurveToRelative(3f, 3.37f, 3f, 5f)
                close()
                moveTo(19f, 13f)
                reflectiveCurveToRelative(-2f, -2f, -3f, -2f)
                reflectiveCurveToRelative(-3f, 2f, -3f, 2f)
                curveToRelative(0f, -1.63f, 0.73f, -5f, 3f, -5f)
                reflectiveCurveToRelative(3f, 3.37f, 3f, 5f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.02f, 0f, -5.4f, -2.09f, -5.5f, -2.18f)
                lineToRelative(2.0f, -2.24f)
                curveToRelative(0.01f, 0.01f, 1.64f, 1.42f, 3.5f, 1.42f)
                reflectiveCurveToRelative(3.49f, -1.41f, 3.51f, -1.42f)
                lineToRelative(1.99f, 2.24f)
                curveToRelative(-0.1f, 0.09f, -2.48f, 2.18f, -5.5f, 2.18f)
                close()
            }
        }.also { _FaceSmileHalo = it}

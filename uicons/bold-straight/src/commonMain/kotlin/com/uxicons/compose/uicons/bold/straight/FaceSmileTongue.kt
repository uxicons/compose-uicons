package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileTongue: ImageVector? = null

val Icons.Bs.FaceSmileTongue: ImageVector
    get() = _FaceSmileTongue ?: UXIcon(name = "FaceSmileTongue") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 10f)
                curveToRelative(-1f, 0f, -3f, 2f, -3f, 2f)
                curveToRelative(0f, -1.63f, 0.73f, -5f, 3f, -5f)
                reflectiveCurveToRelative(3f, 3.37f, 3f, 5f)
                curveToRelative(0f, 0f, -2f, -2f, -3f, -2f)
                close()
                moveTo(16f, 7f)
                curveToRelative(-2.27f, 0f, -3f, 3.37f, -3f, 5f)
                curveToRelative(0f, 0f, 2f, -2f, 3f, -2f)
                reflectiveCurveToRelative(3f, 2f, 3f, 2f)
                curveToRelative(0f, -1.63f, -0.73f, -5f, -3f, -5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                curveToRelative(0.29f, 0f, 0.57f, -0.02f, 0.85f, -0.04f)
                curveToRelative(0.88f, 0.67f, 1.92f, 1.03f, 2.95f, 1.03f)
                curveToRelative(0.78f, 0f, 1.55f, -0.21f, 2.23f, -0.64f)
                curveToRelative(1.1f, -0.7f, 1.81f, -1.89f, 1.94f, -3.26f)
                curveToRelative(0.05f, -0.57f, 0.01f, -1.14f, -0.13f, -1.7f)
                curveToRelative(0.73f, -1.3f, 1.15f, -2.79f, 1.15f, -4.38f)
                close()
                moveTo(16.0f, 13.5f)
                curveToRelative(-0.02f, 0.02f, -1.87f, 1.62f, -4.0f, 1.62f)
                reflectiveCurveToRelative(-3.99f, -1.61f, -4.0f, -1.62f)
                lineToRelative(-1.99f, 2.24f)
                curveToRelative(0.11f, 0.1f, 2.7f, 2.38f, 6f, 2.38f)
                curveToRelative(0.32f, 0f, 0.64f, -0.03f, 0.94f, -0.07f)
                lineToRelative(0.3f, 0.42f)
                curveToRelative(0.81f, 1.27f, 2.45f, 1.99f, 3.72f, 1.19f)
                curveToRelative(1.27f, -0.81f, 1.3f, -2.61f, 0.5f, -3.87f)
                lineToRelative(-1.45f, -2.29f)
                close()
            }
        }.also { _FaceSmileTongue = it}

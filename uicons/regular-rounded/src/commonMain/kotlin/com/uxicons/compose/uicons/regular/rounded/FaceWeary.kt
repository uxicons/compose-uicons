package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWeary: ImageVector? = null

val Icons.Rr.FaceWeary: ImageVector
    get() = _FaceWeary ?: UXIcon(name = "FaceWeary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(6.98f, 11.0f)
                curveToRelative(-0.43f, 0f, -0.84f, -0.05f, -1.22f, -0.15f)
                curveToRelative(-0.54f, -0.13f, -0.87f, -0.67f, -0.73f, -1.21f)
                curveToRelative(0.13f, -0.54f, 0.67f, -0.86f, 1.21f, -0.73f)
                curveToRelative(0.45f, 0.11f, 2.01f, 0.36f, 2.97f, -1.1f)
                curveToRelative(0.3f, -0.46f, 0.92f, -0.59f, 1.39f, -0.28f)
                curveToRelative(0.46f, 0.3f, 0.59f, 0.92f, 0.28f, 1.39f)
                curveToRelative(-1.02f, 1.54f, -2.53f, 2.09f, -3.89f, 2.09f)
                close()
                moveTo(18.97f, 9.64f)
                curveToRelative(0.13f, 0.54f, -0.2f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.38f, 0.09f, -0.79f, 0.15f, -1.22f, 0.15f)
                curveToRelative(-1.37f, 0f, -2.88f, -0.55f, -3.89f, -2.09f)
                curveToRelative(-0.3f, -0.46f, -0.18f, -1.08f, 0.28f, -1.39f)
                curveToRelative(0.46f, -0.3f, 1.08f, -0.18f, 1.39f, 0.28f)
                curveToRelative(0.96f, 1.46f, 2.52f, 1.21f, 2.97f, 1.1f)
                curveToRelative(0.54f, -0.13f, 1.08f, 0.2f, 1.21f, 0.73f)
                close()
                moveTo(17.84f, 16.46f)
                curveToRelative(0.47f, 0.75f, -0.19f, 1.71f, -1.05f, 1.52f)
                curveToRelative(-1.12f, -0.24f, -2.35f, -0.97f, -4.79f, -0.98f)
                curveToRelative(-2.44f, 0f, -3.68f, 0.73f, -4.79f, 0.98f)
                curveToRelative(-0.86f, 0.19f, -1.53f, -0.77f, -1.05f, -1.52f)
                curveToRelative(1.02f, -1.6f, 2.85f, -3.46f, 5.85f, -3.46f)
                reflectiveCurveToRelative(4.82f, 1.85f, 5.84f, 3.46f)
                close()
            }
        }.also { _FaceWeary = it}

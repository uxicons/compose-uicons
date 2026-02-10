package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileTear: ImageVector? = null

val Icons.Rr.FaceSmileTear: ImageVector
    get() = _FaceSmileTear ?: UXIcon(name = "FaceSmileTear") {
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
                moveTo(11.99f, 17.08f)
                curveToRelative(-0.08f, 0.49f, -0.51f, 0.83f, -0.98f, 0.83f)
                curveToRelative(-0.06f, 0f, -0.11f, -0.0f, -0.17f, -0.01f)
                curveToRelative(-2.54f, -0.42f, -4.42f, -2.08f, -4.5f, -2.16f)
                curveToRelative(-0.41f, -0.37f, -0.45f, -1f, -0.08f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1.0f, -0.45f, 1.41f, -0.08f)
                curveToRelative(0.02f, 0.01f, 1.55f, 1.35f, 3.5f, 1.68f)
                curveToRelative(0.55f, 0.09f, 0.91f, 0.61f, 0.82f, 1.15f)
                close()
                moveTo(14f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(7f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(16.46f, 12.61f)
                curveToRelative(0.59f, 0.69f, 1.54f, 2.27f, 1.54f, 3.39f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.1f, 0.95f, -2.69f, 1.54f, -3.38f)
                curveToRelative(0.24f, -0.28f, 0.68f, -0.29f, 0.92f, -0.0f)
                close()
            }
        }.also { _FaceSmileTear = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileTear: ImageVector? = null

val Icons.Sr.FaceSmileTear: ImageVector
    get() = _FaceSmileTear ?: UXIcon(name = "FaceSmileTear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(8.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.0f, 17.92f)
                curveToRelative(-0.06f, 0f, -0.11f, -0.0f, -0.17f, -0.01f)
                curveToRelative(-2.54f, -0.42f, -4.42f, -2.08f, -4.5f, -2.16f)
                curveToRelative(-0.41f, -0.37f, -0.45f, -1f, -0.08f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1.0f, -0.45f, 1.41f, -0.08f)
                curveToRelative(0.02f, 0.01f, 1.55f, 1.35f, 3.5f, 1.68f)
                curveToRelative(0.55f, 0.09f, 0.91f, 0.61f, 0.82f, 1.15f)
                curveToRelative(-0.08f, 0.49f, -0.51f, 0.83f, -0.98f, 0.83f)
                close()
                moveTo(15.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16f, 18f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.1f, 0.95f, -2.69f, 1.54f, -3.38f)
                curveToRelative(0.24f, -0.28f, 0.68f, -0.29f, 0.92f, -0.0f)
                curveToRelative(0.59f, 0.69f, 1.54f, 2.27f, 1.54f, 3.39f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _FaceSmileTear = it}

package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileTear: ImageVector? = null

val Icons.Tr.FaceSmileTear: ImageVector
    get() = _FaceSmileTear ?: UXIcon(name = "FaceSmileTear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(12.5f, 17.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-3.17f, 0f, -5.27f, -2.06f, -5.35f, -2.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                curveToRelative(0.02f, 0.02f, 1.9f, 1.85f, 4.65f, 1.85f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(7f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(16.0f, 12.5f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.15f, 0f, -0.29f, 0.07f, -0.38f, 0.18f)
                curveToRelative(-0.17f, 0.2f, -1.62f, 1.96f, -1.62f, 3.32f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.33f, -1.45f, -3.12f, -1.61f, -3.32f)
                curveToRelative(-0.1f, -0.11f, -0.23f, -0.18f, -0.38f, -0.18f)
                close()
                moveTo(16f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.64f, 0.56f, -1.56f, 1.0f, -2.18f)
                curveToRelative(0.48f, 0.68f, 1.0f, 1.6f, 1.0f, 2.18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _FaceSmileTear = it}

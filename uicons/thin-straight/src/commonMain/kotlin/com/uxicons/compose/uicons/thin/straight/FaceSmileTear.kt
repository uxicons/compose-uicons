package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileTear: ImageVector? = null

val Icons.Ts.FaceSmileTear: ImageVector
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
                moveTo(16.0f, 12.6f)
                lineToRelative(-0.35f, 0.35f)
                curveToRelative(-0.17f, 0.17f, -1.65f, 1.67f, -1.65f, 3.06f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.36f, -1.48f, -2.88f, -1.65f, -3.05f)
                lineToRelative(-0.35f, -0.35f)
                close()
                moveTo(16f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.63f, 0.56f, -1.44f, 1.0f, -1.96f)
                curveToRelative(0.44f, 0.52f, 1.0f, 1.34f, 1.0f, 1.96f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(12.13f, 16.99f)
                curveToRelative(0.08f, 0.34f, 0.2f, 0.66f, 0.33f, 0.97f)
                curveToRelative(-0.16f, 0.01f, -0.31f, 0.04f, -0.47f, 0.04f)
                curveToRelative(-2.92f, 0f, -5.24f, -2.04f, -5.33f, -2.13f)
                lineToRelative(0.67f, -0.75f)
                curveToRelative(0.02f, 0.02f, 2.14f, 1.87f, 4.67f, 1.87f)
                curveToRelative(0.04f, 0f, 0.09f, -0.01f, 0.13f, -0.01f)
                close()
            }
        }.also { _FaceSmileTear = it}

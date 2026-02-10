package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceRaisedEyebrow: ImageVector? = null

val Icons.Tr.FaceRaisedEyebrow: ImageVector
    get() = _FaceRaisedEyebrow ?: UXIcon(name = "FaceRaisedEyebrow") {
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
                moveTo(17f, 15.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(7.5f, 16f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(8f, 9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(9.5f, 7f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(17.79f, 6.11f)
                curveToRelative(0.16f, 0.23f, 0.1f, 0.54f, -0.13f, 0.69f)
                curveToRelative(-0.23f, 0.16f, -0.54f, 0.1f, -0.69f, -0.13f)
                curveToRelative(-0.02f, -0.02f, -0.49f, -0.67f, -1.47f, -0.67f)
                curveToRelative(-1.33f, 0f, -2.03f, 1.67f, -2.04f, 1.69f)
                curveToRelative(-0.08f, 0.19f, -0.27f, 0.31f, -0.46f, 0.31f)
                curveToRelative(-0.06f, 0f, -0.13f, -0.01f, -0.19f, -0.04f)
                curveToRelative(-0.26f, -0.1f, -0.38f, -0.4f, -0.28f, -0.65f)
                curveToRelative(0.04f, -0.09f, 0.96f, -2.31f, 2.96f, -2.31f)
                curveToRelative(1.51f, 0f, 2.26f, 1.06f, 2.29f, 1.1f)
                close()
            }
        }.also { _FaceRaisedEyebrow = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceRaisedEyebrow: ImageVector? = null

val Icons.Ts.FaceRaisedEyebrow: ImageVector
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
                moveTo(7f, 15f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(7f, 16f)
                verticalLineToRelative(-1f)
                close()
                moveTo(10f, 7f)
                lineTo(6f, 7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveTo(17.79f, 6.11f)
                lineToRelative(-0.82f, 0.57f)
                curveToRelative(-0.02f, -0.02f, -0.49f, -0.67f, -1.47f, -0.67f)
                curveToRelative(-1.34f, 0f, -2.11f, 1.65f, -2.12f, 1.67f)
                lineToRelative(-0.91f, -0.41f)
                curveToRelative(0.04f, -0.09f, 1.04f, -2.26f, 3.03f, -2.26f)
                curveToRelative(1.51f, 0f, 2.26f, 1.06f, 2.29f, 1.1f)
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
            }
        }.also { _FaceRaisedEyebrow = it}

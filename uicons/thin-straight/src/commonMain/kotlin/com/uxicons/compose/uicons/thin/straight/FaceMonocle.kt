package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMonocle: ImageVector? = null

val Icons.Ts.FaceMonocle: ImageVector
    get() = _FaceMonocle ?: UXIcon(name = "FaceMonocle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 15f)
                verticalLineToRelative(-1f)
                curveToRelative(1.14f, 0f, 4.6f, 0f, 6.92f, 3.47f)
                lineToRelative(-0.83f, 0.56f)
                curveToRelative(-2.02f, -3.03f, -5.08f, -3.03f, -6.08f, -3.03f)
                close()
                moveTo(16f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(20f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-1f)
                lineTo(19f, 12.64f)
                curveToRelative(-0.73f, 0.83f, -1.81f, 1.36f, -3f, 1.36f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(19f, 10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveTo(22f, 18.62f)
                curveToRelative(1.26f, -1.9f, 2f, -4.17f, 2f, -6.62f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(1.79f, 0f, 3.48f, -0.4f, 5f, -1.1f)
                verticalLineToRelative(-1.11f)
                curveToRelative(-1.5f, 0.77f, -3.2f, 1.21f, -5f, 1.21f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 1.63f, -0.36f, 3.17f, -1f, 4.56f)
                verticalLineToRelative(2.06f)
                close()
            }
        }.also { _FaceMonocle = it}

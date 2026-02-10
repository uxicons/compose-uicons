package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceUnamused: ImageVector? = null

val Icons.Ts.FaceUnamused: ImageVector
    get() = _FaceUnamused ?: UXIcon(name = "FaceUnamused") {
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
                moveTo(18f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(9f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(12f, 16f)
                curveToRelative(1.97f, 0f, 3.53f, 1.15f, 3.6f, 1.2f)
                lineToRelative(-0.6f, 0.8f)
                curveToRelative(-0.01f, -0.01f, -1.38f, -1.0f, -3.0f, -1.0f)
                curveToRelative(-1.64f, 0f, -2.99f, 0.99f, -3.0f, 1.0f)
                lineToRelative(-0.6f, -0.8f)
                curveToRelative(0.07f, -0.05f, 1.63f, -1.2f, 3.6f, -1.2f)
                close()
            }
        }.also { _FaceUnamused = it}

package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceUnamused: ImageVector? = null

val Icons.Tc.FaceUnamused: ImageVector
    get() = _FaceUnamused ?: UXIcon(name = "FaceUnamused") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.2f, 0f, -10f, -2.8f, -10f, -10f)
                reflectiveCurveToRelative(2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                reflectiveCurveToRelative(-2.8f, 10f, -10f, 10f)
                close()
                moveTo(16.81f, 16.26f)
                curveToRelative(0.22f, 0.17f, 0.26f, 0.48f, 0.09f, 0.7f)
                curveToRelative(-0.17f, 0.22f, -0.49f, 0.26f, -0.7f, 0.09f)
                curveToRelative(-0.9f, -0.7f, -2.27f, -1.04f, -4.19f, -1.04f)
                reflectiveCurveToRelative(-3.29f, 0.34f, -4.19f, 1.04f)
                curveToRelative(-0.22f, 0.17f, -0.53f, 0.13f, -0.7f, -0.09f)
                curveToRelative(-0.17f, -0.22f, -0.13f, -0.53f, 0.09f, -0.7f)
                curveToRelative(1.08f, -0.84f, 2.66f, -1.26f, 4.81f, -1.26f)
                reflectiveCurveToRelative(3.72f, 0.41f, 4.81f, 1.26f)
                close()
                moveTo(7.5f, 10f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 1.5f, 0.9f, 1.5f, 1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(-0.01f, -0.23f, -0.1f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(-0.01f, -0.23f, -0.1f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 1.5f, 0.9f, 1.5f, 1.5f)
                close()
            }
        }.also { _FaceUnamused = it}

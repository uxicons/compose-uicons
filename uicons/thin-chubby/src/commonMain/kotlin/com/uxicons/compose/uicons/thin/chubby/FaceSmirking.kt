package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmirking: ImageVector? = null

val Icons.Tc.FaceSmirking: ImageVector
    get() = _FaceSmirking ?: UXIcon(name = "FaceSmirking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 10.5f)
                curveToRelative(-0.01f, -0.23f, -0.1f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 1.5f, 0.9f, 1.5f, 1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(13.5f, 10f)
                horizontalLineToRelative(2f)
                curveToRelative(0.4f, 0f, 0.49f, 0.28f, 0.5f, 0.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.6f, -0.4f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(17.19f, 15.96f)
                curveToRelative(-0.9f, 0.7f, -2.27f, 1.04f, -4.19f, 1.04f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.15f, 0f, 3.72f, -0.41f, 4.81f, -1.26f)
                curveToRelative(0.22f, -0.17f, 0.26f, -0.48f, 0.09f, -0.7f)
                curveToRelative(-0.17f, -0.22f, -0.48f, -0.26f, -0.7f, -0.09f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.81f, -3.19f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.19f, -11f, -11f)
                reflectiveCurveToRelative(3.19f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.19f, 11f, 11f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -7.2f, -2.8f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 2.8f, -10f, 10f)
                reflectiveCurveToRelative(2.8f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -2.8f, 10f, -10f)
                close()
            }
        }.also { _FaceSmirking = it}

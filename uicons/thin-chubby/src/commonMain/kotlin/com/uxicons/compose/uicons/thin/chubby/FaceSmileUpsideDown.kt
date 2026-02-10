package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileUpsideDown: ImageVector? = null

val Icons.Tc.FaceSmileUpsideDown: ImageVector
    get() = _FaceSmileUpsideDown ?: UXIcon(name = "FaceSmileUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.75f, 15f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(9f, 14.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
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
                moveTo(12f, 7f)
                curveToRelative(-2.15f, 0f, -3.72f, 0.41f, -4.81f, 1.26f)
                curveToRelative(-0.22f, 0.17f, -0.26f, 0.48f, -0.09f, 0.7f)
                curveToRelative(0.17f, 0.22f, 0.48f, 0.26f, 0.7f, 0.09f)
                curveToRelative(0.9f, -0.7f, 2.27f, -1.04f, 4.19f, -1.04f)
                reflectiveCurveToRelative(3.29f, 0.34f, 4.19f, 1.04f)
                curveToRelative(0.22f, 0.17f, 0.53f, 0.13f, 0.7f, -0.09f)
                curveToRelative(0.17f, -0.22f, 0.13f, -0.53f, -0.09f, -0.7f)
                curveToRelative(-1.08f, -0.84f, -2.66f, -1.26f, -4.81f, -1.26f)
                close()
            }
        }.also { _FaceSmileUpsideDown = it}

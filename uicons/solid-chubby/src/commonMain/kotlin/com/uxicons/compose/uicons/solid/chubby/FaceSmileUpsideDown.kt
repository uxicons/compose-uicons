package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileUpsideDown: ImageVector? = null

val Icons.Sc.FaceSmileUpsideDown: ImageVector
    get() = _FaceSmileUpsideDown ?: UXIcon(name = "FaceSmileUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(8.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.7f, 9.62f)
                curveToRelative(-0.34f, 0.44f, -0.97f, 0.51f, -1.4f, 0.17f)
                curveToRelative(-0.68f, -0.53f, -1.76f, -0.79f, -3.29f, -0.79f)
                reflectiveCurveToRelative(-2.61f, 0.26f, -3.29f, 0.79f)
                curveToRelative(-0.43f, 0.34f, -1.06f, 0.26f, -1.4f, -0.17f)
                curveToRelative(-0.34f, -0.44f, -0.26f, -1.06f, 0.17f, -1.4f)
                curveToRelative(1.06f, -0.83f, 2.5f, -1.21f, 4.53f, -1.21f)
                reflectiveCurveToRelative(3.46f, 0.39f, 4.53f, 1.21f)
                curveToRelative(0.44f, 0.34f, 0.51f, 0.97f, 0.17f, 1.4f)
                close()
            }
        }.also { _FaceSmileUpsideDown = it}

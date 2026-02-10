package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileUpsideDown: ImageVector? = null

val Icons.Ss.FaceSmileUpsideDown: ImageVector
    get() = _FaceSmileUpsideDown ?: UXIcon(name = "FaceSmileUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(8.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.33f, 9.75f)
                curveToRelative(-0.02f, -0.02f, -2.0f, -1.75f, -4.33f, -1.75f)
                reflectiveCurveToRelative(-4.32f, 1.73f, -4.34f, 1.75f)
                lineToRelative(-1.33f, -1.49f)
                curveToRelative(0.1f, -0.09f, 2.56f, -2.25f, 5.67f, -2.25f)
                reflectiveCurveToRelative(5.56f, 2.16f, 5.67f, 2.25f)
                lineToRelative(-1.33f, 1.49f)
                close()
            }
        }.also { _FaceSmileUpsideDown = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileUpsideDown: ImageVector? = null

val Icons.Rr.FaceSmileUpsideDown: ImageVector
    get() = _FaceSmileUpsideDown ?: UXIcon(name = "FaceSmileUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(17.67f, 8.25f)
                curveToRelative(0.41f, 0.37f, 0.45f, 1f, 0.08f, 1.41f)
                curveToRelative(-0.2f, 0.22f, -0.47f, 0.33f, -0.75f, 0.33f)
                curveToRelative(-0.24f, 0f, -0.47f, -0.08f, -0.67f, -0.25f)
                curveToRelative(-0.02f, -0.02f, -2.0f, -1.75f, -4.33f, -1.75f)
                reflectiveCurveToRelative(-4.32f, 1.73f, -4.34f, 1.75f)
                curveToRelative(-0.41f, 0.37f, -1.04f, 0.33f, -1.41f, -0.08f)
                curveToRelative(-0.37f, -0.41f, -0.33f, -1.04f, 0.08f, -1.41f)
                curveToRelative(0.1f, -0.09f, 2.56f, -2.25f, 5.67f, -2.25f)
                reflectiveCurveToRelative(5.56f, 2.16f, 5.67f, 2.25f)
                close()
                moveTo(17f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _FaceSmileUpsideDown = it}

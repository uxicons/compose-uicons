package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceHushed: ImageVector? = null

val Icons.Rr.FaceHushed: ImageVector
    get() = _FaceHushed ?: UXIcon(name = "FaceHushed") {
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
                moveTo(10f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(17f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(14f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(6.78f, 8.62f)
                curveToRelative(-0.2f, 0.25f, -0.49f, 0.38f, -0.78f, 0.38f)
                curveToRelative(-0.22f, 0f, -0.44f, -0.07f, -0.62f, -0.22f)
                curveToRelative(-0.43f, -0.34f, -0.5f, -0.97f, -0.16f, -1.41f)
                curveToRelative(0.91f, -1.14f, 2.31f, -2.06f, 3.56f, -2.35f)
                curveToRelative(0.53f, -0.13f, 1.07f, 0.21f, 1.2f, 0.75f)
                curveToRelative(0.12f, 0.54f, -0.21f, 1.07f, -0.75f, 1.2f)
                curveToRelative(-0.81f, 0.19f, -1.81f, 0.86f, -2.44f, 1.65f)
                close()
                moveTo(18.78f, 7.38f)
                curveToRelative(0.34f, 0.43f, 0.27f, 1.06f, -0.16f, 1.41f)
                curveToRelative(-0.18f, 0.15f, -0.4f, 0.22f, -0.62f, 0.22f)
                curveToRelative(-0.29f, 0f, -0.59f, -0.13f, -0.78f, -0.38f)
                curveToRelative(-0.62f, -0.78f, -1.63f, -1.46f, -2.44f, -1.65f)
                curveToRelative(-0.54f, -0.12f, -0.88f, -0.66f, -0.75f, -1.2f)
                curveToRelative(0.12f, -0.54f, 0.67f, -0.88f, 1.2f, -0.75f)
                curveToRelative(1.25f, 0.29f, 2.65f, 1.21f, 3.56f, 2.35f)
                close()
            }
        }.also { _FaceHushed = it}

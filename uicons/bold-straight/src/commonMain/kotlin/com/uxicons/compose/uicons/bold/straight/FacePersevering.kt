package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FacePersevering: ImageVector? = null

val Icons.Bs.FacePersevering: ImageVector
    get() = _FacePersevering ?: UXIcon(name = "FacePersevering") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(13f, 13f)
                curveToRelative(0f, 2.27f, 3.37f, 3f, 5f, 3f)
                curveToRelative(0f, 0f, -2f, -2f, -2f, -3f)
                reflectiveCurveToRelative(2f, -3f, 2f, -3f)
                curveToRelative(-1.63f, 0f, -5f, 0.73f, -5f, 3f)
                close()
                moveTo(11f, 13f)
                curveToRelative(0f, -2.27f, -3.37f, -3f, -5f, -3f)
                curveToRelative(0f, 0f, 2f, 2f, 2f, 3f)
                reflectiveCurveToRelative(-2f, 3f, -2f, 3f)
                curveToRelative(1.63f, 0f, 5f, -0.73f, 5f, -3f)
                close()
                moveTo(12f, 19f)
                curveToRelative(1.12f, 0f, 2.1f, 0.7f, 2.1f, 0.7f)
                lineToRelative(1.79f, -2.41f)
                curveToRelative(-0.18f, -0.13f, -1.8f, -1.3f, -3.9f, -1.3f)
                reflectiveCurveToRelative(-3.72f, 1.16f, -3.9f, 1.3f)
                lineToRelative(1.78f, 2.41f)
                curveToRelative(0.01f, -0.01f, 0.99f, -0.71f, 2.11f, -0.71f)
                close()
                moveTo(9.33f, 6.55f)
                lineToRelative(-1.66f, -1.11f)
                curveToRelative(-0.77f, 1.16f, -1.85f, 2.06f, -3.04f, 2.53f)
                lineToRelative(0.74f, 1.86f)
                curveToRelative(1.58f, -0.63f, 2.95f, -1.77f, 3.96f, -3.28f)
                close()
                moveTo(19.37f, 7.98f)
                curveToRelative(-1.19f, -0.47f, -2.27f, -1.37f, -3.04f, -2.53f)
                lineToRelative(-1.66f, 1.11f)
                curveToRelative(1.01f, 1.51f, 2.38f, 2.65f, 3.96f, 3.28f)
                lineToRelative(0.74f, -1.86f)
                close()
            }
        }.also { _FacePersevering = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSleepy: ImageVector? = null

val Icons.Bs.FaceSleepy: ImageVector
    get() = _FaceSleepy ?: UXIcon(name = "FaceSleepy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 1.38f, -0.25f, 2.7f, -0.68f, 3.94f)
                curveToRelative(-0.73f, -0.77f, -1.65f, -1.36f, -2.58f, -1.83f)
                curveToRelative(0.16f, -0.68f, 0.26f, -1.38f, 0.26f, -2.11f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                curveToRelative(1.83f, 0f, 3.54f, -0.55f, 4.96f, -1.5f)
                curveToRelative(0.02f, 0.17f, 0.04f, 0.34f, 0.04f, 0.5f)
                curveToRelative(0f, 0.93f, 0.33f, 1.78f, 0.87f, 2.46f)
                curveToRelative(-1.74f, 0.98f, -3.74f, 1.54f, -5.87f, 1.54f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(12f, 18f)
                curveToRelative(1.12f, 0f, 2.1f, 0.7f, 2.1f, 0.7f)
                lineToRelative(1.79f, -2.41f)
                curveToRelative(-0.18f, -0.13f, -1.8f, -1.3f, -3.9f, -1.3f)
                reflectiveCurveToRelative(-3.72f, 1.16f, -3.9f, 1.3f)
                lineToRelative(1.78f, 2.41f)
                curveToRelative(0.01f, -0.01f, 0.99f, -0.71f, 2.11f, -0.71f)
                close()
                moveTo(17f, 15f)
                reflectiveCurveToRelative(2f, 1.5f, 2f, 5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -4f, -6f, -5f, -6f, -5f)
                close()
                moveTo(8f, 10f)
                curveToRelative(-1f, 0f, -3f, -1f, -3f, -1f)
                curveToRelative(0f, 1.63f, 1f, 4f, 3f, 4f)
                reflectiveCurveToRelative(3f, -2.37f, 3f, -4f)
                curveToRelative(0f, 0f, -2f, 1f, -3f, 1f)
                close()
                moveTo(19f, 9f)
                reflectiveCurveToRelative(-2f, 1f, -3f, 1f)
                reflectiveCurveToRelative(-3f, -1f, -3f, -1f)
                curveToRelative(0f, 1.63f, 1f, 4f, 3f, 4f)
                reflectiveCurveToRelative(3f, -2.37f, 3f, -4f)
                close()
            }
        }.also { _FaceSleepy = it}

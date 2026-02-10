package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceLying: ImageVector? = null

val Icons.Sr.FaceLying: ImageVector
    get() = _FaceLying ?: UXIcon(name = "FaceLying") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(1.54f, 0f, 2.8f, 1.17f, 2.97f, 2.67f)
                curveToRelative(0.01f, -0.22f, 0.03f, -0.44f, 0.03f, -0.67f)
                curveTo(24f, 5.37f, 18.63f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                curveToRelative(5.95f, 0f, 10.88f, -4.34f, 11.82f, -10.03f)
                curveToRelative(-0.41f, 1.18f, -1.51f, 2.03f, -2.82f, 2.03f)
                close()
                moveTo(15.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.18f, 15.98f)
                curveToRelative(-1.92f, 0.34f, -3.49f, 1.74f, -3.51f, 1.76f)
                curveToRelative(-0.19f, 0.17f, -0.43f, 0.26f, -0.67f, 0.26f)
                curveToRelative(-0.27f, 0f, -0.54f, -0.11f, -0.74f, -0.33f)
                curveToRelative(-0.37f, -0.41f, -0.34f, -1.04f, 0.07f, -1.41f)
                curveToRelative(0.08f, -0.07f, 2.0f, -1.8f, 4.5f, -2.24f)
                curveToRelative(0.54f, -0.1f, 1.06f, 0.27f, 1.16f, 0.81f)
                curveToRelative(0.1f, 0.54f, -0.26f, 1.06f, -0.81f, 1.16f)
                close()
            }
        }.also { _FaceLying = it}

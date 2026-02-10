package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadTear: ImageVector? = null

val Icons.Ts.SadTear: ImageVector
    get() = _SadTear ?: UXIcon(name = "SadTear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(8f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(16f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8f, 18f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.36f, 1.48f, -2.88f, 1.65f, -3.05f)
                lineToRelative(0.35f, -0.35f)
                lineToRelative(0.35f, 0.35f)
                curveToRelative(0.17f, 0.17f, 1.65f, 1.67f, 1.65f, 3.06f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(8.0f, 14.04f)
                curveToRelative(-0.44f, 0.52f, -1.0f, 1.34f, -1.0f, 1.96f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.62f, -0.57f, -1.44f, -1.0f, -1.96f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-0.16f, 0f, -0.31f, 0.03f, -0.47f, 0.04f)
                curveToRelative(0.14f, 0.31f, 0.25f, 0.63f, 0.33f, 0.97f)
                curveToRelative(0.04f, -0.0f, 0.09f, -0.01f, 0.13f, -0.01f)
                curveToRelative(2.53f, 0f, 4.65f, 1.85f, 4.67f, 1.87f)
                lineToRelative(0.67f, -0.75f)
                curveToRelative(-0.1f, -0.09f, -2.41f, -2.13f, -5.33f, -2.13f)
                close()
            }
        }.also { _SadTear = it}

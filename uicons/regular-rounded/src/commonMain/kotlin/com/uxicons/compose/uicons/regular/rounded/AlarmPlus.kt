package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmPlus: ImageVector? = null

val Icons.Rr.AlarmPlus: ImageVector
    get() = _AlarmPlus ?: UXIcon(name = "AlarmPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(23f, 13f)
                curveToRelative(0f, 2.74f, -1.01f, 5.25f, -2.67f, 7.17f)
                curveToRelative(0.85f, 0.45f, 1.67f, 1.32f, 1.67f, 2.83f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1f, -0.86f, -1.19f, -1.12f, -1.23f)
                curveToRelative(-0.07f, -0.01f, -0.13f, -0.02f, -0.19f, -0.04f)
                curveToRelative(-1.85f, 1.43f, -4.17f, 2.27f, -6.69f, 2.27f)
                reflectiveCurveToRelative(-4.83f, -0.85f, -6.69f, -2.27f)
                curveToRelative(-0.07f, 0.02f, -0.13f, 0.04f, -0.2f, 0.04f)
                curveToRelative(-0.25f, 0.04f, -1.11f, 0.23f, -1.11f, 1.23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.51f, 0.82f, -2.38f, 1.67f, -2.83f)
                curveToRelative(-1.66f, -1.93f, -2.67f, -4.43f, -2.67f, -7.17f)
                curveTo(1f, 7.27f, 5.4f, 2.55f, 11f, 2.05f)
                lineTo(11f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.05f)
                curveToRelative(5.6f, 0.51f, 10f, 5.23f, 10f, 10.95f)
                close()
                moveTo(12f, 22f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 4f, 12f, 4f)
                reflectiveCurveTo(3f, 8.04f, 3f, 13f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                close()
                moveTo(19.21f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(1.81f, 0f, 2.79f, 1.29f, 2.79f, 2.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.52f, -2.1f, -4.5f, -4.79f, -4.5f)
                close()
                moveTo(2f, 4.5f)
                curveToRelative(0f, -1.21f, 0.98f, -2.5f, 2.79f, -2.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveTo(2.1f, 0f, 0f, 1.98f, 0f, 4.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _AlarmPlus = it}

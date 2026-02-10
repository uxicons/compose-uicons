package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Sc.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.11f, 7.45f)
                curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.0f)
                curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.0f, 2.12f)
                curveToRelative(0.65f, 0.65f, 1.01f, 1.51f, 1.01f, 2.42f)
                reflectiveCurveToRelative(-0.36f, 1.77f, -1.01f, 2.42f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(1.22f, -1.21f, 1.89f, -2.83f, 1.89f, -4.55f)
                reflectiveCurveToRelative(-0.67f, -3.33f, -1.89f, -4.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.01f, 7.46f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, -0.0f)
                curveToRelative(-1.22f, 1.21f, -1.89f, 2.83f, -1.89f, 4.55f)
                reflectiveCurveToRelative(0.67f, 3.33f, 1.89f, 4.55f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.0f, -2.12f)
                curveToRelative(-0.65f, -0.65f, -1.01f, -1.51f, -1.01f, -2.42f)
                reflectiveCurveToRelative(0.36f, -1.77f, 1.01f, -2.42f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0.0f, -2.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.94f)
                curveToRelative(-2.61f, 0f, -6.07f, 0.63f, -6.07f, 6.06f)
                reflectiveCurveToRelative(3.47f, 6.06f, 6.07f, 6.06f)
                reflectiveCurveToRelative(6.07f, -0.63f, 6.07f, -6.06f)
                reflectiveCurveToRelative(-3.47f, -6.06f, -6.07f, -6.06f)
                close()
                moveTo(11f, 8.86f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.25f)
                close()
                moveTo(12f, 16.14f)
                curveToRelative(-0.82f, 0f, -1.48f, -0.66f, -1.48f, -1.48f)
                reflectiveCurveToRelative(0.66f, -1.48f, 1.48f, -1.48f)
                reflectiveCurveToRelative(1.48f, 0.66f, 1.48f, 1.48f)
                reflectiveCurveToRelative(-0.66f, 1.48f, -1.48f, 1.48f)
                close()
            }
        }.also { _EngineWarning = it}

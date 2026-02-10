package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Rc.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.1f)
                curveToRelative(-2.97f, 0f, -6.91f, 0.71f, -6.91f, 6.9f)
                reflectiveCurveToRelative(3.95f, 6.9f, 6.91f, 6.9f)
                reflectiveCurveToRelative(6.91f, -0.71f, 6.91f, -6.9f)
                reflectiveCurveToRelative(-3.95f, -6.9f, -6.91f, -6.9f)
                close()
                moveTo(12f, 16.9f)
                curveToRelative(-3.11f, 0f, -4.91f, -0.8f, -4.91f, -4.9f)
                reflectiveCurveToRelative(1.88f, -4.9f, 4.91f, -4.9f)
                curveToRelative(3.11f, 0f, 4.91f, 0.8f, 4.91f, 4.9f)
                reflectiveCurveToRelative(-1.88f, 4.9f, -4.91f, 4.9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.32f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.37f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.37f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.18f, 7.62f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.79f, 0.79f, 1.23f, 1.84f, 1.23f, 2.96f)
                reflectiveCurveToRelative(-0.44f, 2.17f, -1.23f, 2.96f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, -0.0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(1.17f, -1.17f, 1.82f, -2.72f, 1.82f, -4.38f)
                reflectiveCurveToRelative(-0.65f, -3.21f, -1.82f, -4.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.23f, 7.63f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, -0.0f)
                curveToRelative(-1.17f, 1.17f, -1.82f, 2.72f, -1.82f, 4.38f)
                reflectiveCurveToRelative(0.65f, 3.21f, 1.82f, 4.38f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.0f, -1.41f)
                curveToRelative(-0.79f, -0.79f, -1.23f, -1.84f, -1.23f, -2.96f)
                reflectiveCurveToRelative(0.44f, -2.17f, 1.23f, -2.96f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13.68f)
                curveToRelative(-0.55f, 0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }.also { _EngineWarning = it}

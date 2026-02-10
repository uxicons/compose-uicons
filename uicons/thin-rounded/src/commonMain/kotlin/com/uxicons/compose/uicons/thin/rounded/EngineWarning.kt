package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Tr.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(11.5f, 12.5f)
                lineTo(11.5f, 7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 2.78f, -0.97f, 5.5f, -2.74f, 7.64f)
                curveToRelative(-0.1f, 0.12f, -0.24f, 0.18f, -0.39f, 0.18f)
                curveToRelative(-0.11f, 0f, -0.23f, -0.04f, -0.32f, -0.11f)
                curveToRelative(-0.21f, -0.18f, -0.24f, -0.49f, -0.07f, -0.7f)
                curveToRelative(1.62f, -1.96f, 2.52f, -4.45f, 2.52f, -7f)
                reflectiveCurveToRelative(-0.89f, -5.04f, -2.52f, -7f)
                curveToRelative(-0.18f, -0.21f, -0.15f, -0.53f, 0.07f, -0.7f)
                curveToRelative(0.21f, -0.18f, 0.53f, -0.15f, 0.7f, 0.07f)
                curveToRelative(1.77f, 2.14f, 2.74f, 4.85f, 2.74f, 7.64f)
                close()
                moveTo(3.52f, 5f)
                curveToRelative(-1.62f, 1.96f, -2.52f, 4.45f, -2.52f, 7f)
                reflectiveCurveToRelative(0.89f, 5.04f, 2.52f, 7f)
                curveToRelative(0.18f, 0.21f, 0.15f, 0.53f, -0.07f, 0.7f)
                curveToRelative(-0.09f, 0.08f, -0.21f, 0.11f, -0.32f, 0.11f)
                curveToRelative(-0.14f, 0f, -0.29f, -0.06f, -0.39f, -0.18f)
                curveTo(0.97f, 17.5f, 0f, 14.78f, 0f, 12f)
                reflectiveCurveTo(0.97f, 6.5f, 2.74f, 4.36f)
                curveToRelative(0.18f, -0.21f, 0.49f, -0.24f, 0.7f, -0.07f)
                curveToRelative(0.21f, 0.18f, 0.24f, 0.49f, 0.07f, 0.7f)
                close()
                moveTo(13f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _EngineWarning = it}

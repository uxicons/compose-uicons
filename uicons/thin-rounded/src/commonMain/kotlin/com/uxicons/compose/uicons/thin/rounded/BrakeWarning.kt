package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrakeWarning: ImageVector? = null

val Icons.Tr.BrakeWarning: ImageVector
    get() = _BrakeWarning ?: UXIcon(name = "BrakeWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.21f, 19.42f)
                curveToRelative(0.2f, 0.19f, 0.21f, 0.51f, 0.02f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.36f, 0.15f)
                curveToRelative(-0.12f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                curveTo(1.25f, 17.97f, 0f, 15.08f, 0f, 12f)
                reflectiveCurveTo(1.25f, 6.03f, 3.52f, 3.86f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.18f, 0.71f, 0.02f)
                curveToRelative(0.19f, 0.2f, 0.18f, 0.52f, -0.02f, 0.71f)
                curveToRelative(-2.07f, 1.98f, -3.21f, 4.62f, -3.21f, 7.42f)
                reflectiveCurveToRelative(1.14f, 5.43f, 3.21f, 7.42f)
                close()
                moveTo(20.48f, 3.86f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.18f, -0.71f, 0.02f)
                curveToRelative(-0.19f, 0.2f, -0.18f, 0.52f, 0.02f, 0.71f)
                curveToRelative(2.07f, 1.98f, 3.21f, 4.62f, 3.21f, 7.42f)
                reflectiveCurveToRelative(-1.14f, 5.43f, -3.21f, 7.42f)
                curveToRelative(-0.2f, 0.19f, -0.21f, 0.51f, -0.02f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.12f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(2.27f, -2.17f, 3.52f, -5.06f, 3.52f, -8.14f)
                reflectiveCurveToRelative(-1.25f, -5.97f, -3.52f, -8.14f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 7.59f, 4f, 12f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                close()
                moveTo(12f, 14f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(12.5f, 6.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
        }.also { _BrakeWarning = it}

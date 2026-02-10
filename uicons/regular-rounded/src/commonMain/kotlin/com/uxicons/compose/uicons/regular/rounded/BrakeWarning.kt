package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrakeWarning: ImageVector? = null

val Icons.Rr.BrakeWarning: ImageVector
    get() = _BrakeWarning ?: UXIcon(name = "BrakeWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.28f, 18.36f)
                curveToRelative(0.35f, 0.43f, 0.29f, 1.06f, -0.13f, 1.41f)
                curveToRelative(-0.19f, 0.15f, -0.41f, 0.23f, -0.64f, 0.23f)
                curveToRelative(-0.29f, 0f, -0.57f, -0.12f, -0.77f, -0.36f)
                curveToRelative(-3.65f, -4.42f, -3.66f, -10.83f, -0.01f, -15.26f)
                curveToRelative(0.35f, -0.43f, 0.98f, -0.49f, 1.41f, -0.14f)
                curveToRelative(0.43f, 0.35f, 0.49f, 0.98f, 0.14f, 1.41f)
                curveToRelative(-3.04f, 3.69f, -3.03f, 9.03f, 0.01f, 12.71f)
                close()
                moveTo(21.27f, 4.38f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.49f, -1.41f, -0.14f)
                curveToRelative(-0.43f, 0.35f, -0.49f, 0.98f, -0.14f, 1.41f)
                curveToRelative(3.03f, 3.68f, 3.03f, 9.02f, 0f, 12.7f)
                curveToRelative(-0.35f, 0.43f, -0.29f, 1.06f, 0.14f, 1.41f)
                curveToRelative(0.19f, 0.15f, 0.41f, 0.23f, 0.64f, 0.23f)
                curveToRelative(0.29f, 0f, 0.57f, -0.12f, 0.77f, -0.36f)
                curveToRelative(3.64f, -4.42f, 3.64f, -10.82f, 0f, -15.24f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(12f, 12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _BrakeWarning = it}

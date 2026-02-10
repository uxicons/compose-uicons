package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleN: ImageVector? = null

val Icons.Tr.CircleN: ImageVector
    get() = _CircleN ?: UXIcon(name = "CircleN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 6.5f)
                verticalLineToRelative(9.82f)
                curveToRelative(0f, 0.82f, -0.48f, 1.48f, -1.2f, 1.64f)
                curveToRelative(-0.1f, 0.02f, -0.21f, 0.03f, -0.31f, 0.03f)
                curveToRelative(-0.59f, 0f, -1.15f, -0.38f, -1.44f, -1.0f)
                lineToRelative(-4.99f, -9.55f)
                curveToRelative(-0.15f, -0.33f, -0.4f, -0.49f, -0.64f, -0.43f)
                curveToRelative(-0.19f, 0.04f, -0.42f, 0.24f, -0.42f, 0.67f)
                verticalLineToRelative(9.82f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(7.0f, 7.68f)
                curveToRelative(0f, -0.82f, 0.48f, -1.48f, 1.2f, -1.64f)
                curveToRelative(0.71f, -0.16f, 1.41f, 0.23f, 1.75f, 0.97f)
                lineToRelative(4.99f, 9.55f)
                curveToRelative(0.15f, 0.33f, 0.39f, 0.48f, 0.64f, 0.43f)
                curveToRelative(0.19f, -0.04f, 0.42f, -0.24f, 0.42f, -0.67f)
                lineTo(16.0f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
            }
        }.also { _CircleN = it}

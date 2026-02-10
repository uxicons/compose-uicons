package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Ts.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 6f)
                lineTo(7.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineToRelative(0.01f, 8.51f)
                horizontalLineToRelative(14f)
                lineToRelative(-0.01f, -8.51f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(16.5f, 7f)
                curveToRelative(0.36f, 0f, 0.69f, 0.13f, 0.95f, 0.34f)
                lineToRelative(-4.1f, 4.1f)
                curveToRelative(-0.72f, 0.72f, -1.97f, 0.72f, -2.68f, 0f)
                lineTo(6.56f, 7.33f)
                curveToRelative(0.26f, -0.21f, 0.59f, -0.33f, 0.94f, -0.33f)
                horizontalLineToRelative(9f)
                close()
                moveTo(6.01f, 16.01f)
                lineToRelative(-0.01f, -7.51f)
                curveToRelative(0f, -0.1f, 0.01f, -0.19f, 0.03f, -0.28f)
                lineToRelative(3.93f, 3.93f)
                curveToRelative(0.55f, 0.55f, 1.27f, 0.85f, 2.05f, 0.85f)
                reflectiveCurveToRelative(1.5f, -0.3f, 2.05f, -0.85f)
                lineToRelative(3.92f, -3.92f)
                curveToRelative(0.02f, 0.09f, 0.03f, 0.18f, 0.03f, 0.27f)
                lineToRelative(0.01f, 7.51f)
                lineTo(6.01f, 16.01f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
        }.also { _CircleEnvelope = it}

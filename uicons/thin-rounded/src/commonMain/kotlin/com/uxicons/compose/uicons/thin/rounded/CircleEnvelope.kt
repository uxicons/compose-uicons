package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Tr.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 6f)
                horizontalLineToRelative(-0.0f)
                lineToRelative(-7f, 0.01f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0f, 0.94f, 0.36f, 1.81f, 1.02f, 2.47f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.02f, 2.47f, 1.02f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.03f, -2.48f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.47f, -1.02f)
                close()
                moveTo(15.5f, 7f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.62f, 0f, 1.21f, 0.23f, 1.66f, 0.64f)
                lineToRelative(-3.81f, 3.81f)
                curveToRelative(-0.72f, 0.72f, -1.97f, 0.72f, -2.68f, 0f)
                lineToRelative(-3.82f, -3.82f)
                curveToRelative(0.44f, -0.39f, 1.02f, -0.62f, 1.65f, -0.62f)
                lineToRelative(7f, -0.01f)
                close()
                moveTo(18f, 13.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.67f, 0f, -1.29f, -0.26f, -1.77f, -0.73f)
                curveToRelative(-0.47f, -0.47f, -0.73f, -1.1f, -0.73f, -1.77f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0f, -0.38f, 0.09f, -0.74f, 0.24f, -1.07f)
                lineToRelative(3.72f, 3.72f)
                curveToRelative(0.55f, 0.55f, 1.27f, 0.85f, 2.05f, 0.85f)
                reflectiveCurveToRelative(1.5f, -0.3f, 2.05f, -0.85f)
                lineToRelative(3.71f, -3.71f)
                curveToRelative(0.15f, 0.33f, 0.23f, 0.68f, 0.23f, 1.05f)
                verticalLineToRelative(4f)
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

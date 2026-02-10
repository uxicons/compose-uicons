package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Bs.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.66f, 7.03f)
                curveToRelative(0.11f, -0.02f, 0.23f, -0.03f, 0.34f, -0.03f)
                horizontalLineToRelative(8f)
                curveToRelative(0.12f, 0f, 0.23f, 0.0f, 0.35f, 0.03f)
                lineToRelative(-3.71f, 3.71f)
                curveToRelative(-0.34f, 0.34f, -0.93f, 0.34f, -1.27f, 0f)
                lineToRelative(-3.71f, -3.71f)
                close()
                moveTo(14.76f, 12.86f)
                curveToRelative(-0.73f, 0.74f, -1.71f, 1.14f, -2.75f, 1.14f)
                reflectiveCurveToRelative(-2.02f, -0.41f, -2.76f, -1.14f)
                lineToRelative(-3.24f, -3.25f)
                verticalLineToRelative(6.39f)
                lineToRelative(11.99f, -0.01f)
                verticalLineToRelative(-6.37f)
                lineToRelative(-3.24f, 3.24f)
                close()
                moveTo(24f, 12.0f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                close()
                moveTo(21f, 12.0f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
            }
        }.also { _CircleEnvelope = it}

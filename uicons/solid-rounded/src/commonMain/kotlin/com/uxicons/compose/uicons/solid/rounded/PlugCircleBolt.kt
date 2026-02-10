package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleBolt: ImageVector? = null

val Icons.Sr.PlugCircleBolt: ImageVector
    get() = _PlugCircleBolt ?: UXIcon(name = "PlugCircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, 0f, 0.01f, -3.81f, 0.01f, -4.06f)
                curveToRelative(-3.94f, -0.48f, -7.01f, -3.81f, -7.01f, -7.84f)
                verticalLineToRelative(-3.1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                lineTo(4f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(6f, 6f)
                horizontalLineToRelative(6f)
                lineTo(12f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(14f, 6f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                verticalLineToRelative(2.07f)
                curveToRelative(-3.94f, 0.49f, -7f, 3.85f, -7f, 7.93f)
                verticalLineToRelative(5f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(20.73f, 19.49f)
                curveToRelative(0.33f, -0.49f, 0.36f, -1.12f, 0.08f, -1.65f)
                reflectiveCurveToRelative(-0.82f, -0.85f, -1.41f, -0.85f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(1.47f, -2.43f)
                curveToRelative(0.3f, -0.47f, 0.18f, -1.09f, -0.29f, -1.4f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.46f, -0.31f, -1.08f, -0.19f, -1.4f, 0.27f)
                curveToRelative(-0.63f, 0.91f, -1.77f, 2.8f, -2.08f, 3.48f)
                curveToRelative(-0.21f, 0.46f, -0.05f, 1.02f, 0.25f, 1.43f)
                curveToRelative(0.3f, 0.41f, 0.79f, 0.65f, 1.3f, 0.65f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-1.47f, 2.43f)
                curveToRelative(-0.32f, 0.46f, -0.2f, 1.09f, 0.26f, 1.4f)
                horizontalLineToRelative(0f)
                curveToRelative(0.45f, 0.3f, 1.07f, 0.19f, 1.38f, -0.26f)
                lineToRelative(1.91f, -3.08f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _PlugCircleBolt = it}

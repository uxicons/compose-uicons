package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleBolt: ImageVector? = null

val Icons.Rr.PlugCircleBolt: ImageVector
    get() = _PlugCircleBolt ?: UXIcon(name = "PlugCircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(9f, 18.92f)
                verticalLineToRelative(4.08f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.08f)
                curveToRelative(-3.42f, -0.48f, -6f, -3.46f, -6f, -6.92f)
                verticalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                lineTo(4f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(6f, 6f)
                horizontalLineToRelative(5f)
                lineTo(11f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(13f, 6f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(3f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.48f, 1.84f, 4.6f, 4.29f, 4.95f)
                curveToRelative(0.98f, 0.14f, 1.71f, 0.99f, 1.71f, 1.97f)
                close()
                moveTo(19.31f, 16.85f)
                curveToRelative(0.28f, 0.52f, 0.25f, 1.15f, -0.08f, 1.65f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-1.44f, 2.15f, -1.44f, 2.15f)
                curveToRelative(-0.31f, 0.45f, -0.93f, 0.57f, -1.38f, 0.26f)
                curveToRelative(-0.46f, -0.31f, -0.58f, -0.94f, -0.26f, -1.4f)
                lineToRelative(1f, -1.5f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.46f, -0.97f, -0.25f, -1.43f)
                curveToRelative(0.31f, -0.68f, 0.92f, -1.64f, 1.55f, -2.55f)
                curveToRelative(0.32f, -0.46f, 0.94f, -0.58f, 1.4f, -0.27f)
                curveToRelative(0.46f, 0.31f, 0.59f, 0.93f, 0.29f, 1.4f)
                lineToRelative(-0.94f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.85f)
                close()
            }
        }.also { _PlugCircleBolt = it}

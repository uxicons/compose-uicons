package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MotionGraphic: ImageVector? = null

val Icons.Rr.MotionGraphic: ImageVector
    get() = _MotionGraphic ?: UXIcon(name = "MotionGraphic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.02f, 0f, -1.9f, -0.62f, -2.29f, -1.5f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(12.21f, 20f)
                curveToRelative(0.39f, -0.88f, 1.26f, -1.5f, 2.29f, -1.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(17.5f, 4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(22f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 5f)
                close()
                moveTo(11.56f, 5.51f)
                curveToRelative(-2.05f, 1.01f, -3.21f, 2.6f, -3.85f, 3.93f)
                curveToRelative(-0.9f, -0.95f, -2.01f, -1.3f, -2.47f, -1.42f)
                curveToRelative(-0.53f, -0.13f, -1.08f, 0.2f, -1.21f, 0.74f)
                curveToRelative(-0.13f, 0.54f, 0.2f, 1.08f, 0.74f, 1.21f)
                curveToRelative(0.54f, 0.13f, 1.84f, 0.61f, 2.16f, 2.22f)
                curveToRelative(0.09f, 0.47f, 0.51f, 0.81f, 0.98f, 0.81f)
                curveToRelative(0.01f, 0f, 0.02f, 0f, 0.03f, 0f)
                curveToRelative(0.49f, -0.01f, 0.9f, -0.38f, 0.96f, -0.86f)
                curveToRelative(0.02f, -0.14f, 0.5f, -3.32f, 3.54f, -4.83f)
                curveToRelative(0.49f, -0.24f, 0.7f, -0.84f, 0.45f, -1.34f)
                curveToRelative(-0.25f, -0.49f, -0.84f, -0.7f, -1.34f, -0.45f)
                close()
                moveTo(23f, 20f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _MotionGraphic = it}

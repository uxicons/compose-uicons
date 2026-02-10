package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MotionGraphic: ImageVector? = null

val Icons.Ss.MotionGraphic: ImageVector
    get() = _MotionGraphic ?: UXIcon(name = "MotionGraphic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.02f, 0f, -1.9f, -0.62f, -2.29f, -1.5f)
                lineTo(0f, 22f)
                verticalLineToRelative(-2f)
                lineTo(12.21f, 20f)
                curveToRelative(0.39f, -0.88f, 1.26f, -1.5f, 2.29f, -1.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(19f, 21f)
                curveToRelative(0f, 0.34f, -0.04f, 0.68f, -0.1f, 1f)
                horizontalLineToRelative(5.1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5.1f)
                curveToRelative(0.07f, 0.32f, 0.1f, 0.66f, 0.1f, 1f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(14f)
                lineTo(0f, 17f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(13f, 6.5f)
                curveToRelative(0f, -0.51f, 0.1f, -0.98f, 0.26f, -1.44f)
                curveToRelative(-2.05f, 0.3f, -4.4f, 1.82f, -5.55f, 4.45f)
                curveToRelative(-1.11f, -1.13f, -2.68f, -1.51f, -3.71f, -1.51f)
                lineToRelative(-0.01f, 2f)
                curveToRelative(0.5f, 0.01f, 3.01f, 0.18f, 3.01f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -3.3f, 2.16f, -5.34f, 4.06f, -5.86f)
                curveToRelative(-0.03f, -0.21f, -0.06f, -0.42f, -0.06f, -0.64f)
                close()
                moveTo(20f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _MotionGraphic = it}

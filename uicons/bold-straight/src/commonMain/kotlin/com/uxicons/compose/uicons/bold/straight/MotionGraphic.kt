package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MotionGraphic: ImageVector? = null

val Icons.Bs.MotionGraphic: ImageVector
    get() = _MotionGraphic ?: UXIcon(name = "MotionGraphic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-0.81f, 0f, -1.53f, -0.4f, -1.99f, -1f)
                lineTo(0f, 23f)
                verticalLineToRelative(-3f)
                lineTo(12.51f, 20f)
                curveToRelative(0.46f, -0.6f, 1.17f, -1f, 1.99f, -1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(16.5f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(24f, 17f)
                lineTo(0f, 17f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveTo(22.43f, 0f, 24f, 1.57f, 24f, 3.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 14f)
                lineTo(21f, 14f)
                lineTo(21f, 3.5f)
                close()
                moveTo(18.72f, 20f)
                curveToRelative(0.17f, 0.47f, 0.28f, 0.97f, 0.28f, 1.5f)
                reflectiveCurveToRelative(-0.11f, 1.03f, -0.28f, 1.5f)
                horizontalLineToRelative(5.28f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5.28f)
                close()
                moveTo(8.11f, 8.03f)
                curveToRelative(-0.9f, -0.68f, -2.02f, -1.03f, -3.11f, -1.03f)
                verticalLineToRelative(3f)
                curveToRelative(0.08f, 0f, 2f, 0.02f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.34f, 0.31f, -3.0f, 2.08f, -3.67f)
                curveToRelative(-0.05f, -0.27f, -0.08f, -0.54f, -0.08f, -0.83f)
                curveToRelative(0f, -0.87f, 0.26f, -1.68f, 0.69f, -2.37f)
                curveToRelative(-2.07f, 0.36f, -3.63f, 1.54f, -4.59f, 2.91f)
                close()
            }
        }.also { _MotionGraphic = it}

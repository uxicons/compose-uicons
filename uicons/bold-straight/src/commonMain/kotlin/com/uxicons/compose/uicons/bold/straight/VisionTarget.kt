package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VisionTarget: ImageVector? = null

val Icons.Bs.VisionTarget: ImageVector
    get() = _VisionTarget ?: UXIcon(name = "VisionTarget") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 21f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                lineTo(3f, 17f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineToRelative(-3.5f)
                lineTo(17f, 3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                lineTo(7f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(3.5f)
                lineTo(3f, 7f)
                lineTo(3f, 3.5f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-5.24f, 0f, -8.61f, -4.6f, -9.22f, -5.83f)
                curveToRelative(-0.37f, -0.74f, -0.37f, -1.6f, 0f, -2.34f)
                curveToRelative(0.61f, -1.23f, 3.98f, -5.83f, 9.22f, -5.83f)
                reflectiveCurveToRelative(8.61f, 4.6f, 9.22f, 5.83f)
                curveToRelative(0.37f, 0.74f, 0.37f, 1.6f, 0f, 2.34f)
                curveToRelative(-0.61f, 1.23f, -3.98f, 5.83f, -9.22f, 5.83f)
                close()
                moveTo(18.44f, 12f)
                curveToRelative(-0.58f, -0.96f, -3.0f, -4f, -6.44f, -4f)
                reflectiveCurveToRelative(-5.86f, 3.04f, -6.44f, 4f)
                curveToRelative(0.58f, 0.96f, 3.0f, 4f, 6.44f, 4f)
                reflectiveCurveToRelative(5.86f, -3.04f, 6.44f, -4f)
                close()
                moveTo(12f, 9.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _VisionTarget = it}

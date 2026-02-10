package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDiskCircleArrowRight: ImageVector? = null

val Icons.Bs.FloppyDiskCircleArrowRight: ImageVector
    get() = _FloppyDiskCircleArrowRight ?: UXIcon(name = "FloppyDiskCircleArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.14f, 19f)
                curveToRelative(0.19f, 1.09f, 0.59f, 2.1f, 1.16f, 3f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(12.74f)
                lineToRelative(5.76f, 5.76f)
                verticalLineToRelative(4.54f)
                curveToRelative(-0.9f, -0.56f, -1.91f, -0.96f, -3f, -1.16f)
                verticalLineToRelative(-2.14f)
                lineTo(15f, 3f)
                lineTo(15f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(6.14f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(21.71f, 16.79f)
                lineToRelative(-3.71f, -3.79f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(7f, 12.5f)
                curveToRelative(0f, 1.47f, 0.9f, 2.72f, 2.18f, 3.24f)
                curveToRelative(0.49f, -2.34f, 1.96f, -4.33f, 3.95f, -5.52f)
                curveToRelative(-0.64f, -0.74f, -1.58f, -1.22f, -2.63f, -1.22f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                close()
            }
        }.also { _FloppyDiskCircleArrowRight = it}

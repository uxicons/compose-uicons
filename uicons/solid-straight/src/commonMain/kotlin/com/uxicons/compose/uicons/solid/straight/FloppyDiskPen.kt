package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDiskPen: ImageVector? = null

val Icons.Ss.FloppyDiskPen: ImageVector
    get() = _FloppyDiskPen ?: UXIcon(name = "FloppyDiskPen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.26f, 12.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0f)
                lineToRelative(-7.67f, 7.67f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.79f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(-7f)
                lineTo(7f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                close()
                moveTo(16.01f, -0f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(7f)
                lineTo(5f, 7f)
                lineTo(5f, 0f)
                horizontalLineToRelative(-2f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.42f)
                lineToRelative(8.25f, -8.25f)
                curveToRelative(0.75f, -0.75f, 1.71f, -1.2f, 2.75f, -1.31f)
                verticalLineToRelative(-5.03f)
                lineTo(16.01f, 0f)
                close()
                moveTo(10.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _FloppyDiskPen = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDiskPen: ImageVector? = null

val Icons.Bs.FloppyDiskPen: ImageVector
    get() = _FloppyDiskPen ?: UXIcon(name = "FloppyDiskPen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(12.74f)
                lineToRelative(5.76f, 5.76f)
                verticalLineToRelative(5.26f)
                curveToRelative(-1.07f, -0.05f, -2.15f, 0.32f, -3f, 1.09f)
                verticalLineToRelative(-5.11f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(4f)
                lineTo(5f, 7f)
                lineTo(5f, 3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(10.5f, 9f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(23.36f, 13.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                close()
            }
        }.also { _FloppyDiskPen = it}

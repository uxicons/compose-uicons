package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardDrive: ImageVector? = null

val Icons.Sr.HardDrive: ImageVector
    get() = _HardDrive ?: UXIcon(name = "HardDrive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.09f, 15f)
                lineToRelative(1.05f, -10.5f)
                curveToRelative(0.26f, -2.57f, 2.4f, -4.5f, 4.98f, -4.5f)
                horizontalLineToRelative(9.76f)
                curveToRelative(2.58f, 0f, 4.72f, 1.94f, 4.98f, 4.5f)
                lineToRelative(1.05f, 10.5f)
                close()
                moveTo(23f, 17f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16f, 20.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20f, 20.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _HardDrive = it}

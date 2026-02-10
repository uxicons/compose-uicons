package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardDrive: ImageVector? = null

val Icons.Ss.HardDrive: ImageVector
    get() = _HardDrive ?: UXIcon(name = "HardDrive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.1f, 15f)
                lineToRelative(1.23f, -12.3f)
                curveToRelative(0.15f, -1.54f, 1.44f, -2.7f, 2.98f, -2.7f)
                horizontalLineToRelative(13.38f)
                curveToRelative(1.55f, 0f, 2.83f, 1.16f, 2.98f, 2.7f)
                lineToRelative(1.23f, 12.3f)
                close()
                moveTo(23f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-7f)
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

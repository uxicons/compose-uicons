package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardDrive: ImageVector? = null

val Icons.Bs.HardDrive: ImageVector
    get() = _HardDrive ?: UXIcon(name = "HardDrive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.11f, 3.29f)
                curveToRelative(-0.11f, -1.84f, -1.65f, -3.29f, -3.49f, -3.29f)
                horizontalLineToRelative(-13.24f)
                curveToRelative(-1.85f, 0f, -3.38f, 1.44f, -3.49f, 3.29f)
                lineToRelative(-0.89f, 15.21f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(4.88f, 3.47f)
                curveToRelative(0.02f, -0.26f, 0.23f, -0.47f, 0.5f, -0.47f)
                horizontalLineToRelative(13.23f)
                curveToRelative(0.26f, 0f, 0.48f, 0.21f, 0.5f, 0.47f)
                lineToRelative(0.82f, 13.53f)
                horizontalLineToRelative(-15.88f)
                close()
                moveTo(14.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HardDrive = it}

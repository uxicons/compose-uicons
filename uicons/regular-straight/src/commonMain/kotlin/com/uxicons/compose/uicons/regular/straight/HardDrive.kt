package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardDrive: ImageVector? = null

val Icons.Rs.HardDrive: ImageVector
    get() = _HardDrive ?: UXIcon(name = "HardDrive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(18.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-8f)
                lineToRelative(1.32f, -13.3f)
                curveToRelative(0.15f, -1.54f, 1.44f, -2.7f, 2.98f, -2.7f)
                horizontalLineToRelative(13.38f)
                curveToRelative(1.55f, 0f, 2.83f, 1.16f, 2.98f, 2.7f)
                close()
                moveTo(3.1f, 15f)
                horizontalLineToRelative(17.79f)
                lineToRelative(-1.21f, -12.1f)
                curveToRelative(-0.05f, -0.51f, -0.48f, -0.9f, -0.99f, -0.9f)
                horizontalLineToRelative(-13.38f)
                curveToRelative(-0.52f, 0f, -0.94f, 0.39f, -0.99f, 0.9f)
                close()
                moveTo(21f, 22f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-18.0f)
                lineToRelative(0.0f, 5f)
                close()
            }
        }.also { _HardDrive = it}

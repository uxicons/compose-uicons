package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardDrive: ImageVector? = null

val Icons.Ts.HardDrive: ImageVector
    get() = _HardDrive ?: UXIcon(name = "HardDrive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(19f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23f, 16.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-7.5f)
                lineToRelative(1.78f, -14.31f)
                curveToRelative(0.16f, -1.25f, 1.22f, -2.19f, 2.48f, -2.19f)
                horizontalLineToRelative(13.47f)
                curveToRelative(1.26f, 0f, 2.33f, 0.94f, 2.48f, 2.19f)
                lineToRelative(1.78f, 14.31f)
                close()
                moveTo(2.07f, 16f)
                horizontalLineToRelative(19.87f)
                lineToRelative(-1.71f, -13.69f)
                curveToRelative(-0.09f, -0.75f, -0.73f, -1.31f, -1.49f, -1.31f)
                horizontalLineToRelative(-13.47f)
                curveToRelative(-0.76f, 0f, -1.4f, 0.56f, -1.49f, 1.31f)
                lineToRelative(-1.71f, 13.69f)
                close()
                moveTo(22f, 23f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-20.0f)
                lineToRelative(0.0f, 6f)
                horizontalLineToRelative(20f)
                close()
            }
        }.also { _HardDrive = it}

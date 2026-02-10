package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckCheck: ImageVector? = null

val Icons.Bs.TruckCheck: ImageVector
    get() = _TruckCheck ?: UXIcon(name = "TruckCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.19f, 7.4f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.79f, 3.79f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(3.44f, -3.44f)
                close()
                moveTo(24f, 20f)
                horizontalLineToRelative(-3.06f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.03f, -0.34f, 0.06f, -0.5f)
                lineTo(7.94f, 20f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.03f, -0.34f, 0.06f, -0.5f)
                lineTo(0f, 20f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(14f, 4.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(11f)
                lineTo(14f, 4.5f)
                close()
                moveTo(17f, 8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }.also { _TruckCheck = it}

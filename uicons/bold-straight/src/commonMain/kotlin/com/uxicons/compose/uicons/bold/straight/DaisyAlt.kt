package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DaisyAlt: ImageVector? = null

val Icons.Bs.DaisyAlt: ImageVector
    get() = _DaisyAlt ?: UXIcon(name = "DaisyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 17.2f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0.8f, -0.7f, 1.3f, -2.1f, 0.4f, -4.1f)
                curveToRelative(3.8f, 5f, 8.6f, -2.3f, 2.4f, -3.3f)
                curveToRelative(6.2f, -1f, 1.4f, -8.4f, -2.4f, -3.3f)
                curveTo(15.2f, 1.6f, 13.6f, 0f, 12f, 0f)
                curveToRelative(-1.6f, 0f, -3.2f, 1.6f, -1.9f, 4.7f)
                curveTo(6.2f, -0.4f, 1.5f, 6.9f, 7.7f, 8f)
                curveToRelative(-6.2f, 1f, -1.4f, 8.3f, 2.4f, 3.3f)
                curveToRelative(-0.8f, 2f, -0.4f, 3.4f, 0.4f, 4.1f)
                verticalLineToRelative(1.8f)
                curveTo(8.1f, 15f, 4.2f, 13.7f, 0f, 15.2f)
                curveTo(0f, 22.8f, 5.5f, 24f, 10.9f, 24f)
                lineToRelative(1.1f, 0f)
                horizontalLineToRelative(0f)
                horizontalLineToRelative(0f)
                lineToRelative(1.1f, 0f)
                curveToRelative(5.4f, 0f, 10.9f, -1.2f, 10.9f, -8.8f)
                curveTo(19.8f, 13.7f, 15.9f, 15f, 13.5f, 17.2f)
                close()
                moveTo(3.1f, 17.6f)
                curveToRelative(3.6f, -0.4f, 5.6f, 1.7f, 6.6f, 3.4f)
                curveTo(7.2f, 20.9f, 3.8f, 20.4f, 3.1f, 17.6f)
                close()
                moveTo(12f, 10f)
                curveTo(12f, 10f, 12f, 10f, 12f, 10f)
                curveTo(12f, 10f, 12f, 10f, 12f, 10f)
                curveToRelative(-2.6f, 0f, -2.6f, -4f, 0f, -4f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveTo(14.6f, 5.9f, 14.6f, 10f, 12f, 10f)
                close()
                moveTo(14.3f, 21f)
                curveToRelative(1f, -1.7f, 3f, -3.8f, 6.6f, -3.4f)
                curveTo(20.2f, 20.4f, 16.8f, 20.9f, 14.3f, 21f)
                close()
            }
        }.also { _DaisyAlt = it}

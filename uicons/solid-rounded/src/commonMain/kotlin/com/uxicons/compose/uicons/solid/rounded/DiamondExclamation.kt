package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Sr.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 8.46f)
                lineTo(15.54f, 1.46f)
                curveTo(14.59f, 0.52f, 13.34f, -0.01f, 12.0f, -0.01f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.47f)
                lineTo(1.47f, 8.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                lineToRelative(7.0f, 7.0f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.47f, 3.54f, 1.47f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.47f)
                lineToRelative(7.0f, -7.0f)
                curveToRelative(0.94f, -0.94f, 1.46f, -2.2f, 1.46f, -3.53f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.46f, -3.54f)
                close()
                moveTo(11f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _DiamondExclamation = it}

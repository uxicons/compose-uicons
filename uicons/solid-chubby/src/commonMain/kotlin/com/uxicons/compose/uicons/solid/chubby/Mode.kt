package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mode: ImageVector? = null

val Icons.Sc.Mode: ImageVector
    get() = _Mode ?: UXIcon(name = "Mode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11f)
                curveToRelative(-1.59f, 0f, -2f, -0.41f, -2f, -2f)
                reflectiveCurveToRelative(0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                reflectiveCurveToRelative(-0.41f, 2f, -2f, 2f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-5.53f, 0f, -8f, -2.47f, -8f, -8f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -5.53f, 2.47f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 2.47f, 8f, 8f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 5.53f, -2.47f, 8f, -8f, 8f)
                close()
                moveTo(12f, 13f)
                curveToRelative(2.69f, 0f, 4f, -1.31f, 4f, -4f)
                reflectiveCurveToRelative(-1.31f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                close()
            }
        }.also { _Mode = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StopCircle: ImageVector? = null

val Icons.Ss.StopCircle: ImageVector
    get() = _StopCircle ?: UXIcon(name = "StopCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 15f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(17f, 7f)
                lineTo(7f, 7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                lineTo(17f, 7f)
                close()
            }
        }.also { _StopCircle = it}

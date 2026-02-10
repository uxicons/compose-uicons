package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RewindButtonCircle: ImageVector? = null

val Icons.Ss.RewindButtonCircle: ImageVector
    get() = _RewindButtonCircle ?: UXIcon(name = "RewindButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 14.09f)
                lineToRelative(-3.18f, -2.08f)
                lineToRelative(3.18f, -2.08f)
                verticalLineToRelative(4.17f)
                close()
                moveTo(16f, 9.91f)
                lineToRelative(-3.18f, 2.08f)
                lineToRelative(3.18f, 2.08f)
                verticalLineToRelative(-4.17f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18f, 6.21f)
                lineToRelative(-6f, 3.94f)
                verticalLineToRelative(-3.94f)
                lineTo(3.18f, 12f)
                lineToRelative(8.82f, 5.79f)
                verticalLineToRelative(-3.94f)
                lineToRelative(6f, 3.94f)
                lineTo(18f, 6.21f)
                close()
            }
        }.also { _RewindButtonCircle = it}

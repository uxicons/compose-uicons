package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RewindButtonCircle: ImageVector? = null

val Icons.Rs.RewindButtonCircle: ImageVector
    get() = _RewindButtonCircle ?: UXIcon(name = "RewindButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.21f)
                lineTo(3.18f, 12f)
                lineToRelative(8.82f, 5.79f)
                verticalLineToRelative(-3.94f)
                lineToRelative(6f, 3.94f)
                lineTo(18f, 6.21f)
                lineToRelative(-6f, 3.94f)
                verticalLineToRelative(-3.94f)
                close()
                moveTo(16f, 9.91f)
                verticalLineToRelative(4.17f)
                lineToRelative(-3.18f, -2.08f)
                lineToRelative(3.18f, -2.08f)
                close()
                moveTo(10f, 14.09f)
                lineToRelative(-3.18f, -2.08f)
                lineToRelative(3.18f, -2.08f)
                verticalLineToRelative(4.17f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _RewindButtonCircle = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RewindButtonCircle: ImageVector? = null

val Icons.Bs.RewindButtonCircle: ImageVector
    get() = _RewindButtonCircle ?: UXIcon(name = "RewindButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.69f)
                lineToRelative(5f, -3.28f)
                verticalLineToRelative(9.19f)
                lineToRelative(-5f, -3.28f)
                verticalLineToRelative(3.28f)
                lineToRelative(-7f, -4.59f)
                lineToRelative(7f, -4.59f)
                verticalLineToRelative(3.28f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _RewindButtonCircle = it}

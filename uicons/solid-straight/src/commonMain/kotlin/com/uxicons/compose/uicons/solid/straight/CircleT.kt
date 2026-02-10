package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleT: ImageVector? = null

val Icons.Ss.CircleT: ImageVector
    get() = _CircleT ?: UXIcon(name = "CircleT") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17.75f, 8.5f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _CircleT = it}

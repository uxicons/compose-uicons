package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleH: ImageVector? = null

val Icons.Ss.CircleH: ImageVector
    get() = _CircleH ?: UXIcon(name = "CircleH") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17f, 17.75f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 6.25f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11.5f)
                close()
            }
        }.also { _CircleH = it}

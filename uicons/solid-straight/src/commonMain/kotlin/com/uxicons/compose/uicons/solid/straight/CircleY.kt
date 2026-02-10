package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleY: ImageVector? = null

val Icons.Ss.CircleY: ImageVector
    get() = _CircleY ?: UXIcon(name = "CircleY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 13.04f)
                verticalLineToRelative(4.96f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.96f)
                lineToRelative(-5f, -6.79f)
                horizontalLineToRelative(2.48f)
                lineToRelative(3.52f, 4.77f)
                lineToRelative(3.52f, -4.77f)
                horizontalLineToRelative(2.48f)
                lineToRelative(-5f, 6.79f)
                close()
            }
        }.also { _CircleY = it}

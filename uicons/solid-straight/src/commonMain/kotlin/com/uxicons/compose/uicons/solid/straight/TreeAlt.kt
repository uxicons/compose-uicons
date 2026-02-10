package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeAlt: ImageVector? = null

val Icons.Ss.TreeAlt: ImageVector
    get() = _TreeAlt ?: UXIcon(name = "TreeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16.91f, 9f)
                horizontalLineToRelative(2.1f)
                lineTo(14.34f, 0.99f)
                curveToRelative(-0.5f, -0.63f, -1.27f, -0.99f, -2.11f, -0.99f)
                reflectiveCurveToRelative(-1.61f, 0.36f, -2.11f, 0.99f)
                lineToRelative(-0.08f, 0.11f)
                lineToRelative(-4.65f, 7.9f)
                horizontalLineToRelative(2.15f)
                lineToRelative(-3.96f, 6f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-3.48f, 6f)
                horizontalLineToRelative(8.51f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(8.96f)
                lineToRelative(-3.48f, -6f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-3.76f, -6f)
                close()
            }
        }.also { _TreeAlt = it}

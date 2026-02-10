package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeAlt: ImageVector? = null

val Icons.Bs.TreeAlt: ImageVector
    get() = _TreeAlt ?: UXIcon(name = "TreeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.6f, 22f)
                lineToRelative(-3.48f, -6f)
                horizontalLineToRelative(2.44f)
                lineToRelative(-3.96f, -6f)
                horizontalLineToRelative(2.1f)
                lineTo(14.5f, 1.18f)
                curveToRelative(-0.59f, -0.75f, -1.5f, -1.18f, -2.5f, -1.18f)
                reflectiveCurveToRelative(-1.91f, 0.43f, -2.5f, 1.18f)
                lineToRelative(-5.21f, 8.82f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-3.96f, 6f)
                horizontalLineToRelative(2.44f)
                lineToRelative(-3.48f, 6f)
                horizontalLineToRelative(9.1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9.1f)
                close()
                moveTo(6.6f, 19f)
                lineToRelative(3.48f, -6f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(3.96f, -6f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(2.34f, -3.98f)
                curveToRelative(0.05f, -0.02f, 0.19f, -0.02f, 0.24f, 0f)
                lineToRelative(2.34f, 3.98f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(3.96f, 6f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(3.48f, 6f)
                horizontalLineToRelative(-3.9f)
                verticalLineToRelative(-2.74f)
                lineToRelative(-1.5f, -2.59f)
                lineToRelative(-1.5f, 2.59f)
                verticalLineToRelative(2.74f)
                horizontalLineToRelative(-3.9f)
                close()
            }
        }.also { _TreeAlt = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeDeciduous: ImageVector? = null

val Icons.Ss.TreeDeciduous: ImageVector
    get() = _TreeDeciduous ?: UXIcon(name = "TreeDeciduous") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(17.93f, 5.06f)
                curveToRelative(-0.45f, -2.86f, -2.94f, -5.06f, -5.93f, -5.06f)
                reflectiveCurveTo(6.53f, 2.2f, 6.07f, 5.06f)
                curveToRelative(-3.42f, 0.45f, -6.07f, 3.39f, -6.07f, 6.94f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3.59f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                verticalLineToRelative(-3.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.59f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.71f, 3.71f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(4f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -3.55f, -2.65f, -6.48f, -6.07f, -6.94f)
                close()
            }
        }.also { _TreeDeciduous = it}

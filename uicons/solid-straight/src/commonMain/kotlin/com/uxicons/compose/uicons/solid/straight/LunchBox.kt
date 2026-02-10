package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LunchBox: ImageVector? = null

val Icons.Ss.LunchBox: ImageVector
    get() = _LunchBox ?: UXIcon(name = "LunchBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.46f)
                lineToRelative(0.28f, -2.35f)
                curveToRelative(0.18f, -1.51f, 1.46f, -2.65f, 2.98f, -2.65f)
                horizontalLineToRelative(14.56f)
                curveToRelative(1.52f, 0f, 2.8f, 1.14f, 2.98f, 2.65f)
                lineToRelative(0.28f, 2.35f)
                horizontalLineToRelative(1.46f)
                close()
                moveTo(2f, 4f)
                curveToRelative(0f, -2.44f, 3.94f, -4f, 6f, -4f)
                curveToRelative(1.86f, 0f, 3.41f, 1.28f, 3.86f, 3f)
                horizontalLineToRelative(10.14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10.14f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3f, -3.86f, 3f)
                curveToRelative(-2.06f, 0f, -6f, -1.56f, -6f, -4f)
                close()
                moveTo(14.28f, 21f)
                horizontalLineToRelative(-4.56f)
                lineToRelative(-0.5f, -2f)
                horizontalLineToRelative(-7.76f)
                lineToRelative(0.28f, 2.35f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(14.56f)
                curveToRelative(1.52f, 0f, 2.8f, -1.14f, 2.98f, -2.65f)
                lineToRelative(0.28f, -2.35f)
                horizontalLineToRelative(-7.76f)
                lineToRelative(-0.5f, 2f)
                close()
            }
        }.also { _LunchBox = it}

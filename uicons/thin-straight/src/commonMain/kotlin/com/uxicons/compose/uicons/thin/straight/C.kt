package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _C: ImageVector? = null

val Icons.Ts.C: ImageVector
    get() = _C ?: UXIcon(name = "C") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 24f)
                horizontalLineToRelative(-2f)
                curveToRelative(-5.24f, 0f, -9.5f, -4.26f, -9.5f, -9.5f)
                verticalLineToRelative(-5f)
                curveTo(2f, 4.26f, 6.26f, 0f, 11.5f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(3.63f, 0f, 6.89f, 2.02f, 8.51f, 5.28f)
                lineToRelative(-0.9f, 0.45f)
                curveToRelative(-1.45f, -2.91f, -4.37f, -4.72f, -7.62f, -4.72f)
                horizontalLineToRelative(-2f)
                curveTo(6.81f, 1f, 3f, 4.81f, 3f, 9.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(2f)
                curveToRelative(3.19f, 0f, 6.09f, -1.76f, 7.56f, -4.6f)
                lineToRelative(0.89f, 0.46f)
                curveToRelative(-1.64f, 3.17f, -4.88f, 5.14f, -8.44f, 5.14f)
                close()
            }
        }.also { _C = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Ss.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.78f, 14f)
                lineToRelative(9.96f, 10f)
                lineTo(3f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(1.78f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineTo(6.14f, 4.72f)
                curveTo(6.73f, 2.03f, 9.13f, 0f, 12f, 0f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.87f, -2.03f, 5.27f, -4.72f, 5.86f)
                lineToRelative(2.14f, 2.14f)
                horizontalLineToRelative(0.59f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(0.59f)
                lineToRelative(2.96f, 2.96f)
                close()
            }
        }.also { _UserSlash = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Background: ImageVector? = null

val Icons.Bs.Background: ImageVector
    get() = _Background ?: UXIcon(name = "Background") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.88f)
                lineTo(3f, 9.38f)
                lineTo(3f, 3.5f)
                close()
                moveTo(3f, 13.62f)
                lineTo(13.62f, 3f)
                horizontalLineToRelative(5.26f)
                lineTo(3f, 18.88f)
                verticalLineToRelative(-5.26f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-6.38f)
                lineToRelative(6.38f, -6.38f)
                verticalLineToRelative(6.38f)
                close()
                moveTo(21f, 10.38f)
                lineToRelative(-10.62f, 10.62f)
                lineTo(5.12f, 21f)
                lineTo(21f, 5.12f)
                verticalLineToRelative(5.26f)
                close()
            }
        }.also { _Background = it}

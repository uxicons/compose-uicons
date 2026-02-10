package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _User: ImageVector? = null

val Icons.Sr.User: ImageVector
    get() = _User ?: UXIcon(name = "User", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 128f)
                moveToRelative(-128f, 0f)
                arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, 256f, 0f)
                arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, -256f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 298.67f)
                curveToRelative(-105.99f, 0.12f, -191.88f, 86.01f, -192f, 192f)
                curveTo(64f, 502.45f, 73.55f, 512f, 85.33f, 512f)
                horizontalLineToRelative(341.33f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveTo(447.88f, 384.68f, 361.99f, 298.78f, 256f, 298.67f)
                close()
            }
        }.also { _User = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartUpsideDown: ImageVector? = null

val Icons.Sr.HeartUpsideDown: ImageVector
    get() = _HeartUpsideDown ?: UXIcon(name = "HeartUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.28f, 22.99f)
                curveToRelative(-1.21f, 0f, -2.39f, -0.33f, -3.44f, -0.99f)
                curveToRelative(-0.75f, -0.47f, -1.37f, -1.08f, -1.84f, -1.77f)
                curveToRelative(-0.47f, 0.69f, -1.09f, 1.3f, -1.84f, 1.77f)
                curveToRelative(-1.96f, 1.23f, -4.37f, 1.32f, -6.6f, 0.24f)
                curveToRelative(-1.0f, -0.48f, -1.84f, -1.21f, -2.44f, -2.11f)
                curveTo(-2.38f, 14.88f, 2.96f, 7.62f, 9.12f, 2.58f)
                curveToRelative(1.67f, -1.37f, 4.09f, -1.37f, 5.76f, 0f)
                curveToRelative(6.16f, 5.04f, 11.5f, 12.3f, 8.0f, 17.55f)
                curveToRelative(-0.6f, 0.9f, -1.44f, 1.63f, -2.44f, 2.11f)
                curveToRelative(-1.04f, 0.5f, -2.11f, 0.75f, -3.16f, 0.75f)
                close()
            }
        }.also { _HeartUpsideDown = it}

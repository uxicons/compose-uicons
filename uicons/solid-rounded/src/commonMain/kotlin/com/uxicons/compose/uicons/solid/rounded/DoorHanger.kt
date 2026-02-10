package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorHanger: ImageVector? = null

val Icons.Sr.DoorHanger: ImageVector
    get() = _DoorHanger ?: UXIcon(name = "DoorHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.49f, 0.02f)
                curveToRelative(-2.28f, 0.15f, -4.17f, 1.45f, -5.33f, 3.28f)
                curveToRelative(-1.02f, 1.6f, 0.23f, 3.7f, 2.13f, 3.7f)
                curveToRelative(0.85f, 0f, 1.59f, -0.47f, 2.09f, -1.17f)
                curveToRelative(0.36f, -0.51f, 0.96f, -0.83f, 1.63f, -0.83f)
                curveToRelative(1.22f, 0f, 2.18f, 1.08f, 1.97f, 2.34f)
                curveToRelative(-0.16f, 0.98f, -1.08f, 1.66f, -2.08f, 1.66f)
                horizontalLineToRelative(-2.89f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -4.03f, -3.42f, -7.28f, -7.51f, -6.98f)
                close()
            }
        }.also { _DoorHanger = it}

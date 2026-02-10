package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorHanger: ImageVector? = null

val Icons.Rs.DoorHanger: ImageVector
    get() = _DoorHanger ?: UXIcon(name = "DoorHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 24f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-0.56f, -0.03f, -0.93f, 0.48f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(0.01f, -3.83f, 3f, -7f, 7f, -7f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                close()
                moveTo(7f, 22f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-2.03f, 0f, -3.81f, 1.21f, -4.58f, 3f)
                horizontalLineToRelative(2.35f)
                curveToRelative(0.56f, -0.63f, 1.37f, -1f, 2.23f, -1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _DoorHanger = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartCrack: ImageVector? = null

val Icons.Ss.HeartCrack: ImageVector
    get() = _HeartCrack ?: UXIcon(name = "HeartCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 1f)
                curveToRelative(-1.65f, 0f, -3.17f, 0.67f, -4.32f, 1.77f)
                lineToRelative(2.73f, 2.73f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(4f, 4f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-4f, -4f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-2.86f, -2.86f)
                curveToRelative(-0.98f, -0.98f, -2.3f, -1.63f, -3.69f, -1.63f)
                curveToRelative(0f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveTo(2.92f, 1f, 0f, 4.14f, 0f, 8f)
                curveToRelative(0f, 6.92f, 10.96f, 14.6f, 11.43f, 14.92f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.47f, -0.32f, 11.43f, -8f, 11.43f, -14.92f)
                curveToRelative(0f, -3.86f, -2.92f, -7f, -6.5f, -7f)
                close()
            }
        }.also { _HeartCrack = it}

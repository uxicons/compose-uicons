package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampDesk: ImageVector? = null

val Icons.Bs.LampDesk: ImageVector
    get() = _LampDesk ?: UXIcon(name = "LampDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.46f, 5.85f)
                lineTo(15.99f, 0.86f)
                curveToRelative(-2.03f, -1.35f, -4.75f, -1.08f, -6.48f, 0.64f)
                curveToRelative(-1.46f, 1.46f, -1.88f, 3.65f, -1.15f, 5.51f)
                lineToRelative(-3.36f, 3.36f)
                verticalLineToRelative(10.62f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-9.38f)
                lineToRelative(1.97f, -1.97f)
                lineToRelative(3.87f, 5.81f)
                lineToRelative(3.05f, -3.05f)
                curveToRelative(0.43f, 0.36f, 0.99f, 0.59f, 1.61f, 0.59f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.61f, -0.22f, -1.17f, -0.59f, -1.61f)
                lineToRelative(3.05f, -3.05f)
                close()
                moveTo(11.36f, 6.32f)
                curveToRelative(-0.56f, -0.84f, -0.45f, -1.98f, 0.27f, -2.7f)
                curveToRelative(0.41f, -0.41f, 0.96f, -0.62f, 1.51f, -0.62f)
                curveToRelative(0.41f, 0f, 0.82f, 0.12f, 1.18f, 0.36f)
                lineToRelative(4.43f, 2.95f)
                lineToRelative(-4.44f, 4.44f)
                lineToRelative(-2.95f, -4.43f)
                close()
            }
        }.also { _LampDesk = it}

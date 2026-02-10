package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampDeskOn: ImageVector? = null

val Icons.Bs.LampDeskOn: ImageVector
    get() = _LampDeskOn ?: UXIcon(name = "LampDeskOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.41f, 8.9f)
                lineToRelative(3.06f, -3.06f)
                lineToRelative(-7.47f, -4.98f)
                curveToRelative(-2.03f, -1.35f, -4.76f, -1.08f, -6.48f, 0.64f)
                curveToRelative(-1.46f, 1.46f, -1.87f, 3.64f, -1.14f, 5.5f)
                lineToRelative(-3.37f, 3.37f)
                verticalLineToRelative(10.62f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.38f)
                lineToRelative(1.97f, -1.97f)
                lineToRelative(3.88f, 5.81f)
                lineToRelative(3.05f, -3.05f)
                curveToRelative(0.43f, 0.36f, 0.99f, 0.59f, 1.6f, 0.59f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.61f, -0.23f, -1.17f, -0.59f, -1.6f)
                close()
                moveTo(9.36f, 6.32f)
                curveToRelative(-0.56f, -0.84f, -0.45f, -1.98f, 0.27f, -2.7f)
                curveToRelative(0.72f, -0.72f, 1.85f, -0.83f, 2.7f, -0.27f)
                lineToRelative(4.43f, 2.95f)
                lineToRelative(-4.44f, 4.44f)
                lineToRelative(-2.95f, -4.43f)
                close()
                moveTo(20.56f, 12.44f)
                lineTo(23.06f, 14.94f)
                lineTo(20.94f, 17.06f)
                lineTo(18.44f, 14.56f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _LampDeskOn = it}

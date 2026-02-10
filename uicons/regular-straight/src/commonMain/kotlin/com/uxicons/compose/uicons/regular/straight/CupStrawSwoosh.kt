package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStrawSwoosh: ImageVector? = null

val Icons.Rs.CupStrawSwoosh: ImageVector
    get() = _CupStrawSwoosh ?: UXIcon(name = "CupStrawSwoosh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 5f)
                horizontalLineToRelative(-8.49f)
                lineToRelative(0.38f, -3f)
                horizontalLineToRelative(5.12f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(-0.63f, 5f)
                lineTo(1f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.61f)
                lineToRelative(1.69f, 14.35f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(9.43f)
                curveToRelative(1.52f, 0f, 2.8f, -1.14f, 2.98f, -2.65f)
                lineToRelative(1.69f, -14.35f)
                horizontalLineToRelative(1.61f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16.71f, 22f)
                lineTo(7.29f, 22f)
                curveToRelative(-0.51f, 0f, -0.93f, -0.38f, -0.99f, -0.88f)
                lineToRelative(-0.67f, -5.7f)
                curveToRelative(0.84f, -0.57f, 2.3f, -1.42f, 3.38f, -1.42f)
                curveToRelative(0.76f, 0f, 1.63f, 0.43f, 2.55f, 0.9f)
                curveToRelative(1.09f, 0.54f, 2.21f, 1.1f, 3.45f, 1.1f)
                curveToRelative(1.2f, 0f, 2.46f, -0.55f, 3.44f, -1.1f)
                lineToRelative(-0.73f, 6.22f)
                curveToRelative(-0.06f, 0.5f, -0.49f, 0.88f, -0.99f, 0.88f)
                close()
                moveTo(18.75f, 12.32f)
                curveToRelative(-0.69f, 0.52f, -2.48f, 1.68f, -3.75f, 1.68f)
                curveToRelative(-0.76f, 0f, -1.63f, -0.43f, -2.55f, -0.9f)
                curveToRelative(-1.09f, -0.54f, -2.21f, -1.1f, -3.45f, -1.1f)
                curveToRelative(-1.28f, 0f, -2.64f, 0.63f, -3.64f, 1.22f)
                lineToRelative(-0.73f, -6.22f)
                horizontalLineToRelative(14.75f)
                lineToRelative(-0.63f, 5.32f)
                close()
            }
        }.also { _CupStrawSwoosh = it}

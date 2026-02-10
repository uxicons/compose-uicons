package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsAndVenusBurst: ImageVector? = null

val Icons.Ss.MarsAndVenusBurst: ImageVector
    get() = _MarsAndVenusBurst ?: UXIcon(name = "MarsAndVenusBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 1f)
                horizontalLineToRelative(-5f)
                lineTo(17f, 3f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.83f, 3.83f)
                curveToRelative(-0.79f, -0.52f, -1.74f, -0.83f, -2.75f, -0.83f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.1f)
                curveToRelative(2.28f, -0.47f, 4f, -2.48f, 4f, -4.9f)
                curveToRelative(0f, -1.02f, -0.31f, -1.96f, -0.83f, -2.75f)
                lineToRelative(3.83f, -3.83f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(9.46f, 16.32f)
                lineToRelative(-2.46f, 2.68f)
                lineToRelative(-0.5f, -4f)
                lineToRelative(-5f, 1.5f)
                lineToRelative(2.5f, -5.5f)
                lineTo(-0.04f, 9.03f)
                lineToRelative(4.04f, -2.03f)
                lineTo(0.11f, 0.05f)
                lineTo(7f, 3.5f)
                lineTo(9.5f, 0f)
                lineToRelative(2f, 3f)
                lineToRelative(2f, -1.5f)
                lineToRelative(0.31f, 2.51f)
                curveToRelative(-3.78f, 0.1f, -6.81f, 3.19f, -6.81f, 6.99f)
                curveToRelative(0f, 2.13f, 0.95f, 4.03f, 2.46f, 5.32f)
                close()
            }
        }.also { _MarsAndVenusBurst = it}

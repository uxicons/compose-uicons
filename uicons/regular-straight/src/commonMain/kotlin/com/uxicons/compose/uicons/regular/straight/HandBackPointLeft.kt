package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointLeft: ImageVector? = null

val Icons.Rs.HandBackPointLeft: ImageVector
    get() = _HandBackPointLeft ?: UXIcon(name = "HandBackPointLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.88f, 1.88f)
                curveToRelative(-1.13f, -1.13f, -3.1f, -1.14f, -4.25f, 0.01f)
                lineToRelative(-4.05f, 4.12f)
                lineTo(3f, 6f)
                curveToRelative(-0.88f, 0f, -1.71f, 0.39f, -2.29f, 1.06f)
                curveTo(0.14f, 7.73f, -0.1f, 8.62f, 0.04f, 9.5f)
                curveToRelative(0.23f, 1.43f, 1.55f, 2.5f, 3.07f, 2.5f)
                horizontalLineToRelative(5.07f)
                lineToRelative(2f, 10f)
                horizontalLineToRelative(13.82f)
                lineTo(24f, 7f)
                lineTo(18.88f, 1.88f)
                close()
                moveTo(22f, 20f)
                lineTo(11.82f, 20f)
                lineToRelative(-2f, -10f)
                lineTo(3.11f, 10f)
                curveToRelative(-0.54f, 0f, -1.02f, -0.36f, -1.09f, -0.82f)
                curveToRelative(-0.05f, -0.3f, 0.03f, -0.59f, 0.22f, -0.82f)
                curveToRelative(0.19f, -0.22f, 0.47f, -0.35f, 0.76f, -0.35f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.61f)
                lineToRelative(2.66f, -2.71f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.38f, 1.41f, 0f)
                lineToRelative(4.54f, 4.54f)
                verticalLineToRelative(12.17f)
                close()
            }
        }.also { _HandBackPointLeft = it}

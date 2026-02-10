package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadVr: ImageVector? = null

val Icons.Ss.HeadVr: ImageVector
    get() = _HeadVr ?: UXIcon(name = "HeadVr") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                lineTo(15.5f, 13f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(7f)
                close()
                moveTo(10.03f, 9f)
                curveToRelative(0.25f, -2.8f, 2.61f, -5f, 5.47f, -5f)
                horizontalLineToRelative(3.94f)
                curveTo(16.99f, 1.04f, 13.3f, -0.43f, 9.45f, 0.11f)
                curveTo(4.79f, 0.75f, 1.03f, 4.41f, 0.18f, 9f)
                lineTo(10.03f, 9f)
                close()
                moveTo(15.5f, 15f)
                curveToRelative(-2.51f, 0f, -4.63f, -1.7f, -5.29f, -4f)
                lineTo(0.0f, 11f)
                curveToRelative(0f, 2.57f, 0.88f, 5.04f, 2.54f, 7.03f)
                curveToRelative(0.29f, 0.35f, 0.46f, 0.8f, 0.46f, 1.26f)
                verticalLineToRelative(4.71f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.45f, -3.39f)
                horizontalLineToRelative(-6.17f)
                close()
            }
        }.also { _HeadVr = it}

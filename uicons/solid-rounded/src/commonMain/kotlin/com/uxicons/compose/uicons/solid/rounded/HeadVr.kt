package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadVr: ImageVector? = null

val Icons.Sr.HeadVr: ImageVector
    get() = _HeadVr ?: UXIcon(name = "HeadVr") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(9.02f, 9f)
                curveToRelative(0.25f, -2.8f, 2.61f, -5f, 5.48f, -5f)
                horizontalLineToRelative(4.97f)
                curveTo(17.02f, 1.03f, 13.32f, -0.43f, 9.45f, 0.11f)
                curveTo(4.79f, 0.75f, 1.03f, 4.42f, 0.18f, 9f)
                lineTo(9.02f, 9f)
                close()
                moveTo(14.5f, 15f)
                curveToRelative(-2.51f, 0f, -4.64f, -1.69f, -5.29f, -4f)
                lineTo(0f, 11f)
                curveToRelative(0.0f, 2.42f, 0.79f, 4.75f, 2.26f, 6.67f)
                curveToRelative(0.48f, 0.62f, 0.74f, 1.46f, 0.74f, 2.35f)
                verticalLineToRelative(0.97f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(0.49f)
                curveToRelative(2.5f, 0f, 4.63f, -1.87f, 4.96f, -4.34f)
                lineToRelative(0.22f, -1.66f)
                horizontalLineToRelative(-7.17f)
                close()
            }
        }.also { _HeadVr = it}

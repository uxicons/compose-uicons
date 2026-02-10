package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Messages: ImageVector? = null

val Icons.Ts.Messages: ImageVector
    get() = _Messages ?: UXIcon(name = "Messages") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 4f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(15.85f)
                curveToRelative(0f, 0.61f, 0.33f, 1.17f, 0.87f, 1.45f)
                curveToRelative(0.24f, 0.13f, 0.51f, 0.2f, 0.78f, 0.2f)
                curveToRelative(0.32f, 0f, 0.64f, -0.09f, 0.91f, -0.28f)
                lineToRelative(3.44f, -2.29f)
                verticalLineToRelative(3.57f)
                horizontalLineToRelative(11.35f)
                lineToRelative(4.09f, 2.73f)
                curveToRelative(0.28f, 0.18f, 0.59f, 0.28f, 0.91f, 0.28f)
                curveToRelative(0.27f, 0f, 0.53f, -0.06f, 0.78f, -0.2f)
                curveToRelative(0.54f, -0.29f, 0.87f, -0.84f, 0.87f, -1.45f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.01f, 18.89f)
                curveToRelative(-0.2f, 0.14f, -0.45f, 0.15f, -0.67f, 0.03f)
                curveToRelative(-0.21f, -0.11f, -0.34f, -0.33f, -0.34f, -0.57f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                lineTo(6.35f, 16f)
                lineToRelative(-4.34f, 2.9f)
                close()
                moveTo(23f, 22.36f)
                curveToRelative(0f, 0.24f, -0.13f, 0.46f, -0.34f, 0.57f)
                curveToRelative(-0.21f, 0.12f, -0.46f, 0.1f, -0.67f, -0.03f)
                lineToRelative(-4.34f, -2.9f)
                lineTo(7f, 20f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11f)
                lineTo(18f, 5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(15.85f)
                close()
            }
        }.also { _Messages = it}

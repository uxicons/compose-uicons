package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Messages: ImageVector? = null

val Icons.Tr.Messages: ImageVector
    get() = _Messages ?: UXIcon(name = "Messages") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 4.0f)
                horizontalLineToRelative(-1.53f)
                curveTo(17.72f, 1.75f, 15.81f, -0.0f, 13.5f, -0.0f)
                lineTo(4.5f, -0.0f)
                curveTo(2.02f, -0.0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(13.85f)
                curveToRelative(0f, 0.61f, 0.33f, 1.17f, 0.87f, 1.45f)
                curveToRelative(0.24f, 0.13f, 0.51f, 0.2f, 0.78f, 0.2f)
                curveToRelative(0.32f, 0f, 0.64f, -0.09f, 0.91f, -0.28f)
                lineToRelative(3.52f, -2.35f)
                curveToRelative(0.41f, 2.06f, 2.23f, 3.62f, 4.41f, 3.62f)
                horizontalLineToRelative(6.85f)
                lineToRelative(4.09f, 2.73f)
                curveToRelative(0.28f, 0.18f, 0.59f, 0.28f, 0.91f, 0.28f)
                curveToRelative(0.27f, 0f, 0.53f, -0.06f, 0.78f, -0.2f)
                curveToRelative(0.54f, -0.29f, 0.87f, -0.84f, 0.87f, -1.45f)
                verticalLineToRelative(-13.85f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(2.01f, 18.89f)
                curveToRelative(-0.2f, 0.14f, -0.45f, 0.15f, -0.67f, 0.03f)
                curveToRelative(-0.21f, -0.11f, -0.34f, -0.33f, -0.34f, -0.57f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.94f)
                curveToRelative(-0.15f, 0f, -0.28f, 0.05f, -0.34f, 0.09f)
                lineToRelative(-4.21f, 2.81f)
                close()
                moveTo(23f, 22.35f)
                curveToRelative(0f, 0.24f, -0.13f, 0.46f, -0.34f, 0.57f)
                curveToRelative(-0.21f, 0.12f, -0.46f, 0.1f, -0.67f, -0.03f)
                lineToRelative(-4.21f, -2.81f)
                curveToRelative(-0.08f, -0.06f, -0.18f, -0.08f, -0.28f, -0.08f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.76f, 0f, -3.22f, -1.31f, -3.46f, -3f)
                horizontalLineToRelative(6.46f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13.85f)
                close()
            }
        }.also { _Messages = it}

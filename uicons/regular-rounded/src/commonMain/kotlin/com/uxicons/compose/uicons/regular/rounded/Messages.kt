package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Messages: ImageVector? = null

val Icons.Rr.Messages: ImageVector
    get() = _Messages ?: UXIcon(name = "Messages") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(12.85f)
                curveToRelative(0f, 0.79f, 0.43f, 1.52f, 1.13f, 1.89f)
                curveToRelative(0.32f, 0.17f, 0.67f, 0.26f, 1.01f, 0.26f)
                curveToRelative(0.42f, 0f, 0.83f, -0.12f, 1.19f, -0.36f)
                lineToRelative(2.95f, -1.97f)
                curveToRelative(0.69f, 1.94f, 2.54f, 3.32f, 4.71f, 3.32f)
                horizontalLineToRelative(5.7f)
                lineToRelative(3.96f, 2.64f)
                curveToRelative(0.36f, 0.24f, 0.77f, 0.36f, 1.19f, 0.36f)
                curveToRelative(0.35f, 0f, 0.7f, -0.09f, 1.01f, -0.26f)
                curveToRelative(0.7f, -0.37f, 1.13f, -1.1f, 1.13f, -1.89f)
                verticalLineToRelative(-12.85f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(2.23f, 17.98f)
                curveToRelative(-0.02f, 0.01f, -0.07f, 0.05f, -0.15f, 0.01f)
                curveToRelative(-0.08f, -0.04f, -0.08f, -0.11f, -0.08f, -0.13f)
                lineTo(2.0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.33f, 0f, -0.54f, 0.16f, -0.56f, 0.17f)
                lineToRelative(-4.21f, 2.8f)
                close()
                moveTo(22f, 21.86f)
                curveToRelative(0f, 0.02f, 0f, 0.09f, -0.08f, 0.13f)
                curveToRelative(-0.08f, 0.04f, -0.13f, 0.01f, -0.15f, -0.01f)
                lineToRelative(-4.21f, -2.81f)
                curveToRelative(-0.16f, -0.11f, -0.36f, -0.17f, -0.56f, -0.17f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.3f, 0f, -2.42f, -0.84f, -2.83f, -2f)
                horizontalLineToRelative(4.83f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(12.85f)
                close()
            }
        }.also { _Messages = it}

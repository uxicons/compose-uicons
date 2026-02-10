package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxOpen: ImageVector? = null

val Icons.Ss.BoxOpen: ImageVector
    get() = _BoxOpen ?: UXIcon(name = "BoxOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                lineTo(12f, 0f)
                lineToRelative(9f, 3f)
                lineToRelative(-8.99f, 3.0f)
                lineTo(3f, 2.99f)
                verticalLineToRelative(0.01f)
                close()
                moveTo(2f, 5f)
                lineTo(0.3f, 7.83f)
                curveToRelative(-0.67f, 1.11f, -0.13f, 2.56f, 1.1f, 2.96f)
                lineToRelative(5.08f, 1.69f)
                curveToRelative(0.89f, 0.3f, 1.86f, -0.07f, 2.35f, -0.87f)
                lineToRelative(2.17f, -3.62f)
                lineTo(2f, 5f)
                close()
                moveTo(13f, 8f)
                lineToRelative(2.17f, 3.62f)
                curveToRelative(0.48f, 0.8f, 1.46f, 1.17f, 2.35f, 0.87f)
                lineToRelative(5.12f, -1.71f)
                curveToRelative(1.21f, -0.4f, 1.74f, -1.82f, 1.08f, -2.92f)
                lineToRelative(-1.72f, -2.87f)
                lineToRelative(-9f, 3f)
                close()
                moveTo(10.54f, 12.65f)
                curveToRelative(-0.74f, 1.24f, -2.04f, 1.95f, -3.42f, 1.95f)
                curveToRelative(-0.42f, 0f, -0.86f, -0.07f, -1.28f, -0.21f)
                lineToRelative(-3.85f, -1.28f)
                verticalLineToRelative(7.89f)
                lineToRelative(9f, 3f)
                lineTo(11f, 11.89f)
                lineToRelative(-0.46f, 0.77f)
                close()
                moveTo(18.16f, 14.39f)
                curveToRelative(-0.42f, 0.14f, -0.85f, 0.21f, -1.28f, 0.21f)
                curveToRelative(-1.37f, 0f, -2.67f, -0.71f, -3.42f, -1.95f)
                lineToRelative(-0.46f, -0.77f)
                verticalLineToRelative(12.11f)
                lineToRelative(9f, -3f)
                verticalLineToRelative(-7.89f)
                lineToRelative(-3.85f, 1.28f)
                close()
            }
        }.also { _BoxOpen = it}

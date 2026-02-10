package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxOpenFull: ImageVector? = null

val Icons.Ss.BoxOpenFull: ImageVector
    get() = _BoxOpenFull ?: UXIcon(name = "BoxOpenFull") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9.4f)
                lineToRelative(-2.17f, 3.62f)
                curveToRelative(-0.48f, 0.8f, -1.46f, 1.17f, -2.35f, 0.87f)
                lineToRelative(-5.08f, -1.69f)
                curveToRelative(-1.23f, -0.41f, -1.76f, -1.85f, -1.1f, -2.96f)
                lineToRelative(1.7f, -2.83f)
                lineToRelative(9f, 3f)
                close()
                moveTo(13f, 9.4f)
                lineToRelative(2.17f, 3.62f)
                curveToRelative(0.48f, 0.8f, 1.46f, 1.17f, 2.35f, 0.87f)
                lineToRelative(5.12f, -1.71f)
                curveToRelative(1.21f, -0.4f, 1.74f, -1.82f, 1.08f, -2.92f)
                lineToRelative(-1.72f, -2.87f)
                lineToRelative(-9f, 3f)
                close()
                moveTo(10.54f, 14.05f)
                curveToRelative(-0.74f, 1.24f, -2.04f, 1.95f, -3.42f, 1.95f)
                curveToRelative(-0.42f, 0f, -0.86f, -0.07f, -1.28f, -0.21f)
                lineToRelative(-3.85f, -1.28f)
                verticalLineToRelative(6.49f)
                lineToRelative(9f, 3f)
                lineTo(11f, 13.29f)
                lineToRelative(-0.46f, 0.77f)
                close()
                moveTo(18.16f, 15.79f)
                curveToRelative(-0.42f, 0.14f, -0.85f, 0.21f, -1.28f, 0.21f)
                curveToRelative(-1.37f, 0f, -2.67f, -0.71f, -3.42f, -1.95f)
                lineToRelative(-0.46f, -0.77f)
                verticalLineToRelative(10.71f)
                lineToRelative(9f, -3f)
                verticalLineToRelative(-6.49f)
                lineToRelative(-3.85f, 1.28f)
                close()
                moveTo(12f, 7.63f)
                lineToRelative(6.39f, -2.13f)
                lineToRelative(-3.91f, -3.91f)
                lineToRelative(-5.15f, 5.15f)
                lineToRelative(2.68f, 0.89f)
                close()
                moveTo(7.2f, 6.03f)
                lineTo(11.86f, 1.37f)
                lineTo(10.53f, 0.04f)
                lineTo(5.2f, 5.36f)
                lineToRelative(2.0f, 0.67f)
                close()
            }
        }.also { _BoxOpenFull = it}

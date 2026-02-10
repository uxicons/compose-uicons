package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bahai: ImageVector? = null

val Icons.Sr.Bahai: ImageVector
    get() = _Bahai ?: UXIcon(name = "Bahai") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21.21f)
                lineToRelative(3.02f, 2.42f)
                curveToRelative(0.69f, 0.55f, 1.71f, 0.18f, 1.89f, -0.69f)
                lineToRelative(0.77f, -3.79f)
                lineToRelative(3.87f, -0.1f)
                curveToRelative(0.88f, -0.02f, 1.43f, -0.97f, 1.0f, -1.74f)
                lineToRelative(-1.85f, -3.4f)
                lineToRelative(2.9f, -2.56f)
                curveToRelative(0.66f, -0.58f, 0.47f, -1.66f, -0.35f, -1.98f)
                lineToRelative(-3.6f, -1.41f)
                lineToRelative(0.58f, -3.83f)
                curveToRelative(0.13f, -0.87f, -0.7f, -1.57f, -1.54f, -1.29f)
                lineToRelative(-3.67f, 1.24f)
                lineTo(13.0f, 0.78f)
                curveTo(12.54f, 0.03f, 11.46f, 0.03f, 11.0f, 0.78f)
                lineToRelative(-2.02f, 3.3f)
                lineToRelative(-3.67f, -1.24f)
                curveToRelative(-0.83f, -0.28f, -1.67f, 0.42f, -1.54f, 1.29f)
                lineToRelative(0.58f, 3.83f)
                lineToRelative(-3.6f, 1.41f)
                curveToRelative(-0.82f, 0.32f, -1.01f, 1.4f, -0.35f, 1.98f)
                lineToRelative(2.9f, 2.56f)
                lineToRelative(-1.85f, 3.4f)
                curveToRelative(-0.42f, 0.77f, 0.12f, 1.72f, 1.0f, 1.74f)
                lineToRelative(3.87f, 0.1f)
                lineToRelative(0.77f, 3.79f)
                curveToRelative(0.17f, 0.86f, 1.2f, 1.24f, 1.89f, 0.69f)
                lineToRelative(3.02f, -2.42f)
                close()
            }
        }.also { _Bahai = it}

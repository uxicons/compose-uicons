package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThreeLeafClover: ImageVector? = null

val Icons.Ss.ThreeLeafClover: ImageVector
    get() = _ThreeLeafClover ?: UXIcon(name = "ThreeLeafClover") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.15f, 3.14f)
                curveToRelative(0f, -1.75f, 1.34f, -3.14f, 3.0f, -3.14f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.9f, 0f, 1.74f, 0.42f, 2.31f, 1.16f)
                lineToRelative(0.69f, 0.88f)
                lineToRelative(0.68f, -0.88f)
                curveToRelative(0.57f, -0.73f, 1.42f, -1.16f, 2.31f, -1.16f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.65f, 0f, 3.0f, 1.39f, 3.0f, 3.14f)
                curveToRelative(0f, 3.86f, -6.15f, 8.36f, -6.15f, 8.36f)
                curveToRelative(0f, 0f, -5.85f, -4.5f, -5.85f, -8.36f)
                close()
                moveTo(22.84f, 13.32f)
                lineToRelative(-0.88f, 0.68f)
                lineToRelative(0.88f, 0.69f)
                curveToRelative(0.73f, 0.57f, 1.16f, 1.42f, 1.16f, 2.31f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 1.66f, -1.39f, 3f, -3.14f, 3f)
                curveToRelative(-2.61f, 0f, -6.13f, -2.74f, -7.95f, -4.51f)
                curveToRelative(0.02f, 1.76f, 0.53f, 4.85f, 3.6f, 6.65f)
                lineToRelative(-1.01f, 1.73f)
                curveToRelative(-3.86f, -2.26f, -4.54f, -6.07f, -4.58f, -8.29f)
                curveToRelative(-1.83f, 1.78f, -5.22f, 4.42f, -7.77f, 4.42f)
                curveToRelative(-1.75f, 0f, -3.14f, -1.34f, -3.14f, -3.0f)
                horizontalLineTo(0f)
                curveToRelative(0f, -0.9f, 0.42f, -1.74f, 1.16f, -2.32f)
                lineToRelative(0.88f, -0.69f)
                lineToRelative(-0.88f, -0.68f)
                curveToRelative(-0.73f, -0.57f, -1.16f, -1.42f, -1.16f, -2.31f)
                verticalLineToRelative(-0.0f)
                curveToRelative(0f, -1.65f, 1.39f, -3.0f, 3.14f, -3.0f)
                curveToRelative(3.85f, 0f, 8.84f, 6.48f, 8.86f, 6.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.01f, -0.01f, 5.0f, -6.5f, 8.86f, -6.5f)
                curveToRelative(1.75f, 0f, 3.14f, 1.34f, 3.14f, 3.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0f, 0.9f, -0.42f, 1.74f, -1.16f, 2.31f)
                close()
            }
        }.also { _ThreeLeafClover = it}

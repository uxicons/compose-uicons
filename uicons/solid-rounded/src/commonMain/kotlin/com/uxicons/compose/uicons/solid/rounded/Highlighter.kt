package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Sr.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.1f, 21.52f)
                curveToRelative(-0.73f, 0.31f, -1.53f, 0.48f, -2.34f, 0.48f)
                horizontalLineTo(3.41f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                verticalLineToRelative(-4.35f)
                curveToRelative(0f, -0.81f, 0.17f, -1.61f, 0.48f, -2.34f)
                lineToRelative(7.62f, 7.62f)
                close()
                moveTo(22.68f, 1.71f)
                lineToRelative(-0.39f, -0.39f)
                curveToRelative(-1.66f, -1.66f, -4.36f, -1.76f, -6.14f, -0.21f)
                lineTo(4.01f, 11.76f)
                curveToRelative(-0.15f, 0.13f, -0.28f, 0.27f, -0.42f, 0.41f)
                lineToRelative(8.23f, 8.23f)
                curveToRelative(0.14f, -0.13f, 0.29f, -0.27f, 0.42f, -0.42f)
                lineTo(22.9f, 7.84f)
                curveToRelative(1.54f, -1.78f, 1.45f, -4.47f, -0.22f, -6.13f)
                close()
            }
        }.also { _Highlighter = it}

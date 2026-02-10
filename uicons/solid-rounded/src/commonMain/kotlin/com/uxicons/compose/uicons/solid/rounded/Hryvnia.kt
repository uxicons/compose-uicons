package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hryvnia: ImageVector? = null

val Icons.Sr.Hryvnia: ImageVector
    get() = _Hryvnia ?: UXIcon(name = "Hryvnia") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.91f, 15f)
                horizontalLineToRelative(14.09f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                horizontalLineTo(12.18f)
                lineToRelative(5.33f, -2f)
                horizontalLineToRelative(3.49f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                horizontalLineToRelative(-0.89f)
                curveToRelative(1.69f, -2.35f, 0.85f, -6.03f, -1.72f, -7.36f)
                curveToRelative(-1.36f, -0.75f, -3.58f, -1.65f, -6.39f, -1.65f)
                curveTo(6.65f, 0f, 3.43f, 3.16f, 3.29f, 3.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.4f, 1.41f, 0.01f)
                curveTo(6.8f, 2.54f, 12.81f, 0.64f, 17.43f, 3.4f)
                curveToRelative(2.21f, 1.13f, 2.0f, 4.69f, -0.32f, 5.6f)
                horizontalLineTo(3f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 2.0f, 0f, 2f)
                horizontalLineTo(11.82f)
                lineToRelative(-5.33f, 2f)
                horizontalLineTo(3f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 2.0f, 0f, 2f)
                horizontalLineToRelative(0.93f)
                curveToRelative(-1.83f, 2.52f, -0.81f, 6.44f, 2.02f, 7.75f)
                curveToRelative(5.8f, 2.97f, 13.35f, -0.03f, 15.65f, -1.95f)
                curveToRelative(1.04f, -0.79f, -0.15f, -2.38f, -1.2f, -1.6f)
                curveToRelative(-1.88f, 1.57f, -8.6f, 4.31f, -13.57f, 1.75f)
                curveToRelative(-2.44f, -1.11f, -2.39f, -4.9f, 0.07f, -5.95f)
                close()
            }
        }.also { _Hryvnia = it}

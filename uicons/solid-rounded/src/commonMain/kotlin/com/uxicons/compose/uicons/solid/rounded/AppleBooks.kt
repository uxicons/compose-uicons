package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleBooks: ImageVector? = null

val Icons.Sr.AppleBooks: ImageVector
    get() = _AppleBooks ?: UXIcon(name = "AppleBooks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 24f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(20f)
                curveToRelative(0.42f, 0f, 0.79f, 0.26f, 0.94f, 0.66f)
                curveToRelative(0.14f, 0.39f, 0.03f, 0.83f, -0.29f, 1.1f)
                curveToRelative(-0.18f, 0.16f, -0.65f, 0.69f, -0.65f, 1.24f)
                curveToRelative(0f, 0.65f, 0.64f, 1.23f, 0.65f, 1.24f)
                curveToRelative(0.32f, 0.27f, 0.44f, 0.71f, 0.29f, 1.11f)
                reflectiveCurveToRelative(-0.52f, 0.66f, -0.94f, 0.66f)
                close()
                moveTo(4f, 11.01f)
                curveToRelative(0f, -3.31f, 2.49f, -6.0f, 5.5f, -6.0f)
                horizontalLineToRelative(1.49f)
                curveToRelative(-0.05f, -1.32f, -0.58f, -2.85f, -0.91f, -3.63f)
                curveToRelative(-0.2f, -0.47f, 0.01f, -1.01f, 0.45f, -1.25f)
                horizontalLineToRelative(0f)
                curveToRelative(0.52f, -0.28f, 1.17f, -0.07f, 1.4f, 0.48f)
                curveToRelative(0.32f, 0.77f, 0.82f, 2.15f, 0.97f, 3.31f)
                curveToRelative(0.15f, -0.84f, 0.5f, -1.91f, 1.26f, -2.67f)
                curveTo(15.02f, 0.4f, 16.31f, 0.09f, 17.14f, 0.0f)
                curveToRelative(0.52f, -0.05f, 0.93f, 0.4f, 0.85f, 0.92f)
                curveToRelative(-0.14f, 0.87f, -0.58f, 2.2f, -1.45f, 3.06f)
                curveToRelative(-0.58f, 0.57f, -1.29f, 0.87f, -1.95f, 1.03f)
                curveToRelative(2.98f, 0.05f, 5.42f, 2.71f, 5.42f, 6.0f)
                curveToRelative(0f, 3.31f, -2.44f, 6.0f, -5.46f, 6.0f)
                curveToRelative(-0.92f, 0f, -1.78f, -0.25f, -2.54f, -0.7f)
                curveToRelative(-0.76f, 0.44f, -1.63f, 0.7f, -2.54f, 0.7f)
                curveToRelative(-3.01f, 0f, -5.46f, -2.69f, -5.46f, -6.0f)
                close()
            }
        }.also { _AppleBooks = it}

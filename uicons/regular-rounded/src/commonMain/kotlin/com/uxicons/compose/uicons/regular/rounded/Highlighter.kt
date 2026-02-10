package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Rr.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.68f, 1.71f)
                lineToRelative(-0.39f, -0.39f)
                curveToRelative(-1.66f, -1.66f, -4.36f, -1.76f, -6.14f, -0.21f)
                lineTo(4.01f, 11.76f)
                curveToRelative(-1.27f, 1.14f, -2.01f, 2.77f, -2.01f, 4.48f)
                verticalLineToRelative(4.35f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.71f, -1.71f)
                horizontalLineTo(7.76f)
                curveToRelative(1.71f, 0f, 3.34f, -0.73f, 4.48f, -2.01f)
                lineTo(22.9f, 7.84f)
                curveToRelative(1.54f, -1.78f, 1.45f, -4.47f, -0.22f, -6.13f)
                close()
                moveTo(4f, 20f)
                verticalLineToRelative(-3.76f)
                curveToRelative(0f, -0.25f, 0.03f, -0.5f, 0.08f, -0.75f)
                lineToRelative(4.43f, 4.43f)
                curveToRelative(-0.24f, 0.05f, -0.49f, 0.08f, -0.75f, 0.08f)
                horizontalLineToRelative(-3.76f)
                close()
                moveTo(21.39f, 6.52f)
                lineToRelative(-10.65f, 12.14f)
                curveToRelative(-0.11f, 0.12f, -0.23f, 0.21f, -0.35f, 0.32f)
                lineToRelative(-5.38f, -5.38f)
                curveToRelative(0.1f, -0.12f, 0.2f, -0.24f, 0.31f, -0.34f)
                lineTo(17.47f, 2.61f)
                curveToRelative(0.99f, -0.86f, 2.48f, -0.81f, 3.41f, 0.12f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(0.92f, 0.92f, 0.98f, 2.42f, 0.12f, 3.4f)
                close()
            }
        }.also { _Highlighter = it}

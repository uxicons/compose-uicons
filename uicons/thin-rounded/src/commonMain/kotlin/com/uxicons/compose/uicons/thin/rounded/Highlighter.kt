package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Tr.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.78f, 1.63f)
                lineToRelative(-0.41f, -0.41f)
                curveToRelative(-1.54f, -1.54f, -4.04f, -1.63f, -5.69f, -0.2f)
                lineTo(3.92f, 12.21f)
                curveToRelative(-1.22f, 1.09f, -1.92f, 2.65f, -1.92f, 4.29f)
                verticalLineToRelative(4.79f)
                lineToRelative(-1.85f, 1.85f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(1.85f, -1.85f)
                horizontalLineTo(7.5f)
                curveToRelative(1.64f, 0f, 3.2f, -0.7f, 4.29f, -1.93f)
                lineTo(22.98f, 7.32f)
                curveToRelative(1.43f, -1.65f, 1.34f, -4.15f, -0.2f, -5.69f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.63f, 0.13f, -1.25f, 0.37f, -1.82f)
                lineToRelative(5.95f, 5.95f)
                curveToRelative(-0.57f, 0.24f, -1.19f, 0.37f, -1.82f, 0.37f)
                horizontalLineTo(3f)
                close()
                moveTo(22.22f, 6.66f)
                lineToRelative(-11.18f, 12.75f)
                curveToRelative(-0.24f, 0.27f, -0.52f, 0.51f, -0.82f, 0.72f)
                curveToRelative(-0.01f, -0.01f, -0.01f, -0.03f, -0.02f, -0.04f)
                lineTo(3.9f, 13.8f)
                curveToRelative(-0.01f, -0.01f, -0.03f, -0.01f, -0.04f, -0.02f)
                curveToRelative(0.21f, -0.29f, 0.45f, -0.57f, 0.72f, -0.81f)
                lineTo(17.34f, 1.78f)
                curveToRelative(1.25f, -1.09f, 3.15f, -1.02f, 4.33f, 0.15f)
                lineToRelative(0.41f, 0.41f)
                curveToRelative(1.17f, 1.17f, 1.24f, 3.07f, 0.15f, 4.33f)
                close()
            }
        }.also { _Highlighter = it}

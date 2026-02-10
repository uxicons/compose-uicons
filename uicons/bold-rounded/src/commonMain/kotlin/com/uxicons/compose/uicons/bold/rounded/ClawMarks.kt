package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClawMarks: ImageVector? = null

val Icons.Br.ClawMarks: ImageVector
    get() = _ClawMarks ?: UXIcon(name = "ClawMarks") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.53f, 23.76f)
            curveTo(14.71f, 16.42f, 7.29f, 9.01f, 0.26f, 1.56f)
            curveTo(-0.45f, 0.81f, 0.43f, -0.36f, 1.36f, 0.11f)
            curveToRelative(5.9f, 2.99f, 16.14f, 10.39f, 22.55f, 22.64f)
            curveToRelative(0.45f, 0.85f, -0.69f, 1.67f, -1.39f, 1.01f)
            close()
            moveTo(22.57f, 12.78f)
            curveToRelative(0.69f, 0.62f, 1.72f, -0.15f, 1.35f, -1.01f)
            curveTo(20.98f, 4.9f, 15.62f, 1.57f, 12.2f, 0.07f)
            curveToRelative(-0.86f, -0.38f, -1.59f, 0.71f, -0.96f, 1.41f)
            curveToRelative(3.59f, 3.98f, 7.37f, 7.74f, 11.33f, 11.3f)
            close()
            moveTo(0.99f, 9.14f)
            curveToRelative(-0.7f, -0.3f, -1.32f, 0.59f, -0.8f, 1.15f)
            curveToRelative(4.26f, 4.64f, 8.72f, 9.13f, 13.37f, 13.48f)
            curveToRelative(0.68f, 0.63f, 1.74f, -0.14f, 1.36f, -0.99f)
            curveTo(11.16f, 14.53f, 4.66f, 10.71f, 0.99f, 9.14f)
            close()
        }
    }.also { _ClawMarks = it }

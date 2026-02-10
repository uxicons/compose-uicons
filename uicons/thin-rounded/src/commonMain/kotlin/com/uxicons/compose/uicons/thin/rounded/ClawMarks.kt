package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClawMarks: ImageVector? = null

val Icons.Tr.ClawMarks: ImageVector
    get() = _ClawMarks ?: UXIcon(name = "ClawMarks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.34f, 23.89f)
                curveTo(18.0f, 18.85f, 4.93f, 5.78f, 0.11f, 0.67f)
                curveTo(-0.21f, 0.33f, 0.25f, -0.22f, 0.62f, 0.08f)
                curveToRelative(4.88f, 3.92f, 16.88f, 14.92f, 23.31f, 23.29f)
                curveToRelative(0.29f, 0.38f, -0.24f, 0.84f, -0.59f, 0.52f)
                close()
                moveTo(23.23f, 12.71f)
                curveToRelative(0.3f, 0.26f, 0.73f, -0.1f, 0.52f, -0.43f)
                curveTo(21.56f, 8.89f, 16f, 3.5f, 11.52f, 0.05f)
                curveToRelative(-0.31f, -0.24f, -0.68f, 0.22f, -0.42f, 0.52f)
                curveToRelative(2.06f, 2.39f, 9.74f, 10.07f, 12.13f, 12.14f)
                close()
                moveTo(0.49f, 9.01f)
                curveToRelative(-0.32f, -0.19f, -0.66f, 0.23f, -0.4f, 0.5f)
                curveToRelative(2.51f, 2.71f, 11.63f, 11.83f, 14.36f, 14.37f)
                curveToRelative(0.28f, 0.26f, 0.69f, -0.09f, 0.5f, -0.41f)
                curveTo(12.35f, 19.2f, 2.83f, 10.4f, 0.49f, 9.01f)
                close()
            }
        }.also { _ClawMarks = it}

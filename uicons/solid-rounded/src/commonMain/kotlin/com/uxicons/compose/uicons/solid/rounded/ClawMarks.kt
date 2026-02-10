package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClawMarks: ImageVector? = null

val Icons.Sr.ClawMarks: ImageVector
    get() = _ClawMarks ?: UXIcon(name = "ClawMarks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.93f, 0.12f)
                curveToRelative(6.57f, 4.38f, 16.07f, 12.38f, 22.96f, 22.95f)
                curveToRelative(0.39f, 0.59f, -0.37f, 1.26f, -0.88f, 0.77f)
                curveTo(14.99f, 16.28f, 7.39f, 8.66f, 0.17f, 1.0f)
                curveTo(-0.32f, 0.48f, 0.34f, -0.28f, 0.93f, 0.12f)
                close()
                moveTo(11.17f, 1.06f)
                curveToRelative(3.83f, 4.44f, 7.33f, 7.94f, 11.77f, 11.77f)
                curveToRelative(0.56f, 0.48f, 1.35f, -0.19f, 0.96f, -0.81f)
                curveTo(19.84f, 5.75f, 15.03f, 2.03f, 11.96f, 0.1f)
                curveToRelative(-0.62f, -0.39f, -1.27f, 0.41f, -0.79f, 0.96f)
                close()
                moveTo(0.16f, 9.93f)
                curveToRelative(4.43f, 4.79f, 9.08f, 9.43f, 13.91f, 13.91f)
                curveToRelative(0.49f, 0.45f, 1.23f, -0.16f, 0.88f, -0.73f)
                curveTo(10.34f, 15.58f, 5f, 11.5f, 0.87f, 9.05f)
                curveToRelative(-0.57f, -0.34f, -1.16f, 0.4f, -0.71f, 0.89f)
                close()
            }
        }.also { _ClawMarks = it}

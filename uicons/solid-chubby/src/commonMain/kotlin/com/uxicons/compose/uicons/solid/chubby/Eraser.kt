package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eraser: ImageVector? = null

val Icons.Sc.Eraser: ImageVector
    get() = _Eraser ?: UXIcon(name = "Eraser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.12f, 16.71f)
                lineToRelative(-10.83f, -10.83f)
                curveToRelative(1.68f, -1.62f, 3.29f, -2.98f, 4.41f, -3.88f)
                curveToRelative(1.7f, -1.37f, 4.11f, -1.4f, 5.86f, -0.06f)
                curveToRelative(0.96f, 0.73f, 1.77f, 1.43f, 2.42f, 2.08f)
                curveToRelative(0.65f, 0.65f, 1.35f, 1.46f, 2.08f, 2.42f)
                curveToRelative(1.34f, 1.75f, 1.31f, 4.16f, -0.06f, 5.86f)
                curveToRelative(-0.9f, 1.11f, -2.26f, 2.73f, -3.88f, 4.41f)
                close()
                moveTo(21.34f, 19.51f)
                curveToRelative(-0.04f, 0.0f, -3.12f, 0.34f, -6.63f, 0.45f)
                curveToRelative(0.64f, -0.56f, 1.31f, -1.17f, 2.0f, -1.84f)
                lineToRelative(-10.83f, -10.83f)
                curveToRelative(-1.6f, 1.66f, -2.94f, 3.25f, -3.83f, 4.36f)
                curveToRelative(-1.37f, 1.7f, -1.4f, 4.11f, -0.06f, 5.86f)
                curveToRelative(0.73f, 0.96f, 1.44f, 1.77f, 2.08f, 2.42f)
                curveToRelative(0.65f, 0.65f, 1.46f, 1.35f, 2.42f, 2.08f)
                curveToRelative(0.86f, 0.66f, 1.88f, 0.99f, 2.9f, 0.99f)
                curveToRelative(0.07f, -0.01f, 3.04f, 0f, 3.11f, -0.0f)
                curveToRelative(4.47f, 0f, 8.97f, -0.49f, 9.16f, -0.51f)
                curveToRelative(0.82f, -0.09f, 1.42f, -0.83f, 1.33f, -1.65f)
                curveToRelative(-0.09f, -0.82f, -0.83f, -1.42f, -1.66f, -1.33f)
                close()
            }
        }.also { _Eraser = it}

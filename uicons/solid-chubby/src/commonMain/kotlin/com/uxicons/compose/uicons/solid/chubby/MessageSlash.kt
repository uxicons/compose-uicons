package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSlash: ImageVector? = null

val Icons.Sc.MessageSlash: ImageVector
    get() = _MessageSlash ?: UXIcon(name = "MessageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.42f, 7.37f)
                lineToRelative(13.5f, 13.5f)
                curveToRelative(-0.36f, 0.04f, -0.72f, 0.08f, -1.07f, 0.11f)
                curveToRelative(-0.77f, 0.85f, -2.16f, 1.98f, -2.77f, 2.02f)
                curveToRelative(-0.76f, 0.04f, -2.07f, -1.12f, -2.93f, -2.02f)
                curveToRelative(-2.54f, -0.2f, -5.22f, -0.81f, -5.34f, -0.83f)
                curveToRelative(-0.33f, -0.08f, -0.6f, -0.32f, -0.72f, -0.64f)
                curveToRelative(-0.01f, -0.03f, -1.1f, -3.11f, -1.1f, -7.46f)
                curveToRelative(0f, -1.81f, 0.2f, -3.42f, 0.42f, -4.68f)
                close()
                moveTo(22.56f, 20.44f)
                lineTo(21.07f, 18.95f)
                curveToRelative(0.31f, -1.07f, 0.93f, -3.63f, 0.93f, -6.91f)
                curveToRelative(0f, -4.17f, -1.04f, -7.31f, -1.09f, -7.44f)
                curveToRelative(-0.11f, -0.32f, -0.38f, -0.57f, -0.7f, -0.65f)
                curveToRelative(-0.16f, -0.04f, -3.87f, -0.95f, -8.21f, -0.95f)
                curveToRelative(-2.5f, 0f, -4.78f, 0.3f, -6.31f, 0.57f)
                lineToRelative(-2.13f, -2.13f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(19.0f, 19.0f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                close()
            }
        }.also { _MessageSlash = it}

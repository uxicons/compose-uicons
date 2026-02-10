package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckDouble: ImageVector? = null

val Icons.Rr.CheckDouble: ImageVector
    get() = _CheckDouble ?: UXIcon(name = "CheckDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.28f, 7.7f)
                curveToRelative(-0.39f, -0.4f, -0.38f, -1.03f, 0.02f, -1.41f)
                curveToRelative(0.4f, -0.39f, 1.03f, -0.38f, 1.41f, 0.02f)
                lineToRelative(4.09f, 4.21f)
                curveToRelative(0.31f, 0.31f, 0.73f, 0.48f, 1.18f, 0.49f)
                curveToRelative(0.45f, 0f, 0.86f, -0.17f, 1.18f, -0.49f)
                lineTo(18.29f, 1.3f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.41f, -0.01f)
                curveToRelative(0.39f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                lineToRelative(-9.13f, 9.22f)
                curveToRelative(-0.7f, 0.7f, -1.62f, 1.08f, -2.6f, 1.08f)
                curveToRelative(-0.98f, -0.0f, -1.9f, -0.39f, -2.6f, -1.08f)
                lineTo(1.28f, 7.7f)
                close()
                moveTo(23.71f, 7.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-13.09f, 13.12f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.42f, 0.59f)
                curveToRelative(-0.54f, 0f, -1.04f, -0.21f, -1.42f, -0.6f)
                lineTo(1.7f, 15.78f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.01f, 1.41f)
                lineToRelative(4.66f, 4.61f)
                curveToRelative(0.76f, 0.76f, 1.76f, 1.18f, 2.83f, 1.18f)
                curveToRelative(1.07f, 0f, 2.08f, -0.42f, 2.84f, -1.17f)
                lineToRelative(13.09f, -13.12f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.0f, -1.41f)
                close()
            }
        }.also { _CheckDouble = it}

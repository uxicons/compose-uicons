package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _A: ImageVector? = null

val Icons.Rr.A: ImageVector
    get() = _A ?: UXIcon(name = "A") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.93f, 22.63f)
                lineTo(16.14f, 2.81f)
                curveToRelative(-1.29f, -3.72f, -7f, -3.72f, -8.29f, 0f)
                lineTo(0.07f, 22.63f)
                curveToRelative(-0.2f, 0.51f, 0.05f, 1.09f, 0.56f, 1.3f)
                curveToRelative(0.52f, 0.2f, 1.09f, -0.05f, 1.3f, -0.56f)
                lineToRelative(2.5f, -6.37f)
                horizontalLineToRelative(15.14f)
                lineToRelative(2.5f, 6.37f)
                curveToRelative(0.2f, 0.52f, 0.8f, 0.77f, 1.3f, 0.56f)
                curveToRelative(0.51f, -0.2f, 0.77f, -0.78f, 0.56f, -1.3f)
                close()
                moveTo(5.22f, 15f)
                lineTo(9.72f, 3.54f)
                curveToRelative(0.92f, -2.1f, 3.64f, -2.1f, 4.57f, 0f)
                lineToRelative(4.5f, 11.46f)
                horizontalLineTo(5.22f)
                close()
            }
        }.also { _A = it}

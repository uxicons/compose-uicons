package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalf: ImageVector? = null

val Icons.Bs.HeartHalf: ImageVector
    get() = _HeartHalf ?: UXIcon(name = "HeartHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 23.91f)
                lineToRelative(-2.42f, -1.51f)
                curveTo(7.26f, 19.76f, 0f, 14.45f, 0f, 8.51f)
                curveTo(-0.08f, 6.47f, 0.65f, 4.47f, 2.01f, 3.06f)
                curveTo(3.29f, 1.73f, 5.06f, 1f, 7.01f, 1f)
                curveToRelative(2.46f, 0.05f, 4.69f, 1.39f, 5.89f, 3.49f)
                curveToRelative(0.25f, 0.38f, 1.1f, 1.83f, 1.1f, 4f)
                verticalLineToRelative(15.41f)
                close()
                moveTo(6.98f, 4f)
                curveToRelative(-1.11f, 0f, -2.09f, 0.4f, -2.81f, 1.14f)
                curveToRelative(-0.79f, 0.82f, -1.22f, 2.03f, -1.17f, 3.31f)
                curveToRelative(0f, 2.89f, 2.95f, 6.53f, 8f, 10f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -1.45f, -0.69f, -2.49f, -0.69f, -2.49f)
                curveToRelative(-0.67f, -1.21f, -1.94f, -1.98f, -3.33f, -2.01f)
                close()
            }
        }.also { _HeartHalf = it}

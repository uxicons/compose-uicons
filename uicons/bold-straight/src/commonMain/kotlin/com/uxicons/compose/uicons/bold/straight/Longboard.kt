package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Longboard: ImageVector? = null

val Icons.Bs.Longboard: ImageVector
    get() = _Longboard ?: UXIcon(name = "Longboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 3.57f)
                curveToRelative(0f, -2.03f, -1.53f, -3.57f, -3.56f, -3.57f)
                curveToRelative(-2.05f, 0f, -4.25f, 0.19f, -6.89f, 1.88f)
                lineToRelative(-1.78f, -1.78f)
                lineToRelative(-3f, 3f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(-1.96f, 1.97f, -3.74f, 4.06f, -5.38f, 6.29f)
                lineToRelative(-1.46f, -1.46f)
                lineToRelative(-3f, 3f)
                lineToRelative(2.03f, 2.03f)
                curveToRelative(-0.82f, 1.3f, -1.63f, 2.73f, -2.38f, 4.1f)
                lineToRelative(5.33f, 5.33f)
                curveToRelative(1.38f, -0.74f, 2.8f, -1.55f, 4.1f, -2.38f)
                lineToRelative(2.03f, 2.03f)
                lineToRelative(3f, -3f)
                lineToRelative(-1.46f, -1.46f)
                curveToRelative(2.23f, -1.64f, 4.32f, -3.42f, 6.29f, -5.38f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(3f, -3f)
                lineToRelative(-1.78f, -1.78f)
                curveToRelative(1.69f, -2.63f, 1.88f, -4.83f, 1.88f, -6.88f)
                close()
                moveTo(5.95f, 20.19f)
                lineTo(3.81f, 18.05f)
                curveToRelative(2.47f, -4.31f, 5.34f, -8.08f, 8.75f, -11.49f)
                curveToRelative(3.3f, -3.3f, 5.43f, -3.56f, 7.87f, -3.56f)
                curveToRelative(0.36f, 0f, 0.56f, 0.21f, 0.56f, 0.56f)
                curveToRelative(0f, 2.44f, -0.26f, 4.58f, -3.56f, 7.87f)
                curveToRelative(-3.41f, 3.41f, -7.18f, 6.28f, -11.49f, 8.75f)
                close()
            }
        }.also { _Longboard = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wrap: ImageVector? = null

val Icons.Ss.Wrap: ImageVector
    get() = _Wrap ?: UXIcon(name = "Wrap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.13f, 7.63f)
                curveToRelative(0.68f, -4.35f, 4.4f, -7.63f, 8.87f, -7.63f)
                curveToRelative(4.65f, 0f, 8.49f, 3.55f, 8.95f, 8.08f)
                curveToRelative(-0.76f, 0.09f, -1.89f, 0.28f, -3.23f, 0.68f)
                curveToRelative(-0.47f, -1.04f, -1.51f, -1.77f, -2.72f, -1.77f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.4f, 0.09f, 0.78f, 0.23f, 1.12f)
                curveToRelative(-0.71f, -0.52f, -1.45f, -0.98f, -2.22f, -1.36f)
                curveToRelative(0.1f, -2.03f, 1.4f, -3.73f, 3.21f, -4.42f)
                curveToRelative(-0.64f, -0.81f, -1.62f, -1.34f, -2.73f, -1.34f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.39f, 0.08f, 0.76f, 0.2f, 1.11f)
                curveToRelative(-1.65f, -0.54f, -3.13f, -0.83f, -4.08f, -0.97f)
                close()
                moveTo(5.81f, 24f)
                horizontalLineToRelative(14.12f)
                lineToRelative(0.99f, -13.92f)
                curveToRelative(-3.06f, 0.36f, -11.69f, 2.42f, -15.11f, 13.92f)
                close()
                moveTo(10.75f, 12.52f)
                curveToRelative(-2.64f, -1.82f, -5.98f, -2.58f, -7.7f, -2.86f)
                lineToRelative(1.06f, 13.11f)
                curveToRelative(1.56f, -4.82f, 4.03f, -8.06f, 6.64f, -10.25f)
                close()
            }
        }.also { _Wrap = it}

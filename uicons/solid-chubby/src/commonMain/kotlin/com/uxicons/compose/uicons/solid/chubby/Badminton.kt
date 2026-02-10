package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Badminton: ImageVector? = null

val Icons.Sc.Badminton: ImageVector
    get() = _Badminton ?: UXIcon(name = "Badminton") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.56f, 3.42f)
                curveToRelative(-1.63f, -1.63f, -3.23f, -2.42f, -4.89f, -2.42f)
                curveToRelative(-1.91f, 0f, -3.86f, 1.03f, -5.98f, 3.15f)
                curveToRelative(-3.53f, 3.53f, -4.09f, 6.66f, -1.72f, 9.75f)
                lineToRelative(-1.94f, 1.94f)
                curveToRelative(-0.28f, -0.02f, -0.54f, 0.02f, -0.76f, 0.08f)
                curveToRelative(-0.74f, 0.2f, -1.53f, 0.74f, -2.49f, 1.7f)
                curveToRelative(-0.71f, 0.71f, -2.89f, 2.89f, -1.09f, 4.69f)
                curveToRelative(0.46f, 0.46f, 0.99f, 0.69f, 1.58f, 0.69f)
                curveToRelative(0.91f, 0f, 1.87f, -0.55f, 3.1f, -1.79f)
                curveToRelative(0.53f, -0.53f, 1.87f, -1.87f, 1.78f, -3.26f)
                lineToRelative(1.93f, -1.93f)
                curveToRelative(1.25f, 0.97f, 2.47f, 1.43f, 3.77f, 1.43f)
                curveToRelative(1.9f, 0f, 3.85f, -1.03f, 5.98f, -3.16f)
                curveToRelative(3.95f, -3.96f, 4.18f, -7.42f, 0.73f, -10.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.96f, 21.22f)
                curveToRelative(-0.26f, -0.89f, -0.61f, -1.57f, -0.97f, -2.09f)
                curveToRelative(-0.15f, -1.91f, -1.42f, -2.12f, -1.99f, -2.12f)
                curveToRelative(-0.44f, 0f, -1.83f, 0.16f, -1.99f, 2.13f)
                curveToRelative(-0.36f, 0.52f, -0.71f, 1.2f, -0.97f, 2.09f)
                curveToRelative(-0.13f, 0.46f, 0.07f, 0.94f, 0.49f, 1.17f)
                curveToRelative(0.12f, 0.06f, 0.97f, 0.62f, 2.45f, 0.62f)
                curveToRelative(1.51f, 0f, 2.36f, -0.55f, 2.48f, -0.61f)
                curveToRelative(0.42f, -0.22f, 0.63f, -0.71f, 0.5f, -1.17f)
                close()
            }
        }.also { _Badminton = it}

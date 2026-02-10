package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pacifier: ImageVector? = null

val Icons.Ss.Pacifier: ImageVector
    get() = _Pacifier ?: UXIcon(name = "Pacifier") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                curveToRelative(-3.82f, 0f, -7.55f, -1.43f, -10.69f, -3.73f)
                curveToRelative(1.33f, -1.11f, 2.96f, -1.68f, 4.53f, -2.24f)
                curveToRelative(1.64f, -0.58f, 3.19f, -1.12f, 4.31f, -2.23f)
                curveToRelative(2.46f, -2.46f, 2.46f, -6.48f, 0f, -8.94f)
                curveToRelative(-2.47f, -2.46f, -6.48f, -2.46f, -8.94f, 0f)
                curveToRelative(-1.11f, 1.11f, -1.66f, 2.67f, -2.23f, 4.31f)
                curveToRelative(-0.55f, 1.58f, -1.13f, 3.2f, -2.24f, 4.53f)
                curveToRelative(-2.31f, -3.14f, -3.73f, -6.87f, -3.73f, -10.69f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 3.38f, 1.0f, 6.7f, 2.71f, 9.67f)
                curveToRelative(-3.26f, 0.71f, -5.71f, 3.61f, -5.71f, 7.08f)
                curveToRelative(0f, 4.0f, 3.25f, 7.25f, 7.25f, 7.25f)
                curveToRelative(3.47f, 0f, 6.37f, -2.45f, 7.08f, -5.71f)
                curveToRelative(2.97f, 1.71f, 6.29f, 2.71f, 9.67f, 2.71f)
                close()
                moveTo(7.25f, 22f)
                curveToRelative(-2.9f, 0f, -5.25f, -2.35f, -5.25f, -5.25f)
                curveToRelative(0f, -2.78f, 2.17f, -5.03f, 4.91f, -5.21f)
                curveToRelative(1.52f, 2.14f, 3.42f, 4.04f, 5.56f, 5.56f)
                curveToRelative(-0.18f, 2.73f, -2.44f, 4.91f, -5.21f, 4.91f)
                close()
            }
        }.also { _Pacifier = it}

package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Rc.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.86f, 6.77f)
                curveToRelative(-0.2f, -1.36f, -1.35f, -4.12f, -1.48f, -4.43f)
                curveToRelative(-0.13f, -0.31f, -0.4f, -0.53f, -0.73f, -0.59f)
                curveToRelative(-0.33f, -0.06f, -0.67f, 0.04f, -0.9f, 0.28f)
                lineTo(1.29f, 20.57f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f)
                curveToRelative(0.56f, 0.54f, 1.22f, 0.19f, 1.42f, -0.0f)
                lineToRelative(4.52f, -4.55f)
                curveToRelative(0.33f, 0.48f, 0.81f, 1.01f, 1.48f, 1.47f)
                curveToRelative(1.34f, 0.92f, 2.56f, 1.11f, 3.36f, 1.11f)
                curveToRelative(0.54f, 0f, 0.89f, -0.09f, 0.97f, -0.11f)
                curveToRelative(0.04f, -0.01f, 3.1f, -1.19f, 6.76f, -5.28f)
                curveToRelative(3.36f, -3.76f, 3.39f, -5.62f, 3.06f, -7.85f)
                close()
                moveTo(18.31f, 13.29f)
                curveToRelative(-2.9f, 3.23f, -5.42f, 4.5f, -5.86f, 4.7f)
                curveToRelative(-0.26f, 0.05f, -1.31f, 0.15f, -2.62f, -0.74f)
                curveToRelative(-0.61f, -0.41f, -0.96f, -0.91f, -1.16f, -1.27f)
                lineTo(20.09f, 4.51f)
                curveToRelative(0.34f, 0.91f, 0.71f, 1.97f, 0.79f, 2.55f)
                horizontalLineToRelative(0f)
                curveToRelative(0.24f, 1.6f, 0.43f, 2.87f, -2.57f, 6.22f)
                close()
            }
        }.also { _Knife = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dagger: ImageVector? = null

val Icons.Bs.Dagger: ImageVector
    get() = _Dagger ?: UXIcon(name = "Dagger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.39f, 9.27f)
                lineToRelative(-2.77f, -2.77f)
                lineToRelative(4.34f, -4.34f)
                lineTo(21.84f, 0.03f)
                lineToRelative(-4.34f, 4.34f)
                lineToRelative(-2.76f, -2.76f)
                curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
                horizontalLineToRelative(-1.84f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.84f)
                curveToRelative(0.67f, 0f, 1.3f, 0.26f, 1.77f, 0.73f)
                lineToRelative(0.39f, 0.39f)
                lineToRelative(-5.75f, 5.75f)
                curveToRelative(-2.5f, 2.5f, -4.58f, 5.37f, -6.17f, 8.53f)
                lineToRelative(-0.9f, 1.78f)
                lineToRelative(-0.12f, 0.35f)
                curveToRelative(-0.21f, 0.95f, 0.08f, 1.93f, 0.77f, 2.62f)
                curveToRelative(0.54f, 0.54f, 1.26f, 0.83f, 2.0f, 0.83f)
                curveToRelative(0.2f, 0f, 0.41f, -0.02f, 0.62f, -0.07f)
                lineToRelative(2.14f, -1.02f)
                curveToRelative(3.16f, -1.59f, 6.03f, -3.67f, 8.53f, -6.17f)
                lineToRelative(5.75f, -5.75f)
                lineToRelative(0.4f, 0.4f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.11f, 0.73f, 1.77f)
                verticalLineToRelative(1.84f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
                close()
                moveTo(12.0f, 14.62f)
                curveToRelative(-2.27f, 2.27f, -4.89f, 4.16f, -7.76f, 5.61f)
                lineToRelative(-0.95f, 0.48f)
                lineToRelative(0.48f, -0.95f)
                curveToRelative(1.45f, -2.88f, 3.33f, -5.49f, 5.61f, -7.76f)
                lineToRelative(5.75f, -5.75f)
                lineToRelative(2.62f, 2.62f)
                lineToRelative(-5.75f, 5.75f)
                close()
            }
        }.also { _Dagger = it}

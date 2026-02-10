package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bath: ImageVector? = null

val Icons.Ss.Bath: ImageVector
    get() = _Bath ?: UXIcon(name = "Bath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 15.87f)
                lineToRelative(0.48f, -3.87f)
                horizontalLineTo(2f)
                verticalLineToRelative(-7.67f)
                curveToRelative(0f, -1.29f, 1.05f, -2.33f, 2.33f, -2.33f)
                curveToRelative(0.73f, 0f, 1.43f, 0.35f, 1.87f, 0.93f)
                lineToRelative(0.26f, 0.34f)
                lineToRelative(-0.57f, 3.29f)
                lineToRelative(1.07f, 1.67f)
                lineToRelative(5.78f, -4.33f)
                lineToRelative(-1.07f, -1.67f)
                lineToRelative(-3.61f, -0.16f)
                lineToRelative(-0.26f, -0.34f)
                curveToRelative(-0.81f, -1.08f, -2.11f, -1.73f, -3.47f, -1.73f)
                curveTo(1.94f, 0f, 0f, 1.94f, 0f, 4.33f)
                verticalLineToRelative(7.67f)
                lineToRelative(0.52f, 3.87f)
                curveToRelative(0.26f, 2.05f, 1.26f, 3.84f, 2.73f, 5.12f)
                lineToRelative(-0.74f, 3.01f)
                horizontalLineToRelative(2.06f)
                lineToRelative(0.45f, -1.83f)
                curveToRelative(1.08f, 0.53f, 2.3f, 0.83f, 3.58f, 0.83f)
                horizontalLineToRelative(6.83f)
                curveToRelative(1.27f, 0f, 2.48f, -0.3f, 3.57f, -0.83f)
                lineToRelative(0.45f, 1.83f)
                horizontalLineToRelative(2.06f)
                lineToRelative(-0.74f, -3.0f)
                curveToRelative(1.47f, -1.28f, 2.48f, -3.07f, 2.74f, -5.13f)
                close()
            }
        }.also { _Bath = it}

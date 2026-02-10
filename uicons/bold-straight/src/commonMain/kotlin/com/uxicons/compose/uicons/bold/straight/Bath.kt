package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bath: ImageVector? = null

val Icons.Bs.Bath: ImageVector
    get() = _Bath ?: UXIcon(name = "Bath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.48f, 16.13f)
                lineToRelative(0.52f, -4.13f)
                lineTo(3f, 12f)
                verticalLineToRelative(-7.17f)
                curveToRelative(0f, -1.01f, 0.82f, -1.83f, 1.83f, -1.83f)
                curveToRelative(0.57f, 0f, 1.12f, 0.27f, 1.47f, 0.73f)
                lineToRelative(0.54f, 0.72f)
                lineToRelative(-0.46f, 2.61f)
                lineToRelative(1.07f, 1.67f)
                lineToRelative(5.78f, -4.33f)
                lineToRelative(-1.07f, -1.67f)
                lineToRelative(-2.96f, -0.13f)
                lineToRelative(-0.5f, -0.67f)
                curveToRelative(-0.91f, -1.21f, -2.35f, -1.93f, -3.87f, -1.93f)
                curveTo(2.17f, 0f, 0f, 2.17f, 0f, 4.83f)
                verticalLineToRelative(7.17f)
                lineToRelative(0.55f, 4.13f)
                curveToRelative(0.23f, 1.88f, 1.13f, 3.54f, 2.43f, 4.76f)
                lineToRelative(-0.78f, 3.11f)
                horizontalLineToRelative(3.09f)
                lineToRelative(0.37f, -1.47f)
                curveToRelative(0.84f, 0.3f, 1.73f, 0.47f, 2.67f, 0.47f)
                horizontalLineToRelative(7.37f)
                curveToRelative(0.92f, 0f, 1.81f, -0.16f, 2.64f, -0.46f)
                lineToRelative(0.36f, 1.46f)
                horizontalLineToRelative(3.09f)
                lineToRelative(-0.77f, -3.09f)
                curveToRelative(1.31f, -1.22f, 2.22f, -2.88f, 2.46f, -4.78f)
                close()
                moveTo(8.33f, 20f)
                curveToRelative(-2.44f, 0f, -4.5f, -1.82f, -4.81f, -4.24f)
                lineToRelative(-0.1f, -0.76f)
                horizontalLineToRelative(17.17f)
                lineToRelative(-0.1f, 0.76f)
                curveToRelative(-0.3f, 2.42f, -2.37f, 4.24f, -4.81f, 4.24f)
                horizontalLineToRelative(-7.37f)
                close()
            }
        }.also { _Bath = it}

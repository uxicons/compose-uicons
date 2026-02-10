package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HairClipper: ImageVector? = null

val Icons.Bs.HairClipper: ImageVector
    get() = _HairClipper ?: UXIcon(name = "HairClipper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.56f, 12.44f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.35f, -2.35f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(21.81f, 23.93f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.9f, 0.52f, -1.91f, 0.8f, -2.93f, 0.8f)
                curveToRelative(-1.35f, 0f, -2.7f, -0.46f, -3.79f, -1.39f)
                curveToRelative(-2.87f, -2.44f, -6.85f, -5.92f, -9.64f, -8.71f)
                curveToRelative(-0.01f, -0.01f, -2.57f, -2.57f, -2.57f, -2.57f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(9.24f, 0.05f)
                reflectiveCurveToRelative(2.56f, 2.56f, 2.56f, 2.56f)
                curveToRelative(2.78f, 2.79f, 6.26f, 6.78f, 8.71f, 9.65f)
                curveToRelative(1.63f, 1.91f, 1.79f, 4.62f, 0.58f, 6.72f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(9.66f, 9.66f)
                curveToRelative(1.01f, -1.01f, 1.27f, -2.5f, 0.78f, -3.75f)
                lineToRelative(-4.54f, 4.54f)
                curveToRelative(1.26f, 0.49f, 2.74f, 0.23f, 3.75f, -0.78f)
                close()
                moveTo(18.08f, 18.08f)
                curveToRelative(1.05f, -1.05f, 1.11f, -2.75f, 0.16f, -3.87f)
                curveToRelative(-1.36f, -1.6f, -3.05f, -3.54f, -4.75f, -5.43f)
                curveToRelative(-0.28f, 1.1f, -0.84f, 2.15f, -1.7f, 3.01f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.86f, 0.86f, -1.91f, 1.42f, -3.01f, 1.7f)
                curveToRelative(1.89f, 1.7f, 3.83f, 3.39f, 5.43f, 4.75f)
                curveToRelative(1.12f, 0.96f, 2.83f, 0.89f, 3.87f, -0.16f)
                close()
            }
        }.also { _HairClipper = it}

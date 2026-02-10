package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassStart: ImageVector? = null

val Icons.Sr.HourglassStart: ImageVector
    get() = _HourglassStart ?: UXIcon(name = "HourglassStart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.96f, 4.58f)
                curveToRelative(0.17f, -1.13f, -0.17f, -2.28f, -0.92f, -3.15f)
                curveToRelative(-0.77f, -0.89f, -1.87f, -1.4f, -3.04f, -1.4f)
                lineTo(7.0f, 0.03f)
                curveToRelative(-1.17f, 0f, -2.28f, 0.51f, -3.04f, 1.4f)
                curveToRelative(-0.75f, 0.87f, -1.09f, 2.02f, -0.92f, 3.16f)
                curveToRelative(0.41f, 2.7f, 1.89f, 5.2f, 4.4f, 7.44f)
                curveToRelative(-2.52f, 2.25f, -4.0f, 4.75f, -4.4f, 7.44f)
                curveToRelative(-0.17f, 1.13f, 0.17f, 2.28f, 0.92f, 3.16f)
                curveToRelative(0.76f, 0.89f, 1.87f, 1.4f, 3.04f, 1.4f)
                horizontalLineToRelative(9.99f)
                curveToRelative(1.17f, 0f, 2.28f, -0.51f, 3.04f, -1.4f)
                curveToRelative(0.75f, -0.87f, 1.09f, -2.02f, 0.92f, -3.15f)
                curveToRelative(-0.4f, -2.69f, -1.88f, -5.19f, -4.41f, -7.45f)
                curveToRelative(2.52f, -2.26f, 4.0f, -4.76f, 4.41f, -7.45f)
                close()
                moveTo(17.93f, 4.4f)
                curveToRelative(-0.98f, 2.43f, -3.05f, 4.42f, -4.61f, 5.66f)
                lineToRelative(-0.69f, 0.55f)
                curveToRelative(-0.36f, 0.29f, -0.88f, 0.29f, -1.25f, 0.0f)
                lineToRelative(-0.7f, -0.56f)
                curveToRelative(-1.56f, -1.23f, -3.62f, -3.21f, -4.61f, -5.66f)
                curveToRelative(-0.12f, -0.31f, -0.09f, -0.66f, 0.1f, -0.93f)
                curveToRelative(0.19f, -0.28f, 0.5f, -0.44f, 0.83f, -0.44f)
                horizontalLineToRelative(10f)
                curveToRelative(0.33f, 0f, 0.64f, 0.16f, 0.83f, 0.44f)
                curveToRelative(0.19f, 0.28f, 0.22f, 0.63f, 0.1f, 0.93f)
                close()
                moveTo(12.07f, 8.5f)
                lineToRelative(-0.07f, 0.06f)
                lineToRelative(-0.08f, -0.07f)
                curveToRelative(-1.05f, -0.83f, -2.35f, -2.03f, -3.27f, -3.46f)
                horizontalLineToRelative(6.7f)
                curveToRelative(-0.92f, 1.43f, -2.23f, 2.64f, -3.28f, 3.47f)
                close()
            }
        }.also { _HourglassStart = it}

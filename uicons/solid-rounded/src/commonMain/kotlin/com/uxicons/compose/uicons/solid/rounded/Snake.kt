package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snake: ImageVector? = null

val Icons.Sr.Snake: ImageVector
    get() = _Snake ?: UXIcon(name = "Snake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23.27f, 6.33f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-1.75f, 1.75f, -4.61f, 1.75f, -6.36f, 0f)
                lineToRelative(-1.24f, -1.24f)
                curveToRelative(-0.6f, 0.07f, -1.25f, 0.28f, -1.25f, 0.98f)
                curveToRelative(0f, 1.01f, 0.5f, 3.01f, 2.36f, 5.26f)
                curveToRelative(1.19f, 1.44f, 3.02f, 3.32f, 4.64f, 4.25f)
                lineToRelative(-7.49f, -0.01f)
                curveToRelative(-2.11f, -2.06f, -4.51f, -6.15f, -4.51f, -9.5f)
                curveToRelative(0f, -2.19f, 0.98f, -3.54f, 1.81f, -4.29f)
                curveToRelative(1.42f, -1.29f, 3.55f, -1.63f, 4.57f, -1.71f)
                curveToRelative(0.72f, -0.05f, 1.03f, -0.49f, 1.03f, -0.49f)
                curveTo(16.2f, 0.31f, 17.2f, -0.01f, 18.18f, 0.02f)
                curveToRelative(1.32f, -0.1f, 2.68f, 0.37f, 3.67f, 1.36f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
                close()
                moveTo(20.5f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(2.43f, 15.62f)
                lineToRelative(1.2f, 1.38f)
                horizontalLineToRelative(6.4f)
                lineToRelative(-3.75f, -4.58f)
                curveToRelative(-0.51f, -0.61f, -2.05f, -1.09f, -3.28f, -1.39f)
                curveToRelative(-0.82f, -0.2f, -1.6f, 0.49f, -1.49f, 1.33f)
                curveToRelative(0.15f, 1.18f, 0.43f, 2.66f, 0.92f, 3.26f)
                close()
            }
        }.also { _Snake = it}

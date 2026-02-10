package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhone: ImageVector? = null

val Icons.Rr.SquarePhone: ImageVector
    get() = _SquarePhone ?: UXIcon(name = "SquarePhone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(17.28f, 13.12f)
                curveToRelative(-0.81f, -0.77f, -2.19f, -0.78f, -3.01f, -0.02f)
                lineToRelative(-0.27f, 0.19f)
                curveToRelative(-1.54f, -0.69f, -2.53f, -1.68f, -3.27f, -3.28f)
                lineToRelative(0.18f, -0.26f)
                curveToRelative(0.78f, -0.85f, 0.77f, -2.17f, -0.02f, -3.01f)
                curveToRelative(0f, 0f, -1.21f, -1.54f, -1.24f, -1.56f)
                curveToRelative(-0.84f, -0.84f, -2.33f, -0.8f, -3.1f, -0.04f)
                curveToRelative(0f, 0f, -0.88f, 0.8f, -0.89f, 0.81f)
                curveToRelative(-0.75f, 0.75f, -1.16f, 1.75f, -1.16f, 2.83f)
                curveToRelative(0f, 4.61f, 6.12f, 10.73f, 10.73f, 10.73f)
                curveToRelative(1.08f, 0f, 2.09f, -0.41f, 2.87f, -1.2f)
                lineToRelative(0.74f, -0.82f)
                curveToRelative(0.86f, -0.86f, 0.86f, -2.27f, 0f, -3.13f)
                curveToRelative(-0.03f, -0.03f, -1.56f, -1.24f, -1.56f, -1.24f)
                close()
                moveTo(17.39f, 16.11f)
                lineTo(16.65f, 16.93f)
                curveToRelative(-0.37f, 0.37f, -0.87f, 0.57f, -1.42f, 0.57f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-3.32f, 0f, -8.73f, -4.88f, -8.73f, -8.73f)
                curveToRelative(0f, -0.54f, 0.2f, -1.04f, 0.56f, -1.4f)
                lineToRelative(0.87f, -0.79f)
                curveToRelative(0.1f, -0.1f, 0.18f, -0.09f, 0.28f, -0.02f)
                lineToRelative(1.14f, 1.45f)
                curveToRelative(0.21f, 0.16f, 0.14f, 0.37f, -0.03f, 0.53f)
                lineToRelative(-0.55f, 0.78f)
                curveToRelative(-0.19f, 0.28f, -0.23f, 0.63f, -0.11f, 0.95f)
                curveToRelative(1.05f, 2.6f, 2.57f, 4.13f, 5.11f, 5.09f)
                curveToRelative(0.31f, 0.12f, 0.66f, 0.08f, 0.93f, -0.12f)
                lineToRelative(0.78f, -0.55f)
                curveToRelative(0.18f, -0.18f, 0.35f, -0.27f, 0.53f, -0.03f)
                lineToRelative(1.44f, 1.14f)
                curveToRelative(0.06f, 0.09f, 0.05f, 0.21f, -0.06f, 0.32f)
                close()
            }
        }.also { _SquarePhone = it}

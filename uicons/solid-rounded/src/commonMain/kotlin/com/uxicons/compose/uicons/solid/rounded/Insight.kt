package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Insight: ImageVector? = null

val Icons.Sr.Insight: ImageVector
    get() = _Insight ?: UXIcon(name = "Insight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 20f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(21f, 9f)
                curveToRelative(0f, 2.59f, -1.12f, 5.05f, -3.07f, 6.76f)
                curveToRelative(-0.74f, 0.65f, -1.27f, 1.41f, -1.59f, 2.24f)
                lineTo(7.56f, 18f)
                curveToRelative(-0.36f, -0.88f, -0.93f, -1.7f, -1.7f, -2.42f)
                curveToRelative(-2.15f, -2.0f, -3.17f, -4.83f, -2.79f, -7.76f)
                curveTo(3.59f, 3.78f, 6.9f, 0.52f, 10.96f, 0.06f)
                curveToRelative(2.57f, -0.29f, 5.13f, 0.52f, 7.04f, 2.23f)
                curveToRelative(1.91f, 1.71f, 3.01f, 4.15f, 3.01f, 6.71f)
                close()
                moveTo(16f, 7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(0.09f, -0.39f, 0.15f, -0.75f, 0.15f, -0.97f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.23f, 0.05f, 0.58f, 0.14f, 0.97f)
                horizontalLineToRelative(-0.67f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.65f)
                curveToRelative(-0.4f, -0.1f, -0.77f, -0.15f, -1f, -0.15f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.23f, 0f, 0.6f, -0.06f, 1f, -0.15f)
                verticalLineToRelative(0.65f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.87f)
                curveToRelative(-0.6f, 0.14f, -1.37f, 0.27f, -1.6f, 0.27f)
                curveToRelative(-0.77f, 0f, -1.4f, -0.63f, -1.4f, -1.4f)
                curveToRelative(0f, -0.77f, 0.63f, -1.4f, 1.4f, -1.4f)
                curveToRelative(0.23f, 0f, 1.0f, 0.13f, 1.6f, 0.27f)
                verticalLineToRelative(-0.87f)
                close()
            }
        }.also { _Insight = it}

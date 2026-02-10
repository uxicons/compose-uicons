package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheeseAlt: ImageVector? = null

val Icons.Tr.CheeseAlt: ImageVector
    get() = _CheeseAlt ?: UXIcon(name = "CheeseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 16f)
                curveToRelative(0f, 1.69f, 0.31f, 3.4f, 0.94f, 5.09f)
                curveToRelative(0.64f, 1.74f, 2.33f, 2.91f, 4.21f, 2.91f)
                horizontalLineToRelative(14.35f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineTo(11.08f)
                curveToRelative(0f, -1.78f, -0.87f, -3.46f, -2.32f, -4.49f)
                lineTo(13.52f, 0.81f)
                curveToRelative(-1.67f, -1.12f, -3.84f, -1.08f, -5.4f, 0.09f)
                curveTo(2.67f, 4.98f, 1.05f, 10.53f, 0.98f, 10.77f)
                curveTo(0.98f, 10.78f, 0f, 13f, 0f, 16f)
                close()
                moveTo(21.78f, 8f)
                horizontalLineTo(5.15f)
                curveToRelative(-0.77f, 0f, -1.5f, 0.19f, -2.14f, 0.54f)
                curveToRelative(0.99f, -1.93f, 2.77f, -4.63f, 5.72f, -6.83f)
                curveToRelative(1.22f, -0.92f, 2.93f, -0.94f, 4.24f, -0.07f)
                lineToRelative(8.15f, 5.78f)
                curveToRelative(0.25f, 0.17f, 0.47f, 0.37f, 0.67f, 0.59f)
                close()
                moveTo(1f, 16f)
                curveToRelative(0f, -1.57f, 0.29f, -3.17f, 0.87f, -4.75f)
                curveToRelative(0.49f, -1.35f, 1.81f, -2.25f, 3.27f, -2.25f)
                horizontalLineTo(22.49f)
                curveToRelative(0.33f, 0.63f, 0.51f, 1.35f, 0.51f, 2.08f)
                verticalLineToRelative(8.42f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineTo(5.15f)
                curveToRelative(-1.46f, 0f, -2.78f, -0.9f, -3.27f, -2.25f)
                curveToRelative(-0.58f, -1.58f, -0.88f, -3.18f, -0.88f, -4.75f)
                close()
            }
        }.also { _CheeseAlt = it}

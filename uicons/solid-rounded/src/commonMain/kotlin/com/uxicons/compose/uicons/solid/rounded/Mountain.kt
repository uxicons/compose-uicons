package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Sr.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.74f, 6.92f)
                lineToRelative(2.78f, -5.42f)
                curveToRelative(0.49f, -0.93f, 1.44f, -1.5f, 2.48f, -1.5f)
                reflectiveCurveToRelative(1.99f, 0.57f, 2.48f, 1.49f)
                lineToRelative(2.98f, 5.79f)
                lineToRelative(-2.65f, 4.61f)
                lineToRelative(-0.95f, -1.56f)
                curveToRelative(-0.18f, -0.3f, -0.5f, -0.48f, -0.85f, -0.48f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.34f, 0f, -0.67f, 0.18f, -0.85f, 0.47f)
                lineToRelative(-1.62f, 2.71f)
                lineToRelative(-3.8f, -6.11f)
                close()
                moveTo(23.62f, 19.29f)
                lineToRelative(-5.08f, -9.89f)
                lineToRelative(-2.1f, 3.65f)
                curveToRelative(-0.34f, 0.59f, -0.95f, 0.94f, -1.62f, 0.94f)
                curveToRelative(-0.69f, -0.04f, -1.28f, -0.34f, -1.63f, -0.91f)
                lineToRelative(-0.2f, -0.33f)
                lineToRelative(-0.83f, 1.32f)
                curveToRelative(-0.36f, 0.58f, -0.98f, 0.92f, -1.66f, 0.92f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.68f, 0f, -1.3f, -0.34f, -1.66f, -0.92f)
                lineToRelative(-3.17f, -5.09f)
                lineTo(0.38f, 19.29f)
                curveToRelative(-0.54f, 1.02f, -0.5f, 2.21f, 0.09f, 3.19f)
                curveToRelative(0.59f, 0.98f, 1.63f, 1.57f, 2.77f, 1.57f)
                horizontalLineToRelative(17.52f)
                curveToRelative(1.14f, 0f, 2.18f, -0.59f, 2.77f, -1.57f)
                curveToRelative(0.59f, -0.99f, 0.63f, -2.18f, 0.09f, -3.19f)
                close()
            }
        }.also { _Mountain = it}

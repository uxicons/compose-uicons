package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CustomizeEdit: ImageVector? = null

val Icons.Sr.CustomizeEdit: ImageVector
    get() = _CustomizeEdit ?: UXIcon(name = "CustomizeEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.01f, 13.65f)
                curveToRelative(0.16f, 1.78f, -1.24f, 3.27f, -2.99f, 3.27f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.68f, 0f, -1.16f, -0.66f, -0.96f, -1.31f)
                curveToRelative(0.5f, -1.61f, 1.94f, -4.18f, 4.25f, -4.63f)
                curveToRelative(1.75f, -0.34f, 3.54f, 0.88f, 3.7f, 2.66f)
                close()
                moveTo(23.3f, 0.71f)
                curveToRelative(-0.94f, -0.94f, -2.47f, -0.94f, -3.41f, -0.0f)
                curveToRelative(-0.03f, 0.03f, -5.28f, 5.81f, -7.69f, 8.48f)
                curveToRelative(0.65f, 0.17f, 1.28f, 0.46f, 1.83f, 0.88f)
                curveToRelative(0.69f, 0.52f, 1.21f, 1.22f, 1.54f, 1.98f)
                lineToRelative(7.73f, -7.92f)
                curveToRelative(0.94f, -0.94f, 0.94f, -2.47f, 0.0f, -3.41f)
                close()
                moveTo(15.99f, 14.47f)
                curveToRelative(-0.12f, 1.05f, -0.56f, 2.04f, -1.28f, 2.83f)
                curveToRelative(-0.94f, 1.03f, -2.29f, 1.62f, -3.69f, 1.62f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.95f, 0f, -1.86f, -0.46f, -2.42f, -1.22f)
                curveToRelative(-0.56f, -0.77f, -0.73f, -1.77f, -0.45f, -2.68f)
                curveToRelative(0.71f, -2.28f, 2.54f, -5.1f, 5.37f, -5.87f)
                lineToRelative(2.87f, -3.16f)
                curveToRelative(1.09f, -1.2f, 1.98f, -2.18f, 2.71f, -2.99f)
                lineTo(5f, 3f)
                curveTo(2.24f, 3f, 0f, 5.24f, 0f, 8f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9.67f)
                lineToRelative(-5.01f, 5.14f)
                close()
            }
        }.also { _CustomizeEdit = it}

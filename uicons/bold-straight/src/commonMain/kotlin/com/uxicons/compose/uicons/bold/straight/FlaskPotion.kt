package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlaskPotion: ImageVector? = null

val Icons.Bs.FlaskPotion: ImageVector
    get() = _FlaskPotion ?: UXIcon(name = "FlaskPotion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 6.05f)
                verticalLineToRelative(-3.06f)
                horizontalLineToRelative(2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.06f)
                curveTo(2.77f, 7.91f, 0f, 11.99f, 0f, 16.5f)
                curveToRelative(0f, 2.52f, 0.84f, 4.91f, 2.44f, 6.93f)
                lineToRelative(0.45f, 0.57f)
                horizontalLineToRelative(18.23f)
                lineToRelative(0.45f, -0.57f)
                curveToRelative(1.59f, -2.02f, 2.44f, -4.41f, 2.44f, -6.93f)
                curveToRelative(0f, -4.51f, -2.77f, -8.59f, -7f, -10.45f)
                close()
                moveTo(8.98f, 8.5f)
                lineToRelative(1.02f, -0.34f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5.16f)
                lineToRelative(1.02f, 0.34f)
                curveToRelative(2.28f, 0.77f, 4.09f, 2.36f, 5.1f, 4.34f)
                curveToRelative(-1.01f, 0.51f, -2.6f, 1.16f, -4.12f, 1.16f)
                curveToRelative(-1.43f, 0f, -2.34f, -0.4f, -3.39f, -0.87f)
                curveToRelative(-1.19f, -0.53f, -2.54f, -1.13f, -4.61f, -1.13f)
                curveToRelative(-1.49f, 0f, -2.95f, 0.41f, -4.14f, 0.88f)
                curveToRelative(1.0f, -2.0f, 2.82f, -3.6f, 5.12f, -4.38f)
                close()
                moveTo(19.62f, 21f)
                lineTo(4.38f, 21f)
                curveToRelative(-0.88f, -1.31f, -1.35f, -2.81f, -1.38f, -4.36f)
                curveToRelative(0.63f, -0.38f, 2.88f, -1.64f, 5.0f, -1.64f)
                curveToRelative(1.43f, 0f, 2.34f, 0.4f, 3.39f, 0.87f)
                curveToRelative(1.19f, 0.53f, 2.54f, 1.13f, 4.61f, 1.13f)
                curveToRelative(1.86f, 0f, 3.67f, -0.64f, 4.97f, -1.24f)
                curveToRelative(0.02f, 0.24f, 0.03f, 0.49f, 0.03f, 0.74f)
                curveToRelative(0f, 1.6f, -0.47f, 3.15f, -1.38f, 4.5f)
                close()
            }
        }.also { _FlaskPotion = it}

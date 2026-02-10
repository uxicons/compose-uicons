package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaBox: ImageVector? = null

val Icons.Bs.PizzaBox: ImageVector
    get() = _PizzaBox ?: UXIcon(name = "PizzaBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.28f, 10.9f)
                lineToRelative(-4.26f, 2.02f)
                verticalLineToRelative(-3.86f)
                curveToRelative(1.69f, 0.2f, 3.19f, 0.87f, 4.26f, 1.84f)
                close()
                moveTo(5.5f, 12.46f)
                curveToRelative(-0.32f, 0.63f, -0.51f, 1.32f, -0.51f, 2.04f)
                curveToRelative(0f, 0.7f, 0.18f, 1.38f, 0.48f, 2.0f)
                lineToRelative(4.22f, -2.0f)
                close()
                moveTo(14.34f, 14.51f)
                lineTo(18.5f, 16.52f)
                curveToRelative(0.32f, -0.63f, 0.5f, -1.31f, 0.5f, -2.02f)
                curveToRelative(0f, -0.7f, -0.17f, -1.36f, -0.47f, -1.97f)
                lineToRelative(-4.18f, 1.98f)
                close()
                moveTo(13.02f, 19.93f)
                curveToRelative(1.67f, -0.19f, 3.15f, -0.85f, 4.22f, -1.8f)
                lineToRelative(-4.22f, -2.04f)
                verticalLineToRelative(3.84f)
                close()
                moveTo(11.02f, 12.9f)
                verticalLineToRelative(-3.85f)
                curveToRelative(-1.68f, 0.19f, -3.17f, 0.84f, -4.25f, 1.79f)
                close()
                moveTo(11.02f, 19.94f)
                verticalLineToRelative(-3.86f)
                lineToRelative(-4.28f, 2.03f)
                curveToRelative(1.08f, 0.97f, 2.58f, 1.64f, 4.28f, 1.82f)
                close()
                moveTo(24f, 2.85f)
                lineTo(22.05f, 6.75f)
                lineTo(24f, 20.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-24f)
                lineToRelative(0.01f, -3.71f)
                lineToRelative(1.93f, -13.54f)
                lineToRelative(-1.95f, -3.9f)
                verticalLineToRelative(-2.85f)
                horizontalLineToRelative(24f)
                close()
                moveTo(3.43f, 3f)
                lineTo(4.43f, 5f)
                horizontalLineToRelative(15.15f)
                lineToRelative(1f, -2f)
                close()
                moveTo(21f, 20.61f)
                lineTo(19.2f, 8f)
                horizontalLineToRelative(-14.4f)
                lineToRelative(-1.8f, 12.61f)
                verticalLineToRelative(0.39f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _PizzaBox = it}

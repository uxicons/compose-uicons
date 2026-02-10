package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlaskPotion: ImageVector? = null

val Icons.Ts.FlaskPotion: ImageVector
    get() = _FlaskPotion ?: UXIcon(name = "FlaskPotion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 6.58f)
                lineTo(17f, 1f)
                horizontalLineToRelative(2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.54f)
                curveTo(2.74f, 8.4f, 0f, 12.45f, 0f, 16.93f)
                curveToRelative(0f, 2.5f, 0.84f, 4.88f, 2.42f, 6.88f)
                lineToRelative(0.15f, 0.19f)
                horizontalLineToRelative(18.85f)
                lineToRelative(0.15f, -0.19f)
                curveToRelative(1.58f, -2.01f, 2.42f, -4.39f, 2.42f, -6.88f)
                curveToRelative(0f, -4.42f, -2.74f, -8.45f, -7f, -10.35f)
                close()
                moveTo(7.69f, 7.33f)
                lineToRelative(0.31f, -0.13f)
                lineTo(8f, 1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6.24f)
                lineToRelative(0.31f, 0.13f)
                curveToRelative(3.15f, 1.31f, 5.44f, 3.86f, 6.31f, 6.85f)
                curveToRelative(-0.56f, 0.34f, -3.12f, 1.78f, -5.87f, 1.78f)
                curveToRelative(-1.83f, 0f, -3.15f, -0.47f, -4.55f, -0.97f)
                curveToRelative(-1.41f, -0.51f, -2.88f, -1.03f, -4.88f, -1.03f)
                curveToRelative(-2.47f, 0f, -5.0f, 1.3f, -6.27f, 2.06f)
                curveToRelative(0.34f, -3.83f, 2.87f, -7.2f, 6.65f, -8.73f)
                close()
                moveTo(20.94f, 23f)
                lineTo(3.06f, 23f)
                curveToRelative(-1.28f, -1.7f, -1.99f, -3.67f, -2.06f, -5.74f)
                curveToRelative(0.8f, -0.52f, 3.66f, -2.26f, 6.3f, -2.26f)
                curveToRelative(1.83f, 0f, 3.15f, 0.47f, 4.55f, 0.97f)
                curveToRelative(1.41f, 0.51f, 2.88f, 1.03f, 4.88f, 1.03f)
                curveToRelative(2.7f, 0f, 5.16f, -1.22f, 6.11f, -1.76f)
                curveToRelative(0.1f, 0.55f, 0.15f, 1.12f, 0.15f, 1.69f)
                curveToRelative(0f, 2.19f, -0.71f, 4.28f, -2.06f, 6.07f)
                close()
            }
        }.also { _FlaskPotion = it}

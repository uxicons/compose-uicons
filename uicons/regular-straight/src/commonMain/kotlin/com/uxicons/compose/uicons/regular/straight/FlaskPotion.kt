package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlaskPotion: ImageVector? = null

val Icons.Rs.FlaskPotion: ImageVector
    get() = _FlaskPotion ?: UXIcon(name = "FlaskPotion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 6.33f)
                lineTo(17f, 2f)
                horizontalLineToRelative(2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.29f)
                curveTo(2.73f, 8.16f, 0f, 12.18f, 0f, 16.71f)
                curveToRelative(0f, 2.51f, 0.84f, 4.89f, 2.43f, 6.91f)
                lineToRelative(0.3f, 0.38f)
                horizontalLineToRelative(18.54f)
                lineToRelative(0.3f, -0.38f)
                curveToRelative(1.59f, -2.01f, 2.43f, -4.4f, 2.43f, -6.91f)
                curveToRelative(0f, -4.4f, -2.79f, -8.49f, -7f, -10.38f)
                close()
                moveTo(8.35f, 7.9f)
                lineToRelative(0.65f, -0.24f)
                lineTo(9f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5.69f)
                lineToRelative(0.64f, 0.25f)
                curveToRelative(2.71f, 1.04f, 4.79f, 3.13f, 5.76f, 5.62f)
                curveToRelative(-0.9f, 0.5f, -2.85f, 1.45f, -4.9f, 1.45f)
                curveToRelative(-1.65f, 0f, -2.87f, -0.46f, -4.15f, -0.94f)
                curveToRelative(-1.4f, -0.52f, -2.84f, -1.06f, -4.85f, -1.06f)
                curveToRelative(-1.92f, 0f, -3.87f, 0.81f, -5.24f, 1.54f)
                curveToRelative(0.73f, -2.99f, 2.96f, -5.48f, 6.09f, -6.64f)
                close()
                moveTo(20.29f, 22.0f)
                lineTo(3.71f, 22.0f)
                curveToRelative(-1.06f, -1.49f, -1.65f, -3.19f, -1.71f, -4.98f)
                curveToRelative(0.94f, -0.61f, 3.32f, -2.02f, 5.49f, -2.02f)
                curveToRelative(1.65f, 0f, 2.87f, 0.46f, 4.15f, 0.94f)
                curveToRelative(1.4f, 0.52f, 2.84f, 1.06f, 4.85f, 1.06f)
                curveToRelative(2.19f, 0f, 4.22f, -0.83f, 5.42f, -1.45f)
                curveToRelative(0.05f, 0.39f, 0.08f, 0.78f, 0.08f, 1.17f)
                curveToRelative(0f, 1.9f, -0.59f, 3.71f, -1.71f, 5.29f)
                close()
            }
        }.also { _FlaskPotion = it}

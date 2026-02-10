package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlaskPotion: ImageVector? = null

val Icons.Ss.FlaskPotion: ImageVector
    get() = _FlaskPotion ?: UXIcon(name = "FlaskPotion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 6.29f)
                lineTo(7f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.33f)
                curveToRelative(2.79f, 1.25f, 4.94f, 3.46f, 6.09f, 6.09f)
                curveToRelative(-0.96f, 0.66f, -3.99f, 2.58f, -6.59f, 2.58f)
                curveToRelative(-1.65f, 0f, -2.87f, -0.46f, -4.15f, -0.94f)
                curveToRelative(-1.4f, -0.52f, -2.84f, -1.06f, -4.85f, -1.06f)
                curveToRelative(-2.96f, 0f, -6.13f, 1.87f, -7.46f, 2.75f)
                curveToRelative(0.36f, -4.13f, 2.98f, -7.73f, 6.96f, -9.46f)
                close()
                moveTo(16.5f, 17f)
                curveToRelative(-2.02f, 0f, -3.46f, -0.54f, -4.85f, -1.06f)
                curveToRelative(-1.28f, -0.48f, -2.5f, -0.94f, -4.15f, -0.94f)
                curveToRelative(-3.12f, 0f, -6.86f, 2.77f, -6.9f, 2.8f)
                lineToRelative(-0.5f, 0.33f)
                curveToRelative(0.26f, 1.99f, 1.04f, 3.86f, 2.33f, 5.49f)
                lineToRelative(0.3f, 0.38f)
                horizontalLineToRelative(18.54f)
                lineToRelative(0.3f, -0.38f)
                curveToRelative(1.59f, -2.01f, 2.43f, -4.4f, 2.43f, -6.91f)
                curveToRelative(0f, -0.79f, -0.09f, -1.57f, -0.26f, -2.32f)
                curveToRelative(-1.44f, 0.93f, -4.43f, 2.61f, -7.24f, 2.61f)
                close()
            }
        }.also { _FlaskPotion = it}

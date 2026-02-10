package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownStrenght: ImageVector? = null

val Icons.Bs.ArrowDownStrenght: ImageVector
    get() = _ArrowDownStrenght ?: UXIcon(name = "ArrowDownStrenght") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                lineTo(24f, 21f)
                close()
                moveTo(11.96f, 14f)
                horizontalLineToRelative(0.0f)
                curveToRelative(7.43f, -0.0f, 11.81f, -5.53f, 11.99f, -5.77f)
                lineToRelative(-2.37f, -1.84f)
                curveToRelative(-0.04f, 0.05f, -3.7f, 4.61f, -9.63f, 4.61f)
                curveToRelative(-5.93f, 0f, -9.59f, -4.57f, -9.62f, -4.61f)
                lineTo(-0.04f, 8.23f)
                curveToRelative(0.18f, 0.24f, 4.56f, 5.77f, 11.99f, 5.77f)
                close()
                moveTo(11.96f, 16f)
                curveToRelative(-6.57f, 0f, -10.55f, -1.91f, -10.58f, -1.93f)
                lineTo(0.04f, 16.76f)
                curveToRelative(0.18f, 0.09f, 4.59f, 2.24f, 11.91f, 2.24f)
                horizontalLineToRelative(0.0f)
                curveToRelative(7.32f, 0f, 11.73f, -2.15f, 11.91f, -2.24f)
                lineToRelative(-1.33f, -2.69f)
                curveToRelative(-0.04f, 0.02f, -4.02f, 1.93f, -10.59f, 1.93f)
                close()
                moveTo(11.25f, 8.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.79f, -3.71f)
                horizontalLineToRelative(-2.96f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 5f)
                horizontalLineToRelative(-3.04f)
                lineToRelative(3.79f, 3.71f)
                close()
            }
        }.also { _ArrowDownStrenght = it}

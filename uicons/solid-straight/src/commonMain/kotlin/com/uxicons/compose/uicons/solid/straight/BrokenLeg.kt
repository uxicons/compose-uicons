package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenLeg: ImageVector? = null

val Icons.Ss.BrokenLeg: ImageVector
    get() = _BrokenLeg ?: UXIcon(name = "BrokenLeg") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4f)
                lineTo(2f, 4f)
                lineTo(2f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4f)
                close()
                moveTo(13f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(4.29f)
                lineToRelative(2.51f, -2.29f)
                horizontalLineToRelative(2.96f)
                lineTo(0f, 13.0f)
                verticalLineToRelative(3.54f)
                lineToRelative(9.34f, -8.54f)
                horizontalLineToRelative(2.96f)
                lineTo(0.29f, 18.99f)
                curveToRelative(0.27f, 0.89f, 0.7f, 1.71f, 1.27f, 2.41f)
                lineToRelative(11.44f, -10.86f)
                verticalLineToRelative(-4.54f)
                close()
                moveTo(6.47f, 19.5f)
                lineToRelative(4.85f, 4.5f)
                horizontalLineToRelative(3.89f)
                lineToRelative(-6.82f, -6.33f)
                lineToRelative(-1.92f, 1.83f)
                close()
                moveTo(13.17f, 13.13f)
                lineToRelative(2.83f, 2.59f)
                verticalLineToRelative(2.71f)
                lineToRelative(-4.29f, -3.92f)
                lineToRelative(-1.87f, 1.77f)
                lineToRelative(8.15f, 7.64f)
                verticalLineToRelative(-10.75f)
                lineToRelative(-4.03f, -0.81f)
                lineToRelative(-0.8f, 0.76f)
                close()
                moveTo(3.04f, 22.76f)
                curveToRelative(1.13f, 0.78f, 2.49f, 1.24f, 3.96f, 1.24f)
                horizontalLineToRelative(1.39f)
                lineToRelative(-3.37f, -3.12f)
                lineToRelative(-1.99f, 1.89f)
                close()
                moveTo(21.37f, 16.32f)
                curveToRelative(-0.14f, -0.04f, -1.09f, -0.23f, -1.37f, -0.3f)
                verticalLineToRelative(5.98f)
                horizontalLineToRelative(1.12f)
                curveToRelative(1.57f, 0f, 2.87f, -1.28f, 2.88f, -2.85f)
                curveToRelative(0.01f, -1.36f, -0.97f, -2.42f, -2.63f, -2.83f)
                close()
            }
        }.also { _BrokenLeg = it}

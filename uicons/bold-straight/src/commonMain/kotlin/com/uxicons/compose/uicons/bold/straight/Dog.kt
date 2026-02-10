package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dog: ImageVector? = null

val Icons.Bs.Dog: ImageVector
    get() = _Dog ?: UXIcon(name = "Dog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.12f, 5f)
                curveToRelative(-0.12f, 0f, -0.22f, -0.07f, -0.28f, -0.17f)
                curveToRelative(-0.56f, -1.13f, -1.7f, -1.83f, -2.96f, -1.83f)
                horizontalLineToRelative(-0.88f)
                lineTo(17f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(0.7f)
                lineToRelative(-1.55f, 4.29f)
                horizontalLineToRelative(-5.95f)
                curveToRelative(-0.81f, 0f, -1.58f, 0.21f, -2.26f, 0.61f)
                curveToRelative(-0.49f, -0.4f, -1.24f, -1.24f, -1.24f, -2.61f)
                lineTo(0f, 6.0f)
                curveToRelative(0f, 2.52f, 1.33f, 4.08f, 2.3f, 4.89f)
                curveToRelative(-0.2f, 0.51f, -0.3f, 1.05f, -0.3f, 1.61f)
                lineToRelative(0.0f, 11.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6.81f)
                lineToRelative(1.05f, -4.19f)
                horizontalLineToRelative(0.45f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-2.88f)
                close()
                moveTo(21f, 9.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.79f)
                lineToRelative(-1.51f, 6f)
                lineTo(5.0f, 16f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.4f, 0.15f, -0.78f, 0.44f, -1.06f)
                curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
                horizontalLineToRelative(8.06f)
                lineToRelative(1.8f, -5.0f)
                horizontalLineToRelative(1.52f)
                curveToRelative(0.12f, 0f, 0.22f, 0.07f, 0.28f, 0.17f)
                curveToRelative(0.55f, 1.09f, 1.63f, 1.78f, 2.84f, 1.83f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _Dog = it}

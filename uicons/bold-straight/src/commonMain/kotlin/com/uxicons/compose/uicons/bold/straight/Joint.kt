package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joint: ImageVector? = null

val Icons.Bs.Joint: ImageVector
    get() = _Joint ?: UXIcon(name = "Joint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.68f, 18.71f)
                lineToRelative(-0.68f, 0.52f)
                verticalLineToRelative(1.62f)
                lineToRelative(0.68f, 0.44f)
                curveToRelative(0.17f, 0.11f, 4.21f, 2.71f, 8.28f, 2.71f)
                horizontalLineToRelative(15.04f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-15.04f)
                curveToRelative(-4.1f, 0f, -8.12f, 2.6f, -8.29f, 2.71f)
                close()
                moveTo(4.7f, 20.0f)
                curveToRelative(1.22f, -0.52f, 2.77f, -1.0f, 4.27f, -1.0f)
                horizontalLineToRelative(1.92f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-3.92f)
                curveToRelative(-1.49f, 0f, -3.04f, -0.48f, -4.27f, -1.0f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(5.88f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 4.86f)
                verticalLineToRelative(-2.86f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.86f)
                curveToRelative(0f, 0.87f, 0.47f, 1.7f, 1.21f, 2.14f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(1.35f, 0.81f, 2.19f, 2.29f, 2.19f, 3.86f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -0.52f, -0.28f, -1.02f, -0.73f, -1.29f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-1.65f, -0.99f, -2.67f, -2.79f, -2.67f, -4.72f)
                close()
                moveTo(24f, 10.26f)
                verticalLineToRelative(1.74f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.74f)
                curveToRelative(0f, -0.87f, -0.47f, -1.69f, -1.21f, -2.14f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-1.05f, -0.63f, -1.7f, -1.78f, -1.7f, -3.0f)
                lineTo(16.0f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 0.17f, 0.09f, 0.34f, 0.24f, 0.43f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(1.65f, 0.99f, 2.67f, 2.79f, 2.67f, 4.72f)
                close()
            }
        }.also { _Joint = it}

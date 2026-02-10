package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThreeDirection: ImageVector? = null

val Icons.Bs.ThreeDirection: ImageVector
    get() = _ThreeDirection ?: UXIcon(name = "ThreeDirection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.31f, 12.81f)
                lineToRelative(-1.87f, 1.87f)
                curveToRelative(-0.28f, 0.28f, -0.44f, 0.67f, -0.44f, 1.06f)
                verticalLineToRelative(8.26f)
                horizontalLineToRelative(-3f)
                lineTo(16.0f, 15.74f)
                curveToRelative(0f, -1.19f, 0.48f, -2.34f, 1.32f, -3.18f)
                lineToRelative(1.87f, -1.87f)
                lineToRelative(-2.69f, -2.69f)
                lineToRelative(6.32f, 0.0f)
                curveToRelative(0.66f, -0.04f, 1.21f, 0.51f, 1.17f, 1.17f)
                lineToRelative(0.0f, 6.32f)
                lineToRelative(-2.69f, -2.69f)
                close()
                moveTo(4.81f, 10.69f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(-6.32f, 0.0f)
                curveTo(0.51f, 7.97f, -0.03f, 8.51f, 0.0f, 9.18f)
                lineToRelative(-0.0f, 6.32f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(1.87f, 1.87f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.67f, 0.44f, 1.06f)
                verticalLineToRelative(8.26f)
                horizontalLineToRelative(3f)
                lineTo(8f, 15.74f)
                curveToRelative(0f, -1.19f, -0.48f, -2.35f, -1.32f, -3.18f)
                lineToRelative(-1.87f, -1.87f)
                close()
                moveTo(17.4f, 5f)
                lineTo(12.81f, 0.37f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0f)
                lineTo(6.68f, 5f)
                horizontalLineToRelative(3.82f)
                lineTo(10.5f, 24f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 5f)
                horizontalLineToRelative(3.9f)
                close()
            }
        }.also { _ThreeDirection = it}

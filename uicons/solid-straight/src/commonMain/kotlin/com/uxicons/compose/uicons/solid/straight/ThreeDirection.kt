package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThreeDirection: ImageVector? = null

val Icons.Ss.ThreeDirection: ImageVector
    get() = _ThreeDirection ?: UXIcon(name = "ThreeDirection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.59f)
                lineToRelative(-3.41f, 3.41f)
                curveToRelative(-0.37f, 0.37f, -0.59f, 0.89f, -0.59f, 1.41f)
                verticalLineToRelative(7.76f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.76f)
                curveToRelative(0f, -1.05f, 0.43f, -2.08f, 1.17f, -2.83f)
                lineToRelative(3.41f, -3.41f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(3.45f, 10f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(-2f)
                lineTo(2.04f, 8f)
                curveTo(0.94f, 8f, 0.04f, 8.9f, 0.04f, 10f)
                verticalLineToRelative(5f)
                lineTo(2.04f, 15f)
                verticalLineToRelative(-3.59f)
                lineToRelative(3.41f, 3.41f)
                curveToRelative(0.37f, 0.37f, 0.59f, 0.89f, 0.59f, 1.41f)
                verticalLineToRelative(7.76f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.76f)
                curveToRelative(0f, -1.05f, -0.43f, -2.08f, -1.17f, -2.83f)
                lineToRelative(-3.41f, -3.41f)
                close()
                moveTo(17.16f, 4.35f)
                lineTo(13.56f, 0.7f)
                curveToRelative(-0.8f, -0.9f, -2.37f, -0.87f, -3.13f, -0.02f)
                lineToRelative(-3.56f, 3.72f)
                lineToRelative(1.44f, 1.38f)
                lineToRelative(2.69f, -2.81f)
                lineTo(11f, 24f)
                horizontalLineToRelative(2f)
                lineTo(13f, 3.02f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(1.42f, -1.41f)
                close()
            }
        }.also { _ThreeDirection = it}

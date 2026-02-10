package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandZoomIn: ImageVector? = null

val Icons.Ts.HandZoomIn: ImageVector
    get() = _HandZoomIn ?: UXIcon(name = "HandZoomIn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 13f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.29f)
                lineToRelative(10.29f, -10.29f)
                horizontalLineToRelative(-4.29f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.29f)
                lineToRelative(-10.29f, 10.29f)
                horizontalLineToRelative(4.29f)
                close()
                moveTo(15f, 15.66f)
                lineTo(15.0f, 10.61f)
                curveToRelative(0f, -1.27f, -0.9f, -2.38f, -2.08f, -2.57f)
                curveToRelative(-0.73f, -0.12f, -1.48f, 0.09f, -2.04f, 0.56f)
                curveToRelative(-0.56f, 0.48f, -0.88f, 1.17f, -0.88f, 1.91f)
                verticalLineToRelative(9.61f)
                lineToRelative(-1.83f, -1.45f)
                verticalLineToRelative(0.0f)
                curveToRelative(-1.01f, -0.91f, -2.57f, -0.85f, -3.5f, 0.14f)
                curveToRelative(-0.94f, 1.01f, -0.89f, 2.59f, 0.11f, 3.52f)
                lineToRelative(1.78f, 1.68f)
                horizontalLineToRelative(1.44f)
                lineToRelative(-2.54f, -2.41f)
                curveToRelative(-0.6f, -0.56f, -0.63f, -1.51f, -0.06f, -2.12f)
                curveToRelative(0.56f, -0.6f, 1.51f, -0.64f, 2.12f, -0.07f)
                curveToRelative(0.01f, 0.01f, 3.48f, 2.77f, 3.48f, 2.77f)
                verticalLineToRelative(-11.69f)
                curveToRelative(0f, -0.44f, 0.19f, -0.86f, 0.53f, -1.14f)
                curveToRelative(0.34f, -0.29f, 0.78f, -0.41f, 1.23f, -0.34f)
                curveToRelative(0.71f, 0.12f, 1.25f, 0.8f, 1.25f, 1.59f)
                lineToRelative(-0.0f, 5.74f)
                lineToRelative(9.0f, 3.5f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.89f)
                close()
            }
        }.also { _HandZoomIn = it}

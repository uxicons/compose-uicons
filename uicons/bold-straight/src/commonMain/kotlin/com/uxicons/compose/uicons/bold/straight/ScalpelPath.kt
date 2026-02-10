package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScalpelPath: ImageVector? = null

val Icons.Bs.ScalpelPath: ImageVector
    get() = _ScalpelPath ?: UXIcon(name = "ScalpelPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.82f, 17.59f)
                lineToRelative(0.41f, -2.18f)
                lineToRelative(8.59f, -8.6f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.1f, 0f, -5.66f)
                curveToRelative(-1.51f, -1.51f, -4.15f, -1.51f, -5.66f, 0f)
                lineTo(0f, 18.32f)
                verticalLineToRelative(3.69f)
                reflectiveCurveToRelative(3.56f, -0.01f, 3.56f, -0.01f)
                curveToRelative(4.0f, -0.16f, 7.43f, -1.56f, 9.94f, -4.07f)
                lineToRelative(0.33f, -0.33f)
                close()
                moveTo(11.05f, 16.11f)
                curveToRelative(-2.38f, 2.17f, -5.33f, 2.77f, -7.47f, 2.87f)
                lineToRelative(6.18f, -6.17f)
                lineToRelative(1.63f, 1.52f)
                lineToRelative(-0.33f, 1.78f)
                close()
                moveTo(11.88f, 10.69f)
                lineToRelative(7.42f, -7.41f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.38f, 1.41f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-7.36f, 7.36f)
                lineToRelative(-1.47f, -1.37f)
                close()
                moveTo(12.0f, 21.0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _ScalpelPath = it}

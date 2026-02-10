package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trumpet: ImageVector? = null

val Icons.Bs.Trumpet: ImageVector
    get() = _Trumpet ?: UXIcon(name = "Trumpet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 3f)
                verticalLineToRelative(0.79f)
                curveToRelative(-1.53f, 5.21f, -5.6f, 6.43f, -8f, 6.69f)
                verticalLineToRelative(-2.48f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.89f)
                curveToRelative(-0.56f, 0.86f, -0.89f, 1.89f, -0.89f, 3f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0f, -0.87f, -0.2f, -1.69f, -0.56f, -2.42f)
                curveToRelative(2.13f, 0.77f, 4.48f, 2.46f, 5.56f, 6.13f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(3f)
                lineTo(24f, 3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10.5f, 19f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(18.12f, 12f)
                curveToRelative(1.01f, -0.55f, 2.0f, -1.27f, 2.88f, -2.21f)
                verticalLineToRelative(4.41f)
                curveToRelative(-0.88f, -0.93f, -1.86f, -1.66f, -2.88f, -2.21f)
                close()
            }
        }.also { _Trumpet = it}

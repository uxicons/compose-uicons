package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCowboy: ImageVector? = null

val Icons.Ss.UserCowboy: ImageVector
    get() = _UserCowboy ?: UXIcon(name = "UserCowboy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(22.3f, 0.75f)
                curveToRelative(-0.09f, 0.12f, -1.62f, 2.16f, -4.99f, 3.37f)
                curveToRelative(-0.64f, -1.62f, -1.89f, -4.12f, -2.88f, -4.12f)
                curveToRelative(-0.53f, 0f, -0.86f, 0.31f, -1.08f, 0.52f)
                curveToRelative(-0.25f, 0.24f, -0.51f, 0.48f, -1.34f, 0.48f)
                reflectiveCurveToRelative(-1.09f, -0.24f, -1.34f, -0.48f)
                curveToRelative(-0.22f, -0.21f, -0.55f, -0.52f, -1.08f, -0.52f)
                curveToRelative(-1.0f, 0f, -2.24f, 2.48f, -2.88f, 4.12f)
                curveTo(3.34f, 2.91f, 1.81f, 0.87f, 1.72f, 0.75f)
                lineTo(0.1f, 1.91f)
                curveToRelative(0.15f, 0.21f, 3.7f, 5.09f, 11.9f, 5.09f)
                reflectiveCurveTo(23.77f, 2.12f, 23.92f, 1.91f)
                lineToRelative(-1.62f, -1.17f)
                close()
                moveTo(12.0f, 9f)
                curveToRelative(-2.31f, 0f, -4.3f, -0.36f, -5.99f, -0.9f)
                curveToRelative(0.06f, 3.26f, 2.72f, 5.89f, 6.0f, 5.89f)
                reflectiveCurveToRelative(5.93f, -2.63f, 5.99f, -5.88f)
                curveToRelative(-1.69f, 0.53f, -3.67f, 0.88f, -5.99f, 0.88f)
                close()
            }
        }.also { _UserCowboy = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleWhole: ImageVector? = null

val Icons.Ss.AppleWhole: ImageVector
    get() = _AppleWhole ?: UXIcon(name = "AppleWhole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.41f, 7.03f)
                curveTo(16.29f, 8.38f, 15.89f, 7.89f, 13f, 8f)
                lineTo(13f, 6f)
                arcTo(9.87f, 9.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.43f, 0.47f)
                curveToRelative(-0.09f, -0.15f, -0.17f, -0.29f, -0.24f, -0.42f)
                lineTo(9.44f, 1.01f)
                curveToRelative(0.08f, 0.15f, 0.17f, 0.31f, 0.27f, 0.48f)
                arcTo(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6f)
                verticalLineToRelative(0.41f)
                curveTo(5.55f, 4.56f, -0.07f, 9.1f, 0f, 15f)
                curveToRelative(-0.11f, 6.33f, 6.42f, 10.95f, 12f, 8.2f)
                curveTo(22.46f, 27.62f, 28.79f, 12.44f, 19.41f, 7.03f)
                close()
                moveTo(19.53f, 4.49f)
                arcTo(6.66f, 6.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 6f)
                curveTo(14.88f, 2.23f, 17.16f, -0.19f, 20.99f, 0.01f)
                arcTo(6.39f, 6.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.53f, 4.49f)
                close()
            }
        }.also { _AppleWhole = it}

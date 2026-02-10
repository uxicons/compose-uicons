package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seedling: ImageVector? = null

val Icons.Ss.Seedling: ImageVector
    get() = _Seedling ?: UXIcon(name = "Seedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 0.94f)
                lineToRelative(-0.06f, -0.96f)
                lineToRelative(-0.96f, 0.01f)
                curveToRelative(-6.71f, 0.1f, -9.66f, 4.23f, -10.96f, 7.61f)
                curveTo(10.71f, 4.23f, 7.75f, 0.1f, 1.04f, 0f)
                lineTo(0.09f, -0.01f)
                lineTo(0.03f, 0.94f)
                curveToRelative(-0.22f, 3.8f, 0.75f, 6.79f, 2.87f, 8.89f)
                curveToRelative(2.63f, 2.6f, 6.3f, 3.08f, 8.1f, 3.15f)
                verticalLineToRelative(11.01f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11.01f)
                curveToRelative(1.79f, -0.07f, 5.46f, -0.55f, 8.1f, -3.15f)
                curveToRelative(2.12f, -2.1f, 3.09f, -5.09f, 2.87f, -8.89f)
                close()
            }
        }.also { _Seedling = it}

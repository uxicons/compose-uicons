package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dagger: ImageVector? = null

val Icons.Ss.Dagger: ImageVector
    get() = _Dagger ?: UXIcon(name = "Dagger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 9.12f)
                lineToRelative(-3.13f, -3.13f)
                lineToRelative(4.57f, -4.57f)
                lineTo(22.56f, 0.01f)
                lineToRelative(-4.57f, 4.57f)
                lineToRelative(-3.12f, -3.12f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                horizontalLineToRelative(-2.34f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.34f)
                curveToRelative(0.8f, 0f, 1.56f, 0.31f, 2.12f, 0.88f)
                lineToRelative(0.74f, 0.75f)
                lineToRelative(-7.1f, 7.11f)
                curveToRelative(-2.46f, 2.46f, -4.51f, 5.29f, -6.07f, 8.4f)
                lineToRelative(-0.9f, 1.78f)
                lineToRelative(-0.08f, 0.23f)
                curveToRelative(-0.17f, 0.78f, 0.06f, 1.59f, 0.63f, 2.16f)
                curveToRelative(0.45f, 0.45f, 1.04f, 0.69f, 1.65f, 0.69f)
                curveToRelative(0.17f, 0f, 0.34f, -0.02f, 0.51f, -0.06f)
                lineToRelative(2.02f, -0.98f)
                curveToRelative(3.11f, -1.57f, 5.94f, -3.61f, 8.4f, -6.08f)
                lineToRelative(7.1f, -7.11f)
                lineToRelative(0.75f, 0.75f)
                curveToRelative(0.56f, 0.56f, 0.88f, 1.33f, 0.88f, 2.12f)
                verticalLineToRelative(2.34f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.34f)
                curveToRelative(0f, -1.33f, -0.52f, -2.59f, -1.47f, -3.54f)
                close()
            }
        }.also { _Dagger = it}

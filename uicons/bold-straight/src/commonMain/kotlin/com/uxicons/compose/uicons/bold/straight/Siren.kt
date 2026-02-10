package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Siren: ImageVector? = null

val Icons.Bs.Siren: ImageVector
    get() = _Siren ?: UXIcon(name = "Siren") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.79f, 19.25f)
                lineToRelative(-1.47f, -15.3f)
                curveToRelative(-0.28f, -2.25f, -2.2f, -3.94f, -4.46f, -3.94f)
                horizontalLineToRelative(-7.7f)
                curveTo(5.88f, 0f, 3.96f, 1.69f, 3.68f, 3.98f)
                lineToRelative(-1.47f, 15.26f)
                curveToRelative(-1.29f, 0.52f, -2.21f, 1.78f, -2.21f, 3.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.47f, -0.92f, -2.74f, -2.21f, -3.25f)
                close()
                moveTo(8.15f, 3f)
                horizontalLineToRelative(7.7f)
                curveToRelative(0.76f, 0f, 1.4f, 0.56f, 1.48f, 1.27f)
                lineToRelative(1.42f, 14.73f)
                lineTo(5.25f, 19f)
                lineToRelative(1.41f, -14.69f)
                curveToRelative(0.09f, -0.75f, 0.73f, -1.31f, 1.49f, -1.31f)
                close()
                moveTo(11.23f, 9f)
                horizontalLineToRelative(-3.01f)
                lineToRelative(0.25f, -2.64f)
                curveToRelative(0.07f, -0.77f, 0.72f, -1.36f, 1.49f, -1.36f)
                horizontalLineToRelative(2.03f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-0.67f)
                lineToRelative(-0.1f, 1f)
                close()
            }
        }.also { _Siren = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPraying: ImageVector? = null

val Icons.Bs.PersonPraying: ImageVector
    get() = _PersonPraying ?: UXIcon(name = "PersonPraying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.47f)
                curveTo(13f, 1.09f, 14.12f, -0.03f, 15.5f, -0.03f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(16.26f, 14.44f)
                lineToRelative(5.74f, -3.83f)
                lineToRelative(-1.66f, -2.5f)
                lineToRelative(-3.26f, 2.17f)
                lineToRelative(-1.25f, -1.86f)
                curveToRelative(-0.51f, -0.98f, -1.36f, -1.73f, -2.39f, -2.13f)
                curveToRelative(-0.74f, -0.32f, -1.52f, -0.38f, -2.27f, -0.18f)
                curveToRelative(-0.97f, 0.26f, -1.79f, 0.93f, -2.26f, 1.91f)
                lineToRelative(-2.47f, 5.76f)
                curveToRelative(-0.56f, 1.13f, -0.82f, 2.81f, 1.07f, 4.35f)
                lineToRelative(3.31f, 2.87f)
                horizontalLineToRelative(-5.81f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2.48f)
                lineToRelative(-4.87f, -4.22f)
                lineToRelative(2.72f, -6.48f)
                lineToRelative(2.41f, 3.6f)
                close()
            }
        }.also { _PersonPraying = it}

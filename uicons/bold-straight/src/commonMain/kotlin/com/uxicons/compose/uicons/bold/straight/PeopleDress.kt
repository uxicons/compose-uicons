package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeopleDress: ImageVector? = null

val Icons.Bs.PeopleDress: ImageVector
    get() = _PeopleDress ?: UXIcon(name = "PeopleDress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3f)
                lineTo(0.8f, 21f)
                lineToRelative(1.49f, -11.93f)
                curveToRelative(0.22f, -1.75f, 1.71f, -3.07f, 3.47f, -3.07f)
                horizontalLineToRelative(1.47f)
                curveToRelative(1.76f, 0f, 3.25f, 1.32f, 3.47f, 3.07f)
                lineToRelative(1.29f, 10.34f)
                lineToRelative(1.29f, -10.34f)
                curveToRelative(0.22f, -1.75f, 1.71f, -3.07f, 3.47f, -3.07f)
                horizontalLineToRelative(1.47f)
                curveToRelative(1.76f, 0f, 3.25f, 1.32f, 3.47f, 3.07f)
                lineToRelative(1.49f, 11.93f)
                horizontalLineToRelative(-2.2f)
                close()
                moveTo(4.2f, 18f)
                horizontalLineToRelative(4.6f)
                lineToRelative(-1.07f, -8.56f)
                curveToRelative(-0.03f, -0.25f, -0.24f, -0.44f, -0.5f, -0.44f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.25f, 0f, -0.46f, 0.19f, -0.5f, 0.44f)
                lineToRelative(-1.07f, 8.56f)
                close()
                moveTo(15.2f, 18f)
                horizontalLineToRelative(4.6f)
                lineToRelative(-1.07f, -8.56f)
                curveToRelative(-0.03f, -0.25f, -0.24f, -0.44f, -0.5f, -0.44f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.25f, 0f, -0.46f, 0.19f, -0.5f, 0.44f)
                lineToRelative(-1.07f, 8.56f)
                close()
                moveTo(6.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(7.88f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _PeopleDress = it}

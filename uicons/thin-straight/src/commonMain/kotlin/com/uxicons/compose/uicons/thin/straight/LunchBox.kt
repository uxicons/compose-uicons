package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LunchBox: ImageVector? = null

val Icons.Ts.LunchBox: ImageVector
    get() = _LunchBox ?: UXIcon(name = "LunchBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                horizontalLineToRelative(-1.56f)
                lineToRelative(-0.65f, -4.83f)
                curveToRelative(-0.17f, -1.24f, -1.23f, -2.17f, -2.48f, -2.17f)
                horizontalLineToRelative(-14.62f)
                curveToRelative(-1.25f, 0f, -2.31f, 0.93f, -2.48f, 2.17f)
                lineToRelative(-0.65f, 4.83f)
                horizontalLineToRelative(-1.56f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.56f)
                lineToRelative(0.65f, 4.83f)
                curveToRelative(0.17f, 1.24f, 1.23f, 2.17f, 2.48f, 2.17f)
                horizontalLineToRelative(14.62f)
                curveToRelative(1.25f, 0f, 2.31f, -0.93f, 2.48f, -2.17f)
                lineToRelative(0.65f, -4.83f)
                horizontalLineToRelative(1.56f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3.2f, 11.3f)
                curveToRelative(0.1f, -0.74f, 0.74f, -1.3f, 1.49f, -1.3f)
                horizontalLineToRelative(14.62f)
                curveToRelative(0.75f, 0f, 1.39f, 0.56f, 1.49f, 1.3f)
                lineToRelative(0.63f, 4.7f)
                horizontalLineToRelative(-18.86f)
                close()
                moveTo(13.86f, 17f)
                lineTo(13.61f, 18f)
                horizontalLineToRelative(-3.22f)
                lineToRelative(-0.25f, -1f)
                close()
                moveTo(20.8f, 21.7f)
                curveToRelative(-0.1f, 0.74f, -0.74f, 1.3f, -1.49f, 1.3f)
                horizontalLineToRelative(-14.62f)
                curveToRelative(-0.75f, 0f, -1.39f, -0.56f, -1.49f, -1.3f)
                lineToRelative(-0.63f, -4.7f)
                horizontalLineToRelative(6.54f)
                lineToRelative(0.5f, 2f)
                horizontalLineToRelative(4.78f)
                lineToRelative(0.5f, -2f)
                horizontalLineToRelative(6.54f)
                lineToRelative(-0.63f, 4.7f)
                close()
                moveTo(7.5f, 7f)
                curveToRelative(1.76f, 0f, 3.2f, -1.31f, 3.45f, -3f)
                horizontalLineToRelative(11.05f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-11.05f)
                curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
                curveToRelative(-1.88f, 0f, -5.5f, 1.48f, -5.5f, 3.5f)
                reflectiveCurveToRelative(3.62f, 3.5f, 5.5f, 3.5f)
                close()
                moveTo(7.5f, 1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.57f, 0f, -4.5f, -1.28f, -4.5f, -2.5f)
                reflectiveCurveToRelative(2.93f, -2.5f, 4.5f, -2.5f)
                close()
            }
        }.also { _LunchBox = it}

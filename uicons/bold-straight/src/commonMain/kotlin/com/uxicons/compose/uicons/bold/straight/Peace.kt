package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peace: ImageVector? = null

val Icons.Bs.Peace: ImageVector
    get() = _Peace ?: UXIcon(name = "Peace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 1.42f, -0.34f, 2.77f, -0.93f, 3.96f)
                lineToRelative(-6.57f, -6.57f)
                lineTo(13.5f, 3.13f)
                curveToRelative(4.25f, 0.72f, 7.5f, 4.41f, 7.5f, 8.87f)
                close()
                moveTo(10.5f, 20.86f)
                curveToRelative(-1.85f, -0.31f, -3.52f, -1.19f, -4.81f, -2.46f)
                lineToRelative(4.81f, -4.81f)
                verticalLineToRelative(7.26f)
                close()
                moveTo(13.5f, 13.64f)
                lineToRelative(4.79f, 4.79f)
                curveToRelative(-1.28f, 1.26f, -2.94f, 2.12f, -4.79f, 2.44f)
                verticalLineToRelative(-7.22f)
                close()
                moveTo(10.5f, 3.14f)
                verticalLineToRelative(6.22f)
                lineToRelative(-6.58f, 6.58f)
                curveToRelative(-0.58f, -1.19f, -0.92f, -2.52f, -0.92f, -3.94f)
                curveToRelative(0f, -4.45f, 3.25f, -8.15f, 7.5f, -8.87f)
                close()
            }
        }.also { _Peace = it}

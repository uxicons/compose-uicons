package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Treadmill: ImageVector? = null

val Icons.Rs.Treadmill: ImageVector
    get() = _Treadmill ?: UXIcon(name = "Treadmill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.09f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.77f)
                lineToRelative(-3.48f, 10f)
                horizontalLineToRelative(-7.29f)
                verticalLineToRelative(-5.57f)
                lineToRelative(-4.53f, -2.67f)
                curveToRelative(-0.41f, -0.26f, -0.58f, -0.78f, -0.39f, -1.23f)
                lineToRelative(1.86f, -4.53f)
                horizontalLineToRelative(0.16f)
                curveToRelative(0.56f, 0f, 1.09f, 0.24f, 1.49f, 0.67f)
                lineToRelative(-1.52f, 3.7f)
                lineToRelative(1.74f, 1.03f)
                lineToRelative(1.26f, -3.07f)
                lineToRelative(1.49f, 1.67f)
                horizontalLineToRelative(4.45f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.55f)
                lineToRelative(-2.28f, -2.56f)
                curveToRelative(-0.76f, -0.91f, -1.88f, -1.44f, -3.07f, -1.44f)
                lineTo(2.55f, 6.0f)
                lineTo(0.47f, 10.5f)
                lineToRelative(1.81f, 0.84f)
                lineToRelative(1.54f, -3.34f)
                horizontalLineToRelative(1.94f)
                lineToRelative(-1.55f, 3.77f)
                curveToRelative(-0.44f, 1.07f, -0.21f, 2.26f, 0.53f, 3.1f)
                lineToRelative(-0.91f, 2.12f)
                lineTo(0f, 17.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.16f)
                lineToRelative(1.26f, -2.95f)
                lineToRelative(2.58f, 1.52f)
                verticalLineToRelative(4.43f)
                lineTo(0f, 22.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(19.71f)
                lineToRelative(4.29f, -12.33f)
                verticalLineToRelative(-1.67f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Treadmill = it}

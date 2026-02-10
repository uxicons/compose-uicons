package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Treadmill: ImageVector? = null

val Icons.Ss.Treadmill: ImageVector
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
                lineToRelative(-2.71f, -1.6f)
                lineToRelative(2.15f, -5.2f)
                lineToRelative(2.11f, 2.37f)
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
                curveToRelative(-0.55f, 1.35f, -0.06f, 2.89f, 1.2f, 3.69f)
                lineToRelative(3.58f, 2.11f)
                verticalLineToRelative(4.43f)
                lineTo(0f, 22.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(19.71f)
                lineToRelative(4.29f, -12.33f)
                verticalLineToRelative(-1.67f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(5.63f, 17.91f)
                lineToRelative(-1.22f, -0.72f)
                curveToRelative(-0.18f, -0.11f, -0.33f, -0.24f, -0.49f, -0.37f)
                lineToRelative(-0.08f, 0.18f)
                lineTo(0f, 17.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.16f)
                lineToRelative(0.47f, -1.09f)
                close()
            }
        }.also { _Treadmill = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Digging: ImageVector? = null

val Icons.Bs.Digging: ImageVector
    get() = _Digging ?: UXIcon(name = "Digging") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 24f)
                lineToRelative(2.44f, -3.49f)
                lineTo(0.65f, 10.74f)
                lineToRelative(1.69f, -2.48f)
                lineToRelative(2.56f, 1.75f)
                lineToRelative(0.61f, -1.7f)
                curveToRelative(0.34f, -0.94f, 1.06f, -1.69f, 1.99f, -2.06f)
                curveToRelative(0.93f, -0.37f, 1.97f, -0.33f, 2.87f, 0.11f)
                lineToRelative(0.67f, 0.34f)
                curveToRelative(1.26f, 0.63f, 2.23f, 1.71f, 2.71f, 3.04f)
                lineToRelative(1.25f, 3.44f)
                lineToRelative(-2.82f, 1.02f)
                lineToRelative(-1.25f, -3.44f)
                curveToRelative(-0.22f, -0.6f, -0.65f, -1.09f, -1.23f, -1.38f)
                lineToRelative(-0.67f, -0.34f)
                curveToRelative(-0.18f, -0.09f, -0.33f, -0.05f, -0.41f, -0.02f)
                curveToRelative(-0.08f, 0.03f, -0.22f, 0.11f, -0.28f, 0.29f)
                lineToRelative(-0.87f, 2.43f)
                lineToRelative(9.2f, 6.29f)
                lineToRelative(2.84f, -4.06f)
                lineToRelative(4.5f, 10f)
                horizontalLineToRelative(-11.5f)
                close()
                moveTo(11.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.76f)
                lineToRelative(-3f, -2.05f)
                verticalLineToRelative(5.81f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(3.19f)
                lineToRelative(2.62f, -7.31f)
                lineToRelative(-2.56f, -1.75f)
                lineTo(0f, 24f)
                close()
            }
        }.also { _Digging = it}

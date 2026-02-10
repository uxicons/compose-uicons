package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScalpelPath: ImageVector? = null

val Icons.Rs.ScalpelPath: ImageVector
    get() = _ScalpelPath ?: UXIcon(name = "ScalpelPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 0.87f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineTo(0f, 19.75f)
                verticalLineToRelative(2.22f)
                reflectiveCurveToRelative(2.81f, 0.03f, 3.04f, 0.02f)
                curveToRelative(3.6f, -0.14f, 7.19f, -1.82f, 9.75f, -4.39f)
                lineToRelative(0.76f, -2.92f)
                lineToRelative(9.57f, -9.57f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                close()
                moveTo(10.99f, 16.57f)
                curveToRelative(-2.18f, 2.09f, -5.02f, 3.31f, -8.03f, 3.42f)
                curveToRelative(-0.11f, 0.0f, -0.24f, 0.01f, -0.38f, 0.01f)
                lineToRelative(7.04f, -7.04f)
                lineToRelative(1.86f, 1.74f)
                lineToRelative(-0.48f, 1.86f)
                close()
                moveTo(21.71f, 3.69f)
                lineToRelative(-9.22f, 9.22f)
                lineToRelative(-1.46f, -1.36f)
                lineTo(20.29f, 2.28f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.38f, 1.41f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _ScalpelPath = it}

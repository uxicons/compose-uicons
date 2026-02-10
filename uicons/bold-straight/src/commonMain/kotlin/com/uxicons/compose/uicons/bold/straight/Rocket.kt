package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rocket: ImageVector? = null

val Icons.Bs.Rocket: ImageVector
    get() = _Rocket ?: UXIcon(name = "Rocket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
                close()
                moveTo(16.5f, 9f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                close()
                moveTo(10.5f, 15f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                close()
                moveTo(23.84f, 3.55f)
                lineTo(23.77f, 3.76f)
                curveToRelative(-1.49f, 4.13f, -2.91f, 8.05f, -5.82f, 11.54f)
                arcToRelative(13.99f, 13.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.77f, 8.7f)
                horizontalLineToRelative(-4.17f)
                verticalLineToRelative(-3.33f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-2.03f, 2.03f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.03f, -2.03f)
                lineToRelative(-1.77f, -1.77f)
                horizontalLineToRelative(-3.33f)
                verticalLineToRelative(-4.17f)
                arcToRelative(13.21f, 13.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.77f, -4.83f)
                curveToRelative(3.47f, -2.88f, 7.37f, -4.29f, 11.47f, -5.77f)
                lineToRelative(0.21f, -0.07f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.39f, 3.39f)
                close()
                moveTo(20.77f, 3.23f)
                curveToRelative(-4.36f, 1.57f, -8.13f, 3.01f, -11.37f, 6.24f)
                arcToRelative(24.08f, 24.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.16f, 4.2f)
                lineToRelative(4.09f, 4.09f)
                arcToRelative(24.24f, 24.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, -3.16f)
                curveToRelative(3.23f, -3.24f, 4.67f, -7.01f, 6.24f, -11.37f)
                close()
            }
        }.also { _Rocket = it}

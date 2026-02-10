package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dart: ImageVector? = null

val Icons.Rs.Dart: ImageVector
    get() = _Dart ?: UXIcon(name = "Dart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-4.41f)
                lineToRelative(-5.59f, 5.59f)
                verticalLineToRelative(5.12f)
                curveToRelative(-3.27f, 2.42f, -7.58f, 5.63f, -8.12f, 6.17f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.58f, 3.4f)
                lineToRelative(-2.3f, 2.31f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.3f, -2.3f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, -0.58f)
                curveToRelative(0.54f, -0.54f, 3.76f, -4.86f, 6.18f, -8.12f)
                horizontalLineToRelative(5.12f)
                lineToRelative(5.58f, -5.59f)
                verticalLineToRelative(-4.41f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(5.71f, 19.71f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
                curveToRelative(0.34f, -0.34f, 3f, -2.34f, 5.95f, -4.53f)
                curveToRelative(-2.19f, 2.95f, -4.2f, 5.61f, -4.53f, 5.95f)
                close()
                moveTo(22f, 6.59f)
                lineTo(17.59f, 11f)
                horizontalLineToRelative(-2.81f)
                lineToRelative(0.99f, -1.35f)
                lineToRelative(4.95f, -4.95f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4.94f, 4.94f)
                lineToRelative(-1.35f, 0.99f)
                verticalLineToRelative(-2.81f)
                lineToRelative(4.41f, -4.41f)
                horizontalLineToRelative(3.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _Dart = it}

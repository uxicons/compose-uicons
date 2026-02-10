package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dart: ImageVector? = null

val Icons.Ss.Dart: ImageVector
    get() = _Dart ?: UXIcon(name = "Dart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.41f, 12f)
                curveToRelative(-2.29f, 3.12f, -5.63f, 8.46f, -6.29f, 9.12f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.41f, 0.58f)
                lineToRelative(-2.3f, 2.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.3f, -2.3f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.58f, -3.4f)
                curveToRelative(0.66f, -0.66f, 6.01f, -4f, 9.12f, -6.29f)
                close()
                moveTo(12f, 4.59f)
                verticalLineToRelative(6f)
                lineToRelative(7.29f, -7.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-7.29f, 7.29f)
                horizontalLineToRelative(6f)
                lineToRelative(4.59f, -4.59f)
                verticalLineToRelative(-4.41f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-4.41f)
                close()
            }
        }.also { _Dart = it}

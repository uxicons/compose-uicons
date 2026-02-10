package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dart: ImageVector? = null

val Icons.Bs.Dart: ImageVector
    get() = _Dart ?: UXIcon(name = "Dart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                horizontalLineToRelative(-5.12f)
                lineToRelative(-5.38f, 5.38f)
                verticalLineToRelative(6.12f)
                curveToRelative(-2.81f, 2.04f, -6.6f, 4.82f, -7.11f, 5.33f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.77f, 2.93f)
                lineToRelative(-2.1f, 2.1f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.1f, -2.1f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.94f, -0.77f)
                curveToRelative(0.51f, -0.51f, 3.29f, -4.3f, 5.33f, -7.11f)
                horizontalLineToRelative(6.12f)
                lineToRelative(5.38f, -5.38f)
                verticalLineToRelative(-5.12f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                close()
                moveTo(21f, 7.38f)
                lineTo(17.38f, 11f)
                horizontalLineToRelative(-2.26f)
                lineToRelative(4.44f, -4.44f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-4.44f, 4.44f)
                verticalLineToRelative(-2.26f)
                lineToRelative(3.62f, -3.62f)
                horizontalLineToRelative(3.88f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
            }
        }.also { _Dart = it}

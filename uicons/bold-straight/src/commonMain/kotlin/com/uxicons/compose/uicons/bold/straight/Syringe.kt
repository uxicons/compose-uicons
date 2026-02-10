package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Syringe: ImageVector? = null

val Icons.Bs.Syringe: ImageVector
    get() = _Syringe ?: UXIcon(name = "Syringe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.87f, 7.99f)
                lineToRelative(2.14f, -2.1f)
                lineToRelative(-5.75f, -5.87f)
                lineToRelative(-2.14f, 2.1f)
                lineToRelative(1.89f, 1.93f)
                lineToRelative(-1.65f, 1.53f)
                lineToRelative(-0.56f, -0.56f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
                lineToRelative(-7.85f, 7.85f)
                verticalLineToRelative(6f)
                lineToRelative(-3.06f, 3.06f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.06f, -3.06f)
                horizontalLineToRelative(6f)
                lineToRelative(7.85f, -7.85f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.95f)
                lineToRelative(-0.49f, -0.49f)
                lineToRelative(1.63f, -1.51f)
                close()
                moveTo(16.85f, 11.03f)
                lineTo(9.88f, 18f)
                horizontalLineToRelative(-3.88f)
                verticalLineToRelative(-3.8f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(1.65f, -1.65f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(1.12f, -1.12f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, 0f)
                lineToRelative(3.17f, 3.17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.71f)
                close()
            }
        }.also { _Syringe = it}

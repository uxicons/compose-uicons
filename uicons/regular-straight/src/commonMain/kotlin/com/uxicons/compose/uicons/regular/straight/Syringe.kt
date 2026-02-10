package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Syringe: ImageVector? = null

val Icons.Rs.Syringe: ImageVector
    get() = _Syringe ?: UXIcon(name = "Syringe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 7.32f)
                lineToRelative(1.43f, -1.4f)
                lineToRelative(-5.75f, -5.87f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(2.26f, 2.3f)
                lineToRelative(-2.18f, 2.04f)
                lineToRelative(-0.91f, -0.91f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineToRelative(-8.71f, 8.71f)
                verticalLineToRelative(6f)
                lineToRelative(-2.96f, 2.96f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.96f, -2.96f)
                horizontalLineToRelative(6f)
                lineToRelative(8.71f, -8.71f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                lineToRelative(-0.84f, -0.84f)
                lineToRelative(2.16f, -2.02f)
                close()
                moveTo(17.71f, 10.88f)
                lineTo(9.59f, 19f)
                horizontalLineToRelative(-4.59f)
                verticalLineToRelative(-3.71f)
                lineToRelative(1.92f, 1.92f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.35f, -2.35f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.35f, -2.35f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.35f, -2.35f)
                lineToRelative(1.14f, -1.15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.42f, 0f)
                lineToRelative(3.17f, 3.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.42f)
                close()
            }
        }.also { _Syringe = it}

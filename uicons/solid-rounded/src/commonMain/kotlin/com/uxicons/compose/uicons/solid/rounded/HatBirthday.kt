package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatBirthday: ImageVector? = null

val Icons.Sr.HatBirthday: ImageVector
    get() = _HatBirthday ?: UXIcon(name = "HatBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.43f, 15.33f)
                lineTo(14.32f, 24f)
                lineTo(10.4f, 24f)
                lineToRelative(8.07f, -11.47f)
                close()
                moveTo(15.27f, 7.93f)
                lineTo(4.05f, 23.89f)
                arcTo(5.43f, 5.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.13f, 24f)
                lineTo(7.96f, 24f)
                lineToRelative(9.3f, -13.21f)
                close()
                moveTo(21.65f, 17.07f)
                lineTo(16.77f, 24f)
                horizontalLineToRelative(2.11f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.6f, 22.02f)
                arcToRelative(4.12f, 4.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.47f, -4.24f)
                close()
                moveTo(15f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.59f, 2.53f)
                lineTo(1.86f, 17.78f)
                arcTo(4.12f, 4.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, 22.02f)
                arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.81f, 1.01f)
                lineTo(14.05f, 6.18f)
                lineToRelative(-0.45f, -0.65f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3f)
                close()
            }
        }.also { _HatBirthday = it}

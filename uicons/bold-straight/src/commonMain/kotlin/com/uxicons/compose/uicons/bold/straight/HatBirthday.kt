package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatBirthday: ImageVector? = null

val Icons.Bs.HatBirthday: ImageVector
    get() = _HatBirthday ?: UXIcon(name = "HatBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.79f, 3.84f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.58f, 0f)
                lineTo(0f, 24.02f)
                lineTo(24f, 24.02f)
                close()
                moveTo(16.05f, 15.88f)
                lineTo(13.14f, 21.02f)
                lineTo(10.69f, 21.02f)
                lineTo(14.8f, 13.63f)
                close()
                moveTo(12f, 8.59f)
                lineToRelative(1.08f, 1.95f)
                lineTo(7.26f, 21.02f)
                lineTo(5.1f, 21.02f)
                close()
            }
        }.also { _HatBirthday = it}

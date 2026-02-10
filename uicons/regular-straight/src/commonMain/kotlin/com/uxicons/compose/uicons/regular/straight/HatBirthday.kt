package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatBirthday: ImageVector? = null

val Icons.Rs.HatBirthday: ImageVector
    get() = _HatBirthday ?: UXIcon(name = "HatBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.7f, 24f)
                lineTo(13.47f, 5.6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.95f, 0f)
                lineTo(0.3f, 24f)
                close()
                moveTo(10.4f, 22f)
                lineTo(8.23f, 22f)
                lineToRelative(6.04f, -10.85f)
                lineToRelative(1.14f, 2.05f)
                close()
                moveTo(16.54f, 15.24f)
                lineTo(17.68f, 17.28f)
                lineTo(14.99f, 22f)
                lineTo(12.7f, 22f)
                close()
                moveTo(5.95f, 22f)
                lineTo(3.7f, 22f)
                lineTo(12f, 7.06f)
                lineToRelative(1.13f, 2.03f)
                close()
                moveTo(17.29f, 22f)
                lineTo(18.82f, 19.33f)
                lineTo(20.3f, 22f)
                close()
            }
        }.also { _HatBirthday = it}

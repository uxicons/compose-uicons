package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatBirthday: ImageVector? = null

val Icons.Ss.HatBirthday: ImageVector
    get() = _HatBirthday ?: UXIcon(name = "HatBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.03f, 12f)
                lineTo(10.21f, 24f)
                lineTo(6.18f, 24f)
                lineTo(14.94f, 8.24f)
                close()
                moveTo(18.17f, 14.05f)
                lineTo(12.51f, 24f)
                lineTo(16.7f, 24f)
                lineToRelative(3.55f, -6.21f)
                close()
                moveTo(21.39f, 19.84f)
                lineTo(19.01f, 24f)
                lineTo(23.7f, 24f)
                close()
                moveTo(12.54f, 3.92f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.08f, 0f)
                lineTo(0.3f, 24f)
                lineTo(3.89f, 24f)
                lineTo(13.8f, 6.18f)
                close()
            }
        }.also { _HatBirthday = it}

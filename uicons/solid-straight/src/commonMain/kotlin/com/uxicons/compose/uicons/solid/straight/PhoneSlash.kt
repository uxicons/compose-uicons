package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneSlash: ImageVector? = null

val Icons.Ss.PhoneSlash: ImageVector
    get() = _PhoneSlash ?: UXIcon(name = "PhoneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 1.46f)
                lineToRelative(-22.5f, 22.5f)
                lineTo(0.04f, 22.54f)
                lineToRelative(4.78f, -4.78f)
                curveTo(1.79f, 14.5f, 0f, 10.74f, 0f, 7.5f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.72f, 3.29f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.26f)
                lineTo(7.03f, 10.51f)
                arcToRelative(13.47f, 13.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.93f, 3.12f)
                lineTo(22.54f, 0.04f)
                close()
                moveTo(13.48f, 16.98f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.46f, -0.76f)
                lineTo(7.78f, 20.46f)
                curveTo(10.7f, 22.69f, 13.84f, 24f, 16.5f, 24f)
                arcToRelative(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.21f, -1.72f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(-6.26f, -6.26f)
                close()
            }
        }.also { _PhoneSlash = it}

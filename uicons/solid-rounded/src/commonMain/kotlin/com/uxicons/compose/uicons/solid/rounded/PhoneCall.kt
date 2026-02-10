package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCall: ImageVector? = null

val Icons.Sr.PhoneCall: ImageVector
    get() = _PhoneCall ?: UXIcon(name = "PhoneCall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 11f)
                close()
                moveTo(20f, 10f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(22.18f, 22.16f)
                lineTo(23.09f, 21.11f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.38f)
                curveToRelative(-0.03f, -0.03f, -2.44f, -1.88f, -2.44f, -1.88f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 0.01f)
                lineToRelative(-1.91f, 1.61f)
                arcTo(12.78f, 12.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.54f, 9.52f)
                lineToRelative(1.6f, -1.9f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -4.28f)
                reflectiveCurveTo(7.29f, 0.94f, 7.26f, 0.91f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.93f, 0.86f)
                lineToRelative(-1.15f, 1f)
                curveTo(-5.01f, 9.74f, 9.62f, 24.26f, 17.76f, 24f)
                arcTo(6.16f, 6.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.18f, 22.16f)
                close()
            }
        }.also { _PhoneCall = it}

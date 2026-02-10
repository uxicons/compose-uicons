package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCall: ImageVector? = null

val Icons.Ss.PhoneCall: ImageVector
    get() = _PhoneCall ?: UXIcon(name = "PhoneCall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.61f, 12.85f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 24f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.72f, 3.29f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.26f)
                lineTo(7.03f, 10.51f)
                arcTo(12.14f, 12.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.48f, 16.98f)
                close()
                moveTo(22f, 10f)
                horizontalLineToRelative(2f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 0f)
                lineTo(14f, 2f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(2f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                lineTo(14f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                close()
            }
        }.also { _PhoneCall = it}

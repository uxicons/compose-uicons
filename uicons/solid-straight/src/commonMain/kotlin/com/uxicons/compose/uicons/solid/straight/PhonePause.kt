package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePause: ImageVector? = null

val Icons.Ss.PhonePause: ImageVector
    get() = _PhonePause ?: UXIcon(name = "PhonePause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.88f, 19.11f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 24f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.72f, 3.29f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.26f)
                lineTo(7.03f, 10.51f)
                arcToRelative(12.13f, 12.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.45f, 6.47f)
                lineToRelative(4.13f, -4.13f)
                close()
                moveTo(22f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _PhonePause = it}

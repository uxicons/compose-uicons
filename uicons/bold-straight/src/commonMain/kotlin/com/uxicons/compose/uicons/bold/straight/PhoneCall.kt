package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCall: ImageVector? = null

val Icons.Bs.PhoneCall: ImageVector
    get() = _PhoneCall ?: UXIcon(name = "PhoneCall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                lineTo(21f, 10f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -7f)
                lineTo(14f, 0f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10f)
                close()
                moveTo(14f, 5f)
                lineTo(14f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(3f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 5f)
                close()
                moveTo(20.27f, 22.23f)
                lineTo(23.91f, 18.59f)
                lineToRelative(-6.64f, -6.64f)
                lineTo(14.3f, 14.92f)
                arcTo(10.7f, 10.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.09f, 9.69f)
                lineToRelative(2.96f, -2.96f)
                lineTo(5.41f, 0.09f)
                lineTo(1.77f, 3.73f)
                arcTo(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.06f)
                curveTo(0f, 15.21f, 8.79f, 24f, 15.94f, 24f)
                arcTo(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.27f, 22.23f)
                close()
                moveTo(7.81f, 6.73f)
                lineTo(5.54f, 9f)
                lineToRelative(0.37f, 0.92f)
                arcToRelative(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.2f, 8.18f)
                lineToRelative(0.91f, 0.35f)
                lineToRelative(2.25f, -2.26f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(-1.52f, 1.52f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, 0.89f)
                curveTo(10.95f, 21f, 3f, 13.93f, 3f, 8.06f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, -2.2f)
                lineTo(5.41f, 4.33f)
                close()
            }
        }.also { _PhoneCall = it}

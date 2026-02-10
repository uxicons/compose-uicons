package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallOutgoing: ImageVector? = null

val Icons.Rs.CallOutgoing: ImageVector
    get() = _CallOutgoing ?: UXIcon(name = "CallOutgoing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.2f, 16.26f)
                arcTo(12.15f, 12.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 9.79f)
                lineToRelative(3.41f, -3.41f)
                lineTo(4.89f, 0.12f)
                lineTo(1.72f, 3.29f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.5f)
                curveTo(0f, 14.75f, 9.25f, 24f, 16.5f, 24f)
                arcToRelative(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.21f, -1.72f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(-6.26f, -6.26f)
                close()
                moveTo(19.29f, 20.87f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 22f)
                curveTo(10.27f, 22f, 2f, 13.73f, 2f, 7.5f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.13f, 4.71f)
                lineTo(4.89f, 2.95f)
                lineTo(8.32f, 6.39f)
                lineTo(5.39f, 9.32f)
                lineToRelative(0.25f, 0.61f)
                arcToRelative(14.37f, 14.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.45f, 8.44f)
                lineToRelative(0.61f, 0.23f)
                lineToRelative(2.93f, -2.93f)
                lineToRelative(3.44f, 3.44f)
                close()
                moveTo(24f, 2.5f)
                lineTo(24f, 7f)
                lineTo(22f, 7f)
                lineTo(22f, 3.44f)
                lineTo(16.41f, 9.03f)
                lineTo(15f, 7.62f)
                lineTo(20.61f, 2f)
                lineTo(17f, 2f)
                lineTo(17f, 0f)
                horizontalLineToRelative(4.53f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 2.5f)
                close()
            }
        }.also { _CallOutgoing = it}

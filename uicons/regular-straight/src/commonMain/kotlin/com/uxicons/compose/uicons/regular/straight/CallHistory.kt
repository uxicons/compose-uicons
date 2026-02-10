package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallHistory: ImageVector? = null

val Icons.Rs.CallHistory: ImageVector
    get() = _CallHistory ?: UXIcon(name = "CallHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 24f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.72f, 3.29f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.26f)
                lineTo(7.75f, 9.79f)
                arcTo(12.14f, 12.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.2f, 16.26f)
                lineToRelative(3.41f, -3.41f)
                lineToRelative(6.27f, 6.26f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 24f)
                close()
                moveTo(4.89f, 2.95f)
                lineTo(3.13f, 4.71f)
                arcTo(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7.5f)
                curveTo(2f, 13.73f, 10.27f, 22f, 16.5f, 22f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.79f, -1.13f)
                lineToRelative(1.76f, -1.76f)
                lineToRelative(-3.44f, -3.44f)
                lineTo(14.69f, 18.6f)
                lineToRelative(-0.61f, -0.23f)
                arcTo(14.37f, 14.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.63f, 9.94f)
                lineToRelative(-0.25f, -0.61f)
                lineTo(8.32f, 6.39f)
                close()
                moveTo(17.19f, 10.69f)
                lineTo(18.56f, 9.32f)
                lineTo(17f, 7.76f)
                lineTo(17f, 5f)
                lineTo(15f, 5f)
                lineTo(15f, 8.5f)
                close()
                moveTo(11.56f, 3.97f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.46f, 8.46f)
                lineToRelative(1.41f, 1.41f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.15f, 2.56f)
                close()
            }
        }.also { _CallHistory = it}

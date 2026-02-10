package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBan: ImageVector? = null

val Icons.Rs.EnvelopeBan: ImageVector
    get() = _EnvelopeBan ?: UXIcon(name = "EnvelopeBan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.54f, -1.46f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                close()
                moveTo(21.12f, 7.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.41f, 0.58f)
                lineTo(21.7f, 3.72f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.12f, 7.12f)
                close()
                moveTo(16.88f, 2.88f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.28f, 2.3f)
                lineTo(16.3f, 6.28f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.88f, 2.88f)
                close()
                moveTo(24f, 9.9f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                horizontalLineToRelative(9.29f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                lineTo(3f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(2.53f, -2.53f)
                arcTo(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                curveToRelative(0.03f, 0f, 0.05f, 0f, 0.08f, 0f)
                lineToRelative(-3.54f, 3.54f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(2f, 9.07f)
                lineTo(2f, 22f)
                lineTo(22f, 22f)
                lineTo(22f, 11.32f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.95f, 9.95f)
                curveTo(23.97f, 9.93f, 23.98f, 9.91f, 24f, 9.9f)
                close()
            }
        }.also { _EnvelopeBan = it}

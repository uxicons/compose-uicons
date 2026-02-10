package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBan: ImageVector? = null

val Icons.Sr.EnvelopeBan: ImageVector
    get() = _EnvelopeBan ?: UXIcon(name = "EnvelopeBan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 11f)
                curveToRelative(7.27f, -0.23f, 7.27f, -10.77f, 0f, -11f)
                curveTo(11.23f, 0.23f, 11.23f, 10.77f, 18.5f, 11f)
                close()
                moveTo(18.5f, 9f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.65f, -0.43f)
                lineToRelative(4.72f, -4.72f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 9f)
                close()
                moveTo(18.5f, 2f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.65f, 0.43f)
                lineTo(15.43f, 7.15f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 2f)
                close()
                moveTo(18.5f, 13f)
                arcTo(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 10.59f)
                lineTo(24f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                lineTo(5f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                lineTo(0f, 8f)
                curveToRelative(0f, -0.16f, 0.03f, -0.3f, 0.05f, -0.46f)
                lineTo(8.46f, 15.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.07f, 0f)
                lineTo(18.5f, 13f)
                close()
                moveTo(9.88f, 14.55f)
                lineTo(0.74f, 5.41f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineToRelative(6.44f)
                arcToRelative(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.64f, 9.59f)
                lineToRelative(-1.95f, 1.95f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                close()
            }
        }.also { _EnvelopeBan = it}

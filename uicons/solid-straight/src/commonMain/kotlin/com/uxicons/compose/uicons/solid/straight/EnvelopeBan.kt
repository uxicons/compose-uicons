package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBan: ImageVector? = null

val Icons.Ss.EnvelopeBan: ImageVector
    get() = _EnvelopeBan ?: UXIcon(name = "EnvelopeBan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 11f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 5.5f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 11f)
                close()
                moveTo(18.5f, 9f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.65f, -0.43f)
                lineToRelative(4.72f, -4.72f)
                arcTo(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 9f)
                close()
                moveTo(18.5f, 2f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.65f, 0.43f)
                lineTo(15.43f, 7.15f)
                arcTo(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 2f)
                close()
                moveTo(9.88f, 14.55f)
                lineTo(0.22f, 4.89f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                horizontalLineToRelative(8.44f)
                arcToRelative(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.64f, 9.59f)
                lineToRelative(-1.95f, 1.95f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                close()
                moveTo(18.5f, 13f)
                arcTo(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 10.59f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 7.5f)
                lineTo(8.46f, 15.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.07f, 0f)
                lineTo(18.5f, 13f)
                close()
            }
        }.also { _EnvelopeBan = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBan: ImageVector? = null

val Icons.Bs.EnvelopeBan: ImageVector
    get() = _EnvelopeBan ?: UXIcon(name = "EnvelopeBan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 13f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11f, 6.5f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 13f)
                close()
                moveTo(17.5f, 10f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.16f, -0.21f)
                lineToRelative(4.45f, -4.45f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 10f)
                close()
                moveTo(17.5f, 3f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.16f, 0.21f)
                lineToRelative(-4.45f, 4.45f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 3f)
                close()
                moveTo(24f, 11.97f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                lineTo(9.76f, 3f)
                arcToRelative(8.44f, 8.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.74f, 3f)
                lineTo(3.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineToRelative(0.46f)
                lineToRelative(7.36f, 7.36f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.28f, 0f)
                lineToRelative(0.17f, -0.17f)
                arcToRelative(8.44f, 8.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.4f, 0.84f)
                lineTo(15.76f, 16.44f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.52f, 0f)
                lineTo(3f, 11.2f)
                lineTo(3f, 21f)
                lineTo(21f, 21f)
                lineTo(21f, 14.24f)
                arcTo(8.55f, 8.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.97f)
                close()
            }
        }.also { _EnvelopeBan = it}

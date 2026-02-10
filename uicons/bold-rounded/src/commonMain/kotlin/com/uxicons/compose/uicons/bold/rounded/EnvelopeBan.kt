package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBan: ImageVector? = null

val Icons.Br.EnvelopeBan: ImageVector
    get() = _EnvelopeBan ?: UXIcon(name = "EnvelopeBan") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 15.5f)
            verticalLineToRelative(3f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            lineTo(5.5f, 24f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.5f)
            lineTo(0f, 8.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            horizontalLineToRelative(2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-2f)
            arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.3f, 7.34f)
            lineToRelative(6.93f, 6.93f)
            arcToRelative(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.98f, 0.42f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, 2.62f)
            arcToRelative(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.55f, -0.92f)
            lineTo(3f, 11.28f)
            lineTo(3f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            verticalLineToRelative(-3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 15.5f)
            close()
            moveTo(11f, 6.5f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 0f)
            curveToRelative(8.6f, 0.3f, 8.6f, 12.7f, 0f, 13f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6.5f)
            close()
            moveTo(21f, 6.5f)
            arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.21f, -1.16f)
            lineToRelative(-4.45f, 4.45f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6.5f)
            close()
            moveTo(14f, 6.5f)
            arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.21f, 1.16f)
            lineToRelative(4.45f, -4.45f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6.5f)
            close()
        }
    }.also { _EnvelopeBan = it }

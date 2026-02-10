package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spade: ImageVector? = null

val Icons.Br.Spade: ImageVector
    get() = _Spade ?: UXIcon(name = "Spade") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 12.3f)
            curveToRelative(0f, -3.96f, -4.02f, -7.96f, -7.52f, -11f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.97f, 0f)
            curveTo(5.02f, 4.34f, 1f, 8.34f, 1f, 12.3f)
            arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.25f, 19f)
            arcToRelative(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.13f, -1.01f)
            curveTo(10.14f, 19.47f, 9.42f, 21f, 7.5f, 21f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.71f, 0f, -2.51f, -1.53f, -2.83f, -2.97f)
            arcTo(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.75f, 19f)
            arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 12.3f)
            close()
            moveTo(13.4f, 12.97f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.81f, 0f)
            curveTo(10.58f, 13f, 9.4f, 16f, 7.25f, 16f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12.3f)
            curveTo(4f, 9.2f, 8.88f, 4.96f, 10.48f, 3.57f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.04f, 0f)
            curveTo(15.12f, 4.96f, 20f, 9.2f, 20f, 12.3f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.75f, 16f)
            curveTo(14.59f, 16f, 13.41f, 13f, 13.4f, 12.97f)
            close()
        }
    }.also { _Spade = it }

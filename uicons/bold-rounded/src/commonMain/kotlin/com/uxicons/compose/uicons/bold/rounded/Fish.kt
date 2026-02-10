package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fish: ImageVector? = null

val Icons.Br.Fish: ImageVector
    get() = _Fish ?: UXIcon(name = "Fish") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.65f, 5.25f)
            arcToRelative(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.08f, -1.82f)
            arcTo(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 0.35f)
            arcTo(1.72f, 1.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 1.72f)
            lineTo(16f, 7f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(25.64f, 25.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 0.38f)
            lineTo(11f, 7.2f)
            arcTo(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.49f, 5.03f)
            arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.48f, 6.48f)
            arcToRelative(13.3f, 13.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 7.9f)
            arcToRelative(4.28f, 4.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.26f, 3.34f)
            arcToRelative(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 1.25f)
            curveToRelative(4.2f, -0.33f, 8.77f, -1.92f, 11.12f, -7f)
            horizontalLineToRelative(1.33f)
            curveToRelative(2.48f, 0.08f, 3.28f, -3.88f, 0.47f, -4f)
            horizontalLineToRelative(-0.59f)
            arcTo(25.23f, 25.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 8.5f)
            lineTo(17f, 8f)
            horizontalLineToRelative(5.29f)
            arcTo(1.72f, 1.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.65f, 5.25f)
            close()
            moveTo(4.5f, 21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 21f)
            close()
            moveTo(9.3f, 19.57f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.89f, -4.88f)
            curveToRelative(1.68f, -2.85f, 4.84f, -4.38f, 9.55f, -4.65f)
            curveTo(13.69f, 14.73f, 12.15f, 17.88f, 9.3f, 19.57f)
            close()
        }
    }.also { _Fish = it }

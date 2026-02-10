package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Care: ImageVector? = null

val Icons.Br.Care: ImageVector
    get() = _Care ?: UXIcon(name = "Care") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2.75f)
            curveToRelative(0f, 2.16f, -2.82f, 4.85f, -4.22f, 5.98f)
            arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.55f, 0f)
            curveTo(8.82f, 7.6f, 6f, 4.91f, 6f, 2.75f)
            arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 0f)
            arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2.75f)
            arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 0f)
            arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2.75f)
            close()
            moveTo(17.82f, 20.41f)
            lineTo(23.02f, 14.47f)
            arcToRelative(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.77f, -5.2f)
            lineToRelative(-2.44f, 2.68f)
            arcTo(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.36f, 11f)
            lineTo(4.5f, 11f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.5f)
            verticalLineToRelative(4f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 24f)
            lineTo(9.91f, 24f)
            arcTo(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.82f, 20.41f)
            close()
            moveTo(12.36f, 14f)
            arcToRelative(0.64f, 0.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, 1.28f)
            lineToRelative(-5.16f, 0.74f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.42f, 2.97f)
            lineToRelative(5.16f, -0.74f)
            arcToRelative(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.09f, -3.12f)
            lineToRelative(3.5f, -3.84f)
            arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, -0.06f)
            arcToRelative(0.89f, 0.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, 1.25f)
            lineToRelative(-5.21f, 5.96f)
            arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.91f, 21f)
            lineTo(4.5f, 21f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19.5f)
            verticalLineToRelative(-4f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 14f)
            close()
        }
    }.also { _Care = it }

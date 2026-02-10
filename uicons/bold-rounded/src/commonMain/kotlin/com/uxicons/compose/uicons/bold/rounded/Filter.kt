package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filter: ImageVector? = null

val Icons.Br.Filter: ImageVector
    get() = _Filter ?: UXIcon(name = "Filter") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.5f, 24f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.77f, -0.21f)
            lineToRelative(-5f, -3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.73f, -1.29f)
            verticalLineToRelative(-5.17f)
            lineToRelative(-5.97f, -7.3f)
            arcToRelative(4.2f, 4.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.03f, -2.78f)
            arcToRelative(4.26f, 4.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.25f, -4.25f)
            horizontalLineToRelative(13.49f)
            arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.18f, 7.08f)
            lineToRelative(-5.93f, 7.3f)
            verticalLineToRelative(8.12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            close()
            moveTo(11f, 18.65f)
            lineTo(13f, 19.85f)
            verticalLineToRelative(-6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.34f, -0.95f)
            lineToRelative(6.3f, -7.77f)
            arcToRelative(1.31f, 1.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, -0.88f)
            arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.25f, -1.25f)
            horizontalLineToRelative(-13.49f)
            arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.94f, 2.09f)
            lineToRelative(6.35f, 7.76f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.34f, 0.95f)
            close()
        }
    }.also { _Filter = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocationAlt: ImageVector? = null

val Icons.Br.HomeLocationAlt: ImageVector
    get() = _HomeLocationAlt ?: UXIcon(name = "HomeLocationAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 9.92f)
            lineTo(24f, 18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            lineTo(21f, 9.92f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.1f, -2.07f)
            lineTo(13.3f, 3.4f)
            arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.59f, 0f)
            lineTo(4.1f, 7.85f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.92f)
            lineTo(3f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.5f)
            lineTo(0f, 9.92f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.42f, -4.56f)
            lineTo(9.03f, 0.91f)
            arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.95f, 0f)
            lineToRelative(6.6f, 4.45f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 9.92f)
            close()
            moveTo(19f, 15f)
            arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.05f, 4.95f)
            lineToRelative(-3.59f, 3.52f)
            arcToRelative(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.71f, 0f)
            lineTo(7.06f, 19.96f)
            arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 15f)
            close()
            moveTo(16f, 15f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6.83f, 2.83f)
            lineTo(12f, 20.6f)
            lineToRelative(2.84f, -2.78f)
            arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 15f)
            close()
            moveTo(12f, 13f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
            close()
        }
    }.also { _HomeLocationAlt = it }

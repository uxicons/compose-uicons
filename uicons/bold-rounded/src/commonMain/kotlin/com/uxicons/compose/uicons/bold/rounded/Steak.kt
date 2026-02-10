package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Steak: ImageVector? = null

val Icons.Br.Steak: ImageVector
    get() = _Steak ?: UXIcon(name = "Steak") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 24f)
            arcToRelative(6.09f, 6.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.97f, -2.4f)
            arcTo(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
            curveToRelative(-4.88f, 0f, -9f, -4.54f, -9f, -9.91f)
            arcTo(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.09f, 0f)
            curveTo(19.8f, 0f, 24f, 11.42f, 24f, 17.25f)
            arcTo(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.25f, 24f)
            close()
            moveTo(10.09f, 3f)
            arcTo(7.1f, 7.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10.09f)
            curveTo(3f, 14.16f, 6.16f, 17f, 9f, 17f)
            arcToRelative(6.68f, 6.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.48f, 2.56f)
            arcTo(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 21f)
            arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17.25f)
            curveTo(21f, 13.06f, 17.86f, 3f, 10.09f, 3f)
            close()
            moveTo(8.06f, 12.06f)
            lineTo(12.06f, 8.06f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.94f, 5.94f)
            lineToRelative(-4f, 4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            close()
            moveTo(12.02f, 15.09f)
            lineTo(16.06f, 11.06f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.12f, -2.12f)
            lineTo(9.9f, 12.96f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.12f, 2.12f)
            close()
            moveTo(17.06f, 17.06f)
            lineTo(18.06f, 16.06f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineToRelative(-1f, 1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            close()
        }
    }.also { _Steak = it }

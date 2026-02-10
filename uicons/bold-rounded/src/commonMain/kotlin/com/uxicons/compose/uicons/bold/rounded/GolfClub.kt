package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfClub: ImageVector? = null

val Icons.Br.GolfClub: ImageVector
    get() = _GolfClub ?: UXIcon(name = "GolfClub") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.02f, 24f)
            horizontalLineTo(6.49f)
            arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, -6.5f)
            verticalLineTo(15.54f)
            arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.76f, 9.16f)
            lineTo(19.2f, 11.44f)
            lineTo(20.8f, 1.26f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.96f, 0.47f)
            lineToRelative(-2.2f, 13.92f)
            arcToRelative(9.53f, 9.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.68f, 2.55f)
            arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.02f, 24f)
            close()
            moveTo(6.49f, 12.04f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
            verticalLineTo(17.5f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 3.5f)
            horizontalLineToRelative(5.53f)
            arcToRelative(6.7f, 6.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.13f, -4f)
            arcTo(6.81f, 6.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 15.21f)
            lineToRelative(0.13f, -0.8f)
            lineTo(7.17f, 12.1f)
            arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.49f, 12.04f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.06f, 18.25f)
            arcToRelative(1.45f, 1.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.31f, -0.03f)
            lineToRelative(-6.32f, -1.31f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.61f, -2.94f)
            lineToRelative(6.32f, 1.31f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, 2.97f)
            close()
        }
    }.also { _GolfClub = it }

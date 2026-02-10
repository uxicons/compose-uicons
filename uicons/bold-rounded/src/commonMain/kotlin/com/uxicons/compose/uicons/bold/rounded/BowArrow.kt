package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowArrow: ImageVector? = null

val Icons.Br.BowArrow: ImageVector
    get() = _BowArrow ?: UXIcon(name = "BowArrow") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 0f)
            horizontalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1.38f)
            lineTo(16.18f, 5.69f)
            arcTo(12.66f, 12.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.55f, 5.02f)
            arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.02f, 7.53f)
            arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.99f, 2.8f)
            lineTo(6.28f, 15.6f)
            lineTo(4.88f, 17f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(0.38f)
            lineToRelative(-0.44f, 0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineTo(4f, 22.12f)
            verticalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(19.12f)
            lineToRelative(1.4f, -1.4f)
            lineToRelative(5.27f, 5.27f)
            arcTo(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.11f, 24f)
            arcToRelative(3.47f, 3.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.37f, -0.02f)
            arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -1.53f)
            arcToRelative(12.66f, 12.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, -14.64f)
            lineTo(21f, 5.12f)
            verticalLineTo(6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-3f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 0f)
            close()
            moveTo(3.13f, 8.21f)
            arcTo(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7.84f)
            arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, -0.3f)
            arcToRelative(9.53f, 9.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.2f, -1.53f)
            arcToRelative(9.66f, 9.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 1.83f)
            lineTo(8.4f, 13.48f)
            close()
            moveTo(16.46f, 20.82f)
            arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, 0.18f)
            arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.36f, -0.13f)
            lineTo(10.52f, 15.6f)
            lineToRelative(5.64f, -5.64f)
            arcTo(9.65f, 9.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.46f, 20.82f)
            close()
        }
    }.also { _BowArrow = it }

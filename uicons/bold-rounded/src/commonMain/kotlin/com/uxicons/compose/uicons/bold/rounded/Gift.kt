package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gift: ImageVector? = null

val Icons.Br.Gift: ImageVector
    get() = _Gift ?: UXIcon(name = "Gift") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 7f)
            horizontalLineToRelative(-0.59f)
            arcTo(5.81f, 5.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            curveToRelative(0f, 2.17f, -1.82f, 2.99f, -3.28f, 3.31f)
            arcTo(8.62f, 8.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
            arcToRelative(8.62f, 8.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.28f, 3.81f)
            curveTo(8.82f, 6.49f, 7f, 5.67f, 7f, 3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcTo(5.81f, 5.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.09f, 7f)
            lineTo(4.5f, 7f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.5f)
            verticalLineToRelative(1f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.45f)
            verticalLineToRelative(3.73f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.32f, 24f)
            horizontalLineToRelative(9.36f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18.68f)
            lineTo(22f, 14.95f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12.5f)
            verticalLineToRelative(-1f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 7f)
            close()
            moveTo(21f, 11.5f)
            lineTo(21f, 12f)
            lineTo(13.5f, 12f)
            lineTo(13.5f, 10f)
            horizontalLineToRelative(6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11.5f)
            close()
            moveTo(3f, 11.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 10f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(2f)
            lineTo(3f, 12f)
            close()
            moveTo(5f, 18.68f)
            lineTo(5f, 15f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(6f)
            lineTo(7.32f, 21f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 18.68f)
            close()
            moveTo(16.68f, 21f)
            lineTo(13.5f, 21f)
            lineTo(13.5f, 15f)
            lineTo(19f, 15f)
            verticalLineToRelative(3.68f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.68f, 21f)
            close()
        }
    }.also { _Gift = it }

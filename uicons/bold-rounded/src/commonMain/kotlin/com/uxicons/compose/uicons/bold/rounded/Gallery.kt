package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gallery: ImageVector? = null

val Icons.Br.Gallery: ImageVector
    get() = _Gallery ?: UXIcon(name = "Gallery") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            horizontalLineToRelative(-5f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.02f, 5.21f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.5f)
            verticalLineToRelative(3f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 18.5f)
            verticalLineToRelative(-0.21f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.92f, -4.38f)
            arcTo(5.16f, 5.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 8.5f)
            verticalLineToRelative(-3f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
            close()
            moveTo(3f, 15.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 13f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15.5f)
            verticalLineToRelative(0.2f)
            lineToRelative(-2.12f, 2.12f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.42f, 0f)
            lineTo(9f, 17.34f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.35f, -0.06f)
            lineToRelative(-3.7f, 3.18f)
            arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            close()
            moveTo(17f, 13f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.02f, 2.01f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 10f)
            lineTo(7.05f, 10f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 8f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10.5f)
            close()
            moveTo(21f, 8.5f)
            arcToRelative(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 2.23f)
            lineTo(20f, 10.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 5f)
            lineTo(11.05f, 5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 3f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.5f)
            close()
            moveTo(4f, 15.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.5f, 17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15.5f)
            close()
        }
    }.also { _Gallery = it }

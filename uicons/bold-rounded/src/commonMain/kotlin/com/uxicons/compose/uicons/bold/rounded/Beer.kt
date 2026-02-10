package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beer: ImageVector? = null

val Icons.Br.Beer: ImageVector
    get() = _Beer ?: UXIcon(name = "Beer") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 9f)
            lineTo(19f, 9f)
            lineTo(19f, 5.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 4f)
            lineTo(16.29f, 4f)
            arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, -1.6f)
            arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.2f, 2.01f)
            arcTo(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.76f, 1.4f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.95f, 0.62f)
            arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.69f, 4f)
            lineTo(1.5f, 4f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(8f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.29f, -4f)
            lineTo(20f, 20f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
            lineTo(24f, 13f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9f)
            close()
            moveTo(16f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 21f)
            horizontalLineToRelative(-8f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            lineTo(3f, 7f)
            horizontalLineToRelative(0.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8.5f)
            lineTo(5f, 13f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            lineTo(9f, 8.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 7f)
            lineTo(16f, 7f)
            close()
            moveTo(21f, 16f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            lineTo(19f, 17f)
            lineTo(19f, 12f)
            horizontalLineToRelative(1f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
            close()
        }
    }.also { _Beer = it }

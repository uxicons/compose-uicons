package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smartphone: ImageVector? = null

val Icons.Br.Smartphone: ImageVector
    get() = _Smartphone ?: UXIcon(name = "Smartphone") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 0f)
            horizontalLineToRelative(-5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 24f)
            horizontalLineToRelative(5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18.5f)
            lineTo(20f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 0f)
            close()
            moveTo(9.5f, 3f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 5.5f)
            lineTo(17f, 18f)
            lineTo(7f, 18f)
            lineTo(7f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 3f)
            close()
            moveTo(12f, 22f)
            horizontalLineToRelative(0f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            horizontalLineToRelative(0f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
            horizontalLineToRelative(0f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
            horizontalLineToRelative(0f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
            close()
        }
    }.also { _Smartphone = it }

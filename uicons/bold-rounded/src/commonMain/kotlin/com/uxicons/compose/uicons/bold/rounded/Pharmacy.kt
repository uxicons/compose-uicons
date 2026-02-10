package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pharmacy: ImageVector? = null

val Icons.Br.Pharmacy: ImageVector
    get() = _Pharmacy ?: UXIcon(name = "Pharmacy") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 24f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-4f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-4f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(4f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
            close()
            moveTo(4f, 11f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
            horizontalLineToRelative(5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
            verticalLineToRelative(-5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
            horizontalLineToRelative(5.5f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
            horizontalLineToRelative(-5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
            verticalLineToRelative(-5.5f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
            verticalLineToRelative(5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            close()
        }
    }.also { _Pharmacy = it }

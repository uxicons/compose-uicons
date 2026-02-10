package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pharmacy: ImageVector? = null

val Icons.Sr.Pharmacy: ImageVector
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
            }
        }.also { _Pharmacy = it}

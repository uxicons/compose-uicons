package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frown: ImageVector? = null

val Icons.Ss.Frown: ImageVector
    get() = _Frown ?: UXIcon(name = "Frown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(1f)
                lineTo(6f, 11f)
                close()
                moveTo(17f, 18f)
                lineTo(7f, 18f)
                curveToRelative(0f, -2f, 2.03f, -5f, 5.01f, -5f)
                arcTo(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18f)
                close()
                moveTo(14f, 11f)
                lineTo(14f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Frown = it}

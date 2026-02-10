package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frown: ImageVector? = null

val Icons.Sr.Frown: ImageVector
    get() = _Frown ?: UXIcon(name = "Frown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                curveToRelative(0f, 1f, -0.9f, 1f, -2f, 1f)
                reflectiveCurveTo(6f, 11f, 6f, 10f)
                close()
                moveTo(16.01f, 18f)
                lineTo(8f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.96f, -1.28f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 13f)
                arcToRelative(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.97f, 3.71f)
                arcTo(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.01f, 18f)
                close()
                moveTo(16f, 11f)
                curveToRelative(-1.1f, 0f, -2f, 0f, -2f, -1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                curveTo(18f, 11f, 17.11f, 11f, 16f, 11f)
                close()
            }
        }.also { _Frown = it}

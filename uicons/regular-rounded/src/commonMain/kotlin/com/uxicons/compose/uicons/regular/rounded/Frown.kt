package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frown: ImageVector? = null

val Icons.Rr.Frown: ImageVector
    get() = _Frown ?: UXIcon(name = "Frown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
                moveTo(16.01f, 18f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.96f, -1.28f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 13f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.97f, 3.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 18f)
                close()
                moveTo(6f, 10f)
                curveToRelative(0f, 1f, 0.9f, 1f, 2f, 1f)
                reflectiveCurveToRelative(2f, 0f, 2f, -1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                close()
                moveTo(14f, 10f)
                curveToRelative(0f, 1f, 0.9f, 1f, 2f, 1f)
                reflectiveCurveToRelative(2f, 0f, 2f, -1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                close()
            }
        }.also { _Frown = it}

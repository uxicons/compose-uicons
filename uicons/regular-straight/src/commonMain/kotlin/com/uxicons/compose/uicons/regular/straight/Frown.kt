package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frown: ImageVector? = null

val Icons.Rs.Frown: ImageVector
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
                moveTo(17f, 18f)
                curveToRelative(0f, -2f, -2f, -5f, -4.99f, -5f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.95f, 18f)
                close()
                moveTo(6f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                lineTo(10f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                close()
                moveTo(14f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                lineTo(18f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                close()
            }
        }.also { _Frown = it}

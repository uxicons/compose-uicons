package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongue: ImageVector? = null

val Icons.Rs.GrinTongue: ImageVector
    get() = _GrinTongue ?: UXIcon(name = "GrinTongue") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(7f, 16f)
                lineTo(9f, 16f)
                verticalLineToRelative(0.6f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3.4f)
                lineTo(15f, 16f)
                horizontalLineToRelative(2f)
                lineTo(17f, 14f)
                lineTo(7f, 14f)
                close()
                moveTo(13f, 16.6f)
                curveToRelative(0f, 0.66f, -0.41f, 1.4f, -1f, 1.4f)
                reflectiveCurveToRelative(-1f, -0.74f, -1f, -1.4f)
                lineTo(11f, 16f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9.5f)
                close()
                moveTo(17f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9.5f)
                close()
            }
        }.also { _GrinTongue = it}

package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Happy: ImageVector? = null

val Icons.Rs.Happy: ImageVector
    get() = _Happy ?: UXIcon(name = "Happy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
                moveTo(17.67f, 15.75f)
                lineTo(16.34f, 14.25f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.33f, -1.75f)
                lineTo(6.33f, 15.75f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.67f, 15.75f)
                close()
                moveTo(10f, 11f)
                lineTo(10f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                verticalLineToRelative(1f)
                close()
                moveTo(14f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                lineTo(18f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                close()
            }
        }.also { _Happy = it}

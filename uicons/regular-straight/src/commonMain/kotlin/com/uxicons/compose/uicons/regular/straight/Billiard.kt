package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Billiard: ImageVector? = null

val Icons.Rs.Billiard: ImageVector
    get() = _Billiard ?: UXIcon(name = "Billiard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 12f)
                close()
                moveTo(12f, 2f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 10f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, -10f)
                close()
                moveTo(12f, 20f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -8f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                close()
                moveTo(12f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                close()
                moveTo(15f, 10.45f)
                verticalLineToRelative(-1.45f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.46f)
                lineToRelative(-2.35f, 4.54f)
                lineToRelative(1.78f, 0.92f)
                close()
            }
        }.also { _Billiard = it}

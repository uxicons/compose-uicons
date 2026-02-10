package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interrogation: ImageVector? = null

val Icons.Rs.Interrogation: ImageVector
    get() = _Interrogation ?: UXIcon(name = "Interrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 15f)
                horizontalLineTo(11f)
                verticalLineToRelative(-0.74f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.96f, -3.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -2.12f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.59f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9f)
                horizontalLineTo(8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.93f, 3.5f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 14.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Interrogation = it}

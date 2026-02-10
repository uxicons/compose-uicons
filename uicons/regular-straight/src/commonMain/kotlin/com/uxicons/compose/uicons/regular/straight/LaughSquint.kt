package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughSquint: ImageVector? = null

val Icons.Rs.LaughSquint: ImageVector
    get() = _LaughSquint ?: UXIcon(name = "LaughSquint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(17.62f, 7.78f)
                lineTo(16.1f, 9f)
                lineToRelative(1.52f, 1.22f)
                lineToRelative(-1.25f, 1.56f)
                lineTo(12.9f, 9f)
                lineToRelative(3.48f, -2.78f)
                close()
                moveTo(6.38f, 10.22f)
                lineTo(7.9f, 9f)
                lineTo(6.38f, 7.78f)
                lineToRelative(1.25f, -1.56f)
                lineTo(11.1f, 9f)
                lineTo(7.62f, 11.78f)
                close()
                moveTo(16.99f, 14f)
                curveToRelative(0f, 2f, -2f, 5f, -4.99f, 5f)
                reflectiveCurveTo(7.04f, 16f, 6.99f, 14f)
                close()
            }
        }.also { _LaughSquint = it}

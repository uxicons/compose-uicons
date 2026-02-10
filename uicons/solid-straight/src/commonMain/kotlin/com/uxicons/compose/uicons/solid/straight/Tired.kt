package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tired: ImageVector? = null

val Icons.Ss.Tired: ImageVector
    get() = _Tired ?: UXIcon(name = "Tired") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(16.38f, 6.22f)
                lineTo(17.62f, 7.78f)
                lineTo(16.1f, 9f)
                lineToRelative(1.52f, 1.22f)
                lineToRelative(-1.25f, 1.56f)
                lineTo(12.9f, 9f)
                close()
                moveTo(6.38f, 7.78f)
                lineTo(7.62f, 6.22f)
                lineTo(11.1f, 9f)
                lineTo(7.62f, 11.78f)
                lineToRelative(-1.25f, -1.56f)
                lineTo(7.9f, 9f)
                close()
                moveTo(11.99f, 17f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 1f)
                curveToRelative(0.61f, -2.28f, 2.67f, -5f, 6.01f, -5f)
                reflectiveCurveToRelative(5.38f, 2.72f, 6f, 5f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.99f, 17f)
                close()
            }
        }.also { _Tired = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tomato: ImageVector? = null

val Icons.Ss.Tomato: ImageVector
    get() = _Tomato ?: UXIcon(name = "Tomato") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.6f, 5.0f)
                arcTo(4.9f, 4.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 1f)
                lineTo(16f, 1f)
                curveToRelative(0f, 1.24f, -1.13f, 2.55f, -3f, 2.9f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 3.9f)
                curveTo(9.13f, 3.55f, 8f, 2.23f, 8f, 1f)
                lineTo(6f, 1f)
                arcTo(4.9f, 4.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 5.0f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14f)
                curveToRelative(0f, 4.72f, 3.63f, 10f, 8.5f, 10f)
                horizontalLineToRelative(7f)
                curveToRelative(4.87f, 0f, 8.5f, -5.28f, 8.5f, -10f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.6f, 5.0f)
                close()
                moveTo(16.76f, 10.97f)
                arcTo(8.41f, 8.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.98f)
                arcTo(8.41f, 8.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 10.97f)
                lineTo(6.76f, 9.03f)
                arcTo(6.16f, 6.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.91f, 6f)
                horizontalLineToRelative(2.18f)
                arcToRelative(6.15f, 6.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.15f, 3.03f)
                close()
            }
        }.also { _Tomato = it}

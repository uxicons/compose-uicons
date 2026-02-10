package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlow: ImageVector? = null

val Icons.Bs.TachometerAltSlow: ImageVector
    get() = _TachometerAltSlow ?: UXIcon(name = "TachometerAltSlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.14f, 22.73f)
                lineTo(5.53f, 23f)
                lineTo(18.47f, 23f)
                lineToRelative(0.39f, -0.27f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                close()
                moveTo(17.5f, 20f)
                lineTo(6.5f, 20f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.5f, 20f)
                close()
                moveTo(14f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0.07f)
                lineTo(6.46f, 9.54f)
                lineTo(8.59f, 7.41f)
                lineToRelative(3.59f, 3.59f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
                moveTo(19f, 13f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.98f, 5.73f)
                lineToRelative(-1.73f, -2.46f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, -5.9f)
                lineTo(10.82f, 6.11f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13f)
                close()
                moveTo(9.71f, 16.27f)
                lineTo(7.98f, 18.73f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, -1.27f)
                reflectiveCurveTo(9.39f, 16.05f, 9.71f, 16.27f)
                close()
            }
        }.also { _TachometerAltSlow = it}

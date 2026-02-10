package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadTear: ImageVector? = null

val Icons.Ss.SadTear: ImageVector
    get() = _SadTear ?: UXIcon(name = "SadTear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(15.5f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 8f)
                close()
                moveTo(8f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                curveToRelative(0f, -1.59f, 2f, -3.6f, 2f, -3.6f)
                reflectiveCurveToRelative(2f, 1.97f, 2f, 3.6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                close()
                moveTo(8.5f, 11f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 11f)
                close()
                moveTo(16.34f, 17.75f)
                arcTo(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.46f, -1.96f)
                curveToRelative(2.83f, -0.41f, 6.17f, 2.15f, 6.12f, 2.22f)
                close()
            }
        }.also { _SadTear = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartConnected: ImageVector? = null

val Icons.Ss.ChartConnected: ImageVector
    get() = _ChartConnected ?: UXIcon(name = "ChartConnected") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.98f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.96f, -4f)
                arcTo(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 3.95f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.99f, 0f)
                arcTo(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.96f, 7.99f)
                arcToRelative(4.0f, 4.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, 7.99f)
                arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, 4.07f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.99f, 0f)
                arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, -4.07f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.98f)
                close()
                moveTo(15.48f, 18.06f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.96f, 0f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.59f, -2.6f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -6.96f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.58f, -2.57f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.96f, 0f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.58f, 2.57f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, 6.96f)
                arcTo(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.48f, 18.06f)
                close()
            }
        }.also { _ChartConnected = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileWink: ImageVector? = null

val Icons.Rr.SmileWink: ImageVector
    get() = _SmileWink ?: UXIcon(name = "SmileWink") {
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
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.33f, -1.49f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.33f, -1.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.33f, 1.49f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.67f, 15.75f)
                close()
                moveTo(14f, 10f)
                curveToRelative(0f, 1f, 0.9f, 1f, 2f, 1f)
                reflectiveCurveToRelative(2f, 0f, 2f, -1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                close()
                moveTo(11f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(7f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 10f)
                close()
            }
        }.also { _SmileWink = it}

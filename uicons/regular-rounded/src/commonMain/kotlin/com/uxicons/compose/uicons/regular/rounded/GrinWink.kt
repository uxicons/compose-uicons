package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinWink: ImageVector? = null

val Icons.Rr.GrinWink: ImageVector
    get() = _GrinWink ?: UXIcon(name = "GrinWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                curveToRelative(0f, 1f, -0.9f, 1f, -2f, 1f)
                reflectiveCurveToRelative(-2f, 0f, -2f, -1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
                moveTo(7f, 11f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(7f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 11f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                curveToRelative(-13.25f, 0.5f, -13.24f, 19.5f, 0f, 20f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                close()
                moveTo(16.79f, 14.02f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.05f, 1.52f)
                arcTo(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                arcToRelative(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.84f, -3.46f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.79f, 14.02f)
                close()
            }
        }.also { _GrinWink = it}

package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinAlt: ImageVector? = null

val Icons.Rr.GrinAlt: ImageVector
    get() = _GrinAlt ?: UXIcon(name = "GrinAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 9.5f)
                curveToRelative(0.04f, -3.29f, 2.96f, -3.29f, 3f, 0f)
                curveTo(9.96f, 12.79f, 7.04f, 12.79f, 7f, 9.5f)
                close()
                moveTo(15.5f, 12f)
                curveToRelative(1.96f, -0.03f, 1.96f, -4.97f, 0f, -5f)
                curveTo(13.54f, 7.03f, 13.54f, 11.97f, 15.5f, 12f)
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
        }.also { _GrinAlt = it}

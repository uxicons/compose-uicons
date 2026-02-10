package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinAlt: ImageVector? = null

val Icons.Sr.GrinAlt: ImageVector
    get() = _GrinAlt ?: UXIcon(name = "GrinAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(15.5f, 7f)
                curveToRelative(1.96f, 0.03f, 1.96f, 4.97f, 0f, 5f)
                curveTo(13.54f, 11.97f, 13.54f, 7.03f, 15.5f, 7f)
                close()
                moveTo(8.5f, 7f)
                curveToRelative(1.96f, 0.03f, 1.96f, 4.97f, 0f, 5f)
                curveTo(6.54f, 11.97f, 6.54f, 7.03f, 8.5f, 7f)
                close()
                moveTo(17.84f, 15.54f)
                arcTo(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.85f, -3.46f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcToRelative(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -0.98f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.84f, 15.54f)
                close()
            }
        }.also { _GrinAlt = it}

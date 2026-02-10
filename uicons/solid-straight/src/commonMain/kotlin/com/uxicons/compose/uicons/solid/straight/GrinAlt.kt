package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinAlt: ImageVector? = null

val Icons.Ss.GrinAlt: ImageVector
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
                moveTo(12.01f, 19f)
                curveTo(8.67f, 19f, 6.62f, 16.28f, 6f, 14f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
                arcToRelative(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.01f, -1f)
                curveTo(17.39f, 16.28f, 15.34f, 19f, 12.01f, 19f)
                close()
            }
        }.also { _GrinAlt = it}

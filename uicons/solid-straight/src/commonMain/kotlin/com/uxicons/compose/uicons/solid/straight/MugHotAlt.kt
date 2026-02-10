package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugHotAlt: ImageVector? = null

val Icons.Ss.MugHotAlt: ImageVector
    get() = _MugHotAlt ?: UXIcon(name = "MugHotAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.03f, 4f)
                horizontalLineToRelative(-2f)
                lineTo(13.03f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11.03f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(9.03f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7.03f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(5.03f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(0.01f, 24f)
                horizontalLineToRelative(20f)
                lineTo(20.01f, 22f)
                horizontalLineToRelative(-20f)
                close()
                moveTo(24f, 13.14f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                lineTo(16.85f, 17f)
                arcToRelative(22.09f, 22.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.43f, 3f)
                lineTo(5.6f, 20f)
                arcTo(21.94f, 21.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.04f, 9.4f)
                arcTo(2.84f, 2.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, 7.09f)
                arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.02f, 6f)
                lineTo(17f, 6f)
                arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.33f, 7.09f)
                arcTo(2.84f, 2.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.98f, 9.4f)
                curveToRelative(-0.04f, 0.2f, -0.08f, 0.4f, -0.12f, 0.6f)
                lineTo(20f, 10f)
                curveTo(22.47f, 10f, 24f, 11.21f, 24f, 13.14f)
                close()
                moveTo(22f, 13.14f)
                curveTo(22f, 12.38f, 21.33f, 12f, 20f, 12f)
                horizontalLineToRelative(-0.69f)
                arcToRelative(20.27f, 20.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, 3f)
                lineTo(20f, 15f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13.14f)
                close()
            }
        }.also { _MugHotAlt = it}

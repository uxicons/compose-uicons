package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectExclude: ImageVector? = null

val Icons.Bs.ObjectExclude: ImageVector
    get() = _ObjectExclude ?: UXIcon(name = "ObjectExclude") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 10.5f)
                verticalLineToRelative(13.5f)
                lineTo(7f, 24f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(13.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 10.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(14f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(11f)
                lineTo(21f, 10.5f)
                close()
            }
        }.also { _ObjectExclude = it}

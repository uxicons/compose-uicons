package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MultipleAlt: ImageVector? = null

val Icons.Bs.MultipleAlt: ImageVector
    get() = _MultipleAlt ?: UXIcon(name = "MultipleAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.95f, 8f)
                horizontalLineToRelative(-10.45f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.76f, 0f, 3.2f, 1.31f, 3.45f, 3f)
                close()
                moveTo(24f, 13.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 13.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(10.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(3f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10.45f)
                curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
                close()
            }
        }.also { _MultipleAlt = it}

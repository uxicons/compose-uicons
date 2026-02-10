package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MultipleAlt: ImageVector? = null

val Icons.Tr.MultipleAlt: ImageVector
    get() = _MultipleAlt ?: UXIcon(name = "MultipleAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.74f, 6.02f)
                curveToRelative(-0.6f, -1.72f, -2.17f, -2.91f, -4.0f, -3.0f)
                curveToRelative(-0.63f, -1.79f, -2.31f, -3.02f, -4.23f, -3.02f)
                horizontalLineToRelative(-7f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.93f, 1.23f, 3.61f, 3.02f, 4.23f)
                curveToRelative(0.1f, 1.83f, 1.28f, 3.4f, 3.0f, 4.0f)
                curveToRelative(0.12f, 2.37f, 2.08f, 4.26f, 4.48f, 4.26f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -2.4f, -1.89f, -4.35f, -4.26f, -4.48f)
                close()
                moveTo(1f, 11.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.37f, 0f, 2.59f, 0.8f, 3.16f, 2f)
                horizontalLineToRelative(-7.16f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(7.16f)
                curveToRelative(-1.2f, -0.57f, -2f, -1.79f, -2f, -3.16f)
                close()
                moveTo(4f, 15.5f)
                lineTo(4f, 7.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(8f)
                curveToRelative(1.37f, 0f, 2.59f, 0.8f, 3.16f, 2f)
                horizontalLineToRelative(-8.16f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(8.16f)
                curveToRelative(-1.2f, -0.57f, -2f, -1.79f, -2f, -3.16f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _MultipleAlt = it}

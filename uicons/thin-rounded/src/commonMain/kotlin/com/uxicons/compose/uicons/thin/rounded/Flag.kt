package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flag: ImageVector? = null

val Icons.Tr.Flag: ImageVector
    get() = _Flag ?: UXIcon(name = "Flag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 4f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.44f, 0f, 0f, 1.7f, 0f, 4.13f)
                verticalLineToRelative(19.37f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(1f, 4.13f)
                curveToRelative(0f, -1.87f, 1.0f, -3.13f, 2.5f, -3.13f)
                horizontalLineToRelative(8f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(1f, 12f)
                verticalLineToRelative(-7.87f)
                close()
                moveTo(23f, 13.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.54f)
                curveToRelative(1.69f, -0.24f, 3f, -1.7f, 3f, -3.46f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Flag = it}

package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayArrowDown: ImageVector? = null

val Icons.Tr.DisplayArrowDown: ImageVector
    get() = _DisplayArrowDown ?: UXIcon(name = "DisplayArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(7.5f, 22f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 6.5f)
                curveTo(0f, 4.02f, 2.02f, 2f, 4.5f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(8.1f, 7.14f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                lineToRelative(2.52f, 2.57f)
                curveToRelative(0.37f, 0.37f, 0.87f, 0.58f, 1.39f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.4f, -0.58f)
                lineToRelative(2.52f, -2.57f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.19f, -0.71f, 0.01f)
                lineToRelative(-2.51f, 2.57f)
                curveToRelative(-0.05f, 0.05f, -0.12f, 0.08f, -0.19f, 0.12f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(9.34f)
                curveToRelative(-0.06f, -0.04f, -0.13f, -0.07f, -0.18f, -0.12f)
                lineToRelative(-2.52f, -2.57f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                close()
            }
        }.also { _DisplayArrowDown = it}

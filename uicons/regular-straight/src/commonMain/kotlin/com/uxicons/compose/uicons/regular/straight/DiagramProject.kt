package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramProject: ImageVector? = null

val Icons.Rs.DiagramProject: ImageVector
    get() = _DiagramProject ?: UXIcon(name = "DiagramProject") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(8f, 4f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(5.93f, 9f)
                lineToRelative(4.34f, 7.38f)
                curveToRelative(-0.17f, 0.34f, -0.27f, 0.72f, -0.27f, 1.12f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.23f, 0f, -0.46f, 0.03f, -0.67f, 0.09f)
                lineToRelative(-3.83f, -6.51f)
                verticalLineToRelative(-2.58f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                close()
                moveTo(2f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                lineTo(2f, 7f)
                lineTo(2f, 3.5f)
                close()
                moveTo(15.5f, 17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(18f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4f)
                lineTo(18f, 3.5f)
                close()
            }
        }.also { _DiagramProject = it}

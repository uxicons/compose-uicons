package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveFolder: ImageVector? = null

val Icons.Tr.RemoveFolder: ImageVector
    get() = _RemoveFolder ?: UXIcon(name = "RemoveFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 16.85f)
                lineToRelative(-3.15f, 3.16f)
                lineToRelative(3.15f, 3.13f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.25f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-3.15f, -3.13f)
                lineToRelative(-3.11f, 3.13f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.25f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.11f, -3.13f)
                lineToRelative(-3.15f, -3.13f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(3.15f, 3.13f)
                lineToRelative(3.15f, -3.16f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(13.5f, 22f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 5.5f)
                curveTo(0f, 3.02f, 2.02f, 1f, 4.5f, 1f)
                horizontalLineToRelative(3.03f)
                curveToRelative(0.39f, 0f, 0.77f, 0.09f, 1.12f, 0.26f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.21f, 0.1f, 0.44f, 0.16f, 0.67f, 0.16f)
                horizontalLineToRelative(7.03f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(1f, 7f)
                lineTo(22.96f, 7f)
                curveToRelative(-0.24f, -1.69f, -1.7f, -3f, -3.46f, -3f)
                horizontalLineToRelative(-7.03f)
                curveToRelative(-0.39f, 0f, -0.77f, -0.09f, -1.12f, -0.26f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.21f, -0.1f, -0.44f, -0.16f, -0.67f, -0.16f)
                horizontalLineToRelative(-3.03f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _RemoveFolder = it}

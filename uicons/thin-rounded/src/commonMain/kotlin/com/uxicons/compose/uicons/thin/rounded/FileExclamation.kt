package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExclamation: ImageVector? = null

val Icons.Tr.FileExclamation: ImageVector
    get() = _FileExclamation ?: UXIcon(name = "FileExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(22f, 9.97f)
                verticalLineToRelative(9.52f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(6.5f, 23.98f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(2f, 4.48f)
                curveTo(2f, 2f, 4.02f, -0.02f, 6.5f, -0.02f)
                horizontalLineToRelative(5.51f)
                curveToRelative(1.74f, 0f, 3.37f, 0.68f, 4.6f, 1.9f)
                lineToRelative(3.48f, 3.48f)
                curveToRelative(1.23f, 1.23f, 1.9f, 2.86f, 1.9f, 4.6f)
                close()
                moveTo(14f, 6.48f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.13f)
                curveToRelative(-0.27f, -0.71f, -0.69f, -1.35f, -1.24f, -1.9f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-0.55f, -0.55f, -1.2f, -0.97f, -1.9f, -1.24f)
                verticalLineToRelative(5.13f)
                close()
                moveTo(21f, 9.97f)
                curveToRelative(0f, -0.33f, -0.03f, -0.66f, -0.09f, -0.98f)
                horizontalLineToRelative(-5.41f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(13f, 1.07f)
                curveToRelative(-0.32f, -0.06f, -0.65f, -0.09f, -0.98f, -0.09f)
                horizontalLineToRelative(-5.51f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-9.52f)
                close()
                moveTo(12f, 17f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
        }.also { _FileExclamation = it}

package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextHeight: ImageVector? = null

val Icons.Tr.TextHeight: ImageVector
    get() = _TextHeight ?: UXIcon(name = "TextHeight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 1f)
                lineTo(11f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(10f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(23.86f, 19.65f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-3.15f, 3.07f)
                lineTo(20f, 10.29f)
                lineToRelative(3.1f, 3.1f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-3.25f, -3.25f)
                curveToRelative(-0.28f, -0.28f, -0.56f, -0.44f, -1.06f, -0.44f)
                reflectiveCurveToRelative(-0.78f, 0.16f, -1.06f, 0.44f)
                lineToRelative(-3.25f, 3.25f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(3.1f, -3.1f)
                verticalLineToRelative(12.42f)
                lineToRelative(-3.15f, -3.07f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0f, 0.71f)
                lineToRelative(3.29f, 3.2f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0.38f, 0f, 0.76f, -0.15f, 1.05f, -0.43f)
                lineToRelative(3.29f, -3.21f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0f, -0.71f)
                close()
            }
        }.also { _TextHeight = it}

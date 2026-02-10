package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextWidth: ImageVector? = null

val Icons.Tr.TextWidth: ImageVector
    get() = _TextWidth ?: UXIcon(name = "TextWidth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5.5f)
                verticalLineToRelative(-1.5f)
                curveTo(4f, 1.79f, 5.79f, 0f, 8f, 0f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3.5f)
                lineTo(12.5f, 14.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(11.5f, 1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(24f, 19.5f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0f, -0.38f, -0.15f, -0.76f, -0.43f, -1.05f)
                lineToRelative(-3.21f, -3.29f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(3.07f, 3.15f)
                lineTo(1.29f, 19.02f)
                lineToRelative(3.07f, -3.15f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, 0f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0f)
                lineTo(0.44f, 18.44f)
                curveTo(0.15f, 18.73f, 0f, 19.11f, 0f, 19.5f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0f, 0.38f, 0.15f, 0.76f, 0.43f, 1.05f)
                lineToRelative(3.21f, 3.29f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                reflectiveCurveToRelative(0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-3.07f, -3.15f)
                lineTo(22.71f, 19.99f)
                lineToRelative(-3.07f, 3.15f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.14f, 0.35f, 0.14f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.36f, -0.15f)
                lineToRelative(3.2f, -3.29f)
                curveToRelative(0.29f, -0.29f, 0.44f, -0.67f, 0.44f, -1.06f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                close()
            }
        }.also { _TextWidth = it}

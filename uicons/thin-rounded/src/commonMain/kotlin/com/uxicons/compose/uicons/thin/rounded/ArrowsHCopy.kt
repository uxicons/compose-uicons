package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsHCopy: ImageVector? = null

val Icons.Tr.ArrowsHCopy: ImageVector
    get() = _ArrowsHCopy ?: UXIcon(name = "ArrowsHCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.6f, 22.41f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.56f, 0.56f, 1.29f, 0.86f, 2.08f, 0.88f)
                curveToRelative(0.01f, 0f, 0.02f, 0.01f, 0.03f, 0.01f)
                lineToRelative(0.01f, -0.0f)
                lineToRelative(0.02f, 0.0f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.81f, -0.0f, 1.57f, -0.32f, 2.14f, -0.9f)
                lineToRelative(3.67f, -3.73f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                lineToRelative(-3.67f, 3.73f)
                curveToRelative(-0.27f, 0.27f, -0.61f, 0.46f, -0.97f, 0.54f)
                verticalLineTo(1.07f)
                curveToRelative(0.36f, 0.09f, 0.7f, 0.27f, 0.97f, 0.54f)
                lineToRelative(3.67f, 3.73f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.71f, 0.01f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                lineTo(14.18f, 0.92f)
                curveTo(13.63f, 0.35f, 12.89f, 0.04f, 12.1f, 0.02f)
                curveToRelative(-0.04f, -0.01f, -0.07f, -0.02f, -0.1f, -0.02f)
                curveToRelative(-0.06f, 0f, -0.12f, 0.01f, -0.17f, 0.03f)
                curveToRelative(-0.73f, 0.05f, -1.41f, 0.34f, -1.94f, 0.86f)
                lineToRelative(-3.75f, 3.75f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.25f, -0.25f, 0.56f, -0.42f, 0.9f, -0.51f)
                verticalLineTo(22.92f)
                curveToRelative(-0.34f, -0.09f, -0.65f, -0.26f, -0.9f, -0.51f)
                close()
            }
        }.also { _ArrowsHCopy = it}

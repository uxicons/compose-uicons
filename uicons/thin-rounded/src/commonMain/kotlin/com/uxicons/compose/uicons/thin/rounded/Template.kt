package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Template: ImageVector? = null

val Icons.Tr.Template: ImageVector
    get() = _Template ?: UXIcon(name = "Template") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12f)
                lineTo(8f, 12f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(17f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(8f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(6f, 8.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 9f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(20.1f, 5.39f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-1.23f, -1.23f, -2.86f, -1.9f, -4.6f, -1.9f)
                lineTo(6.5f, 0.01f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 9.99f)
                curveToRelative(0f, -1.74f, -0.68f, -3.37f, -1.9f, -4.6f)
                close()
                moveTo(19.39f, 6.1f)
                curveToRelative(0.55f, 0.55f, 0.97f, 1.2f, 1.24f, 1.9f)
                horizontalLineToRelative(-5.13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(14f, 1.37f)
                curveToRelative(0.71f, 0.27f, 1.35f, 0.69f, 1.9f, 1.24f)
                lineToRelative(3.48f, 3.48f)
                close()
                moveTo(21f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(3f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.33f, 0f, 0.66f, 0.03f, 0.99f, 0.09f)
                lineTo(13f, 6.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.41f)
                curveToRelative(0.06f, 0.32f, 0.09f, 0.65f, 0.09f, 0.99f)
                verticalLineToRelative(9.51f)
                close()
            }
        }.also { _Template = it}

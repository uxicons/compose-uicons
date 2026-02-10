package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Delete: ImageVector? = null

val Icons.Tr.Delete: ImageVector
    get() = _Delete ?: UXIcon(name = "Delete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 2f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-1.36f, 0f, -2.63f, 0.6f, -3.49f, 1.66f)
                lineTo(1.03f, 9.16f)
                curveToRelative(-1.34f, 1.65f, -1.34f, 4.04f, 0f, 5.69f)
                lineToRelative(4.49f, 5.5f)
                curveToRelative(0.86f, 1.05f, 2.13f, 1.66f, 3.49f, 1.66f)
                horizontalLineToRelative(10.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24.0f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-1.06f, 0f, -2.04f, -0.47f, -2.71f, -1.29f)
                lineTo(1.8f, 14.21f)
                curveToRelative(-1.05f, -1.28f, -1.05f, -3.14f, 0f, -4.42f)
                lineToRelative(4.49f, -5.5f)
                curveToRelative(0.67f, -0.82f, 1.66f, -1.29f, 2.71f, -1.29f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(11f)
                close()
                moveTo(17.85f, 8.85f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-3.15f, 3.15f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(3.15f, -3.15f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                close()
            }
        }.also { _Delete = it}

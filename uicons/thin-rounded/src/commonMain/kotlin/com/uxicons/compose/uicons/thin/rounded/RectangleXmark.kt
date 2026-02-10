package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleXmark: ImageVector? = null

val Icons.Tr.RectangleXmark: ImageVector
    get() = _RectangleXmark ?: UXIcon(name = "RectangleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(11f)
                close()
                moveTo(15.85f, 8.85f)
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
        }.also { _RectangleXmark = it}

package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileUser: ImageVector? = null

val Icons.Tr.FileUser: ImageVector
    get() = _FileUser ?: UXIcon(name = "FileUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(20.1f, 5.39f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-1.23f, -1.23f, -2.86f, -1.9f, -4.6f, -1.9f)
                horizontalLineToRelative(-5.51f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-9.52f)
                curveToRelative(0f, -1.74f, -0.68f, -3.37f, -1.9f, -4.6f)
                close()
                moveTo(19.39f, 6.1f)
                curveToRelative(0.55f, 0.55f, 0.96f, 1.2f, 1.23f, 1.9f)
                horizontalLineToRelative(-5.12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(14f, 1.38f)
                curveToRelative(0.7f, 0.27f, 1.35f, 0.68f, 1.9f, 1.23f)
                lineToRelative(3.48f, 3.48f)
                close()
                moveTo(8f, 23f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(21f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(3f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.34f, 0f, 0.66f, 0.04f, 0.98f, 0.1f)
                verticalLineToRelative(5.4f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.4f)
                curveToRelative(0.06f, 0.32f, 0.1f, 0.65f, 0.1f, 0.98f)
                verticalLineToRelative(9.52f)
                close()
            }
        }.also { _FileUser = it}

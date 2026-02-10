package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileUser: ImageVector? = null

val Icons.Rr.FileUser: ImageVector
    get() = _FileUser ?: UXIcon(name = "FileUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.95f, 5.54f)
                lineToRelative(-3.48f, -3.49f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                horizontalLineToRelative(-4.51f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.52f)
                curveToRelative(0f, -1.87f, -0.73f, -3.63f, -2.05f, -4.95f)
                close()
                moveTo(18.54f, 6.95f)
                curveToRelative(0.32f, 0.32f, 0.59f, 0.67f, 0.81f, 1.05f)
                horizontalLineToRelative(-4.34f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(14.0f, 2.66f)
                curveToRelative(0.38f, 0.22f, 0.73f, 0.49f, 1.05f, 0.81f)
                lineToRelative(3.48f, 3.49f)
                close()
                moveTo(9.17f, 22.0f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                reflectiveCurveToRelative(2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(-5.66f)
                close()
                moveTo(20f, 19.0f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                reflectiveCurveToRelative(-4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0f, 0.33f, 0.01f, 0.48f, 0.02f)
                verticalLineToRelative(4.98f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4.98f)
                curveToRelative(0.01f, 0.16f, 0.02f, 0.32f, 0.02f, 0.48f)
                verticalLineToRelative(8.52f)
                close()
            }
        }.also { _FileUser = it}

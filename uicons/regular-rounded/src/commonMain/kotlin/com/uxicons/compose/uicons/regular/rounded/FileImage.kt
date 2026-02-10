package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImage: ImageVector? = null

val Icons.Rr.FileImage: ImageVector
    get() = _FileImage ?: UXIcon(name = "FileImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(22f, 10.48f)
                verticalLineToRelative(8.52f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(7f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(1.87f, 0f, 3.63f, 0.73f, 4.95f, 2.05f)
                lineToRelative(3.48f, 3.48f)
                curveToRelative(1.32f, 1.32f, 2.05f, 3.08f, 2.05f, 4.95f)
                close()
                moveTo(15.05f, 3.46f)
                curveToRelative(-0.32f, -0.32f, -0.67f, -0.59f, -1.05f, -0.81f)
                verticalLineToRelative(4.34f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.34f)
                curveToRelative(-0.22f, -0.38f, -0.49f, -0.73f, -0.81f, -1.05f)
                lineToRelative(-3.48f, -3.48f)
                close()
                moveTo(4f, 19f)
                curveToRelative(0f, 0.03f, 0.0f, 0.06f, 0.0f, 0.08f)
                lineToRelative(5.06f, -5.06f)
                curveToRelative(1.34f, -1.34f, 3.53f, -1.34f, 4.88f, 0f)
                lineToRelative(0.61f, 0.61f)
                curveToRelative(0.52f, 0.52f, 1.37f, 0.52f, 1.89f, 0f)
                lineToRelative(3.55f, -3.55f)
                verticalLineToRelative(-0.6f)
                curveToRelative(0f, -0.16f, -0.01f, -0.33f, -0.02f, -0.48f)
                horizontalLineToRelative(-4.98f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(12f, 2.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.48f, -0.02f)
                horizontalLineToRelative(-4.51f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(20f, 19f)
                verticalLineToRelative(-5.09f)
                lineToRelative(-2.14f, 2.14f)
                curveToRelative(-1.3f, 1.3f, -3.42f, 1.3f, -4.72f, 0f)
                lineToRelative(-0.61f, -0.61f)
                curveToRelative(-0.56f, -0.56f, -1.48f, -0.56f, -2.05f, 0f)
                lineToRelative(-5.64f, 5.64f)
                curveToRelative(0.55f, 0.57f, 1.31f, 0.92f, 2.16f, 0.92f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _FileImage = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImage: ImageVector? = null

val Icons.Sr.FileImage: ImageVector
    get() = _FileImage ?: UXIcon(name = "FileImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 7f)
                lineTo(14f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.25f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(9.06f, 15.02f)
                curveToRelative(1.34f, -1.34f, 3.53f, -1.34f, 4.88f, 0f)
                lineToRelative(0.61f, 0.61f)
                curveToRelative(0.52f, 0.52f, 1.37f, 0.52f, 1.89f, 0f)
                lineToRelative(5.54f, -5.54f)
                curveToRelative(-0.0f, -0.04f, -0.0f, -0.07f, -0.01f, -0.1f)
                horizontalLineToRelative(-6.98f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(12.0f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.48f, -0.02f)
                horizontalLineToRelative(-4.51f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.89f, 0.25f, 1.71f, 0.66f, 2.43f)
                lineToRelative(6.41f, -6.41f)
                close()
                moveTo(7.5f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(17.86f, 17.05f)
                curveToRelative(-1.3f, 1.3f, -3.42f, 1.3f, -4.72f, 0f)
                lineToRelative(-0.61f, -0.61f)
                curveToRelative(-0.56f, -0.56f, -1.48f, -0.56f, -2.05f, 0f)
                lineToRelative(-6.51f, 6.51f)
                curveToRelative(0.84f, 0.65f, 1.89f, 1.05f, 3.03f, 1.05f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.09f)
                lineToRelative(-4.14f, 4.14f)
                close()
            }
        }.also { _FileImage = it}

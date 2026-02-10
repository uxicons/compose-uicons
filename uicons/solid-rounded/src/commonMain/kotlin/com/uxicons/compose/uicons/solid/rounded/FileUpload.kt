package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileUpload: ImageVector? = null

val Icons.Sr.FileUpload: ImageVector
    get() = _FileUpload ?: UXIcon(name = "FileUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 7.01f)
                lineTo(14f, 0.47f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.25f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(21.98f, 10.02f)
                horizontalLineToRelative(-6.98f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(12f, 0.04f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.48f, -0.02f)
                horizontalLineToRelative(-4.51f)
                curveTo(4.24f, 0.01f, 2f, 2.26f, 2f, 5.01f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.52f)
                curveToRelative(0f, -0.16f, -0.01f, -0.32f, -0.02f, -0.48f)
                close()
                moveTo(15.71f, 16.89f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.29f)
                verticalLineToRelative(4.4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.4f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.61f, -1.61f)
                curveToRelative(1.15f, -1.15f, 3.03f, -1.15f, 4.19f, 0f)
                lineToRelative(1.61f, 1.61f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _FileUpload = it}

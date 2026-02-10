package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileDownload: ImageVector? = null

val Icons.Rr.FileDownload: ImageVector
    get() = _FileDownload ?: UXIcon(name = "FileDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.95f, 5.54f)
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
                moveTo(20f, 19.0f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 22.0f)
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
                moveTo(15.71f, 16.11f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.61f, 1.61f)
                curveToRelative(-0.58f, 0.58f, -1.34f, 0.87f, -2.09f, 0.87f)
                reflectiveCurveToRelative(-1.52f, -0.29f, -2.09f, -0.87f)
                lineToRelative(-1.61f, -1.61f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                verticalLineToRelative(-4.4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4.4f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
            }
        }.also { _FileDownload = it}

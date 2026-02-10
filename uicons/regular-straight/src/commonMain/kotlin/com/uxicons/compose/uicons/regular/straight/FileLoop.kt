package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileLoop: ImageVector? = null

val Icons.Rs.FileLoop: ImageVector
    get() = _FileLoop ?: UXIcon(name = "FileLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(11f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6.54f)
                curveToRelative(0.59f, -0.28f, 1.26f, -0.46f, 2f, -0.51f)
                lineTo(20f, 7.59f)
                lineTo(12.41f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(9.28f, 24f)
                curveToRelative(-0.49f, -0.58f, -0.85f, -1.26f, -1.07f, -2f)
                lineTo(2f, 22f)
                close()
                moveTo(13f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                lineTo(13f, 3.41f)
                close()
                moveTo(20.4f, 17f)
                curveToRelative(-1.51f, 0f, -2.67f, 0.95f, -3.4f, 1.78f)
                curveToRelative(-0.73f, -0.84f, -1.89f, -1.78f, -3.4f, -1.78f)
                curveToRelative(-1.98f, 0f, -3.6f, 1.57f, -3.6f, 3.5f)
                reflectiveCurveToRelative(1.61f, 3.5f, 3.6f, 3.5f)
                curveToRelative(1.51f, 0f, 2.67f, -0.95f, 3.4f, -1.78f)
                curveToRelative(0.73f, 0.84f, 1.89f, 1.78f, 3.4f, 1.78f)
                curveToRelative(1.98f, 0f, 3.6f, -1.57f, 3.6f, -3.5f)
                reflectiveCurveToRelative(-1.61f, -3.5f, -3.6f, -3.5f)
                close()
                moveTo(13.6f, 22f)
                curveToRelative(-0.88f, 0f, -1.6f, -0.67f, -1.6f, -1.5f)
                reflectiveCurveToRelative(0.72f, -1.5f, 1.6f, -1.5f)
                curveToRelative(0.93f, 0f, 1.76f, 0.86f, 2.22f, 1.5f)
                curveToRelative(-0.46f, 0.63f, -1.29f, 1.5f, -2.22f, 1.5f)
                close()
                moveTo(20.4f, 22f)
                curveToRelative(-0.93f, 0f, -1.76f, -0.86f, -2.22f, -1.5f)
                curveToRelative(0.46f, -0.63f, 1.29f, -1.5f, 2.22f, -1.5f)
                curveToRelative(0.88f, 0f, 1.6f, 0.67f, 1.6f, 1.5f)
                reflectiveCurveToRelative(-0.72f, 1.5f, -1.6f, 1.5f)
                close()
            }
        }.also { _FileLoop = it}

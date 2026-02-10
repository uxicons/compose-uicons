package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileCode: ImageVector? = null

val Icons.Bs.FileCode: ImageVector
    get() = _FileCode ?: UXIcon(name = "FileCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.22f, 13.56f)
                lineToRelative(-2.01f, 2.01f)
                lineToRelative(1.85f, 1.85f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.21f, -2.21f)
                curveToRelative(-0.47f, -0.47f, -0.73f, -1.09f, -0.73f, -1.76f)
                reflectiveCurveToRelative(0.26f, -1.29f, 0.73f, -1.76f)
                lineToRelative(2.37f, -2.37f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(14.9f, 11.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(-1.87f, 1.87f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.23f, -2.23f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.09f, 0.73f, -1.76f)
                reflectiveCurveToRelative(-0.26f, -1.29f, -0.73f, -1.76f)
                lineToRelative(-2.37f, -2.37f)
                close()
                moveTo(22f, 5.67f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                close()
                moveTo(19f, 21f)
                lineTo(19f, 8f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 21f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _FileCode = it}

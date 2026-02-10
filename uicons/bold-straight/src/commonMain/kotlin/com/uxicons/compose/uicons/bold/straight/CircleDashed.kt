package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleDashed: ImageVector? = null

val Icons.Bs.CircleDashed: ImageVector
    get() = _CircleDashed ?: UXIcon(name = "CircleDashed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.41f, 19.74f)
                lineToRelative(-1.54f, 2.58f)
                curveToRelative(-1.72f, -1.03f, -3.17f, -2.48f, -4.19f, -4.19f)
                lineToRelative(2.58f, -1.53f)
                curveToRelative(0.77f, 1.29f, 1.86f, 2.38f, 3.15f, 3.15f)
                close()
                moveTo(19.74f, 7.41f)
                lineToRelative(2.58f, -1.53f)
                curveToRelative(-1.02f, -1.72f, -2.47f, -3.17f, -4.19f, -4.19f)
                lineToRelative(-1.54f, 2.58f)
                curveToRelative(1.29f, 0.77f, 2.38f, 1.86f, 3.15f, 3.15f)
                close()
                moveTo(1.68f, 5.87f)
                lineToRelative(2.58f, 1.54f)
                curveToRelative(0.77f, -1.29f, 1.86f, -2.38f, 3.15f, -3.15f)
                lineToRelative(-1.53f, -2.58f)
                curveToRelative(-1.72f, 1.02f, -3.17f, 2.47f, -4.19f, 4.19f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -0.86f, 0.12f, -1.72f, 0.36f, -2.54f)
                lineToRelative(-2.88f, -0.84f)
                curveToRelative(-0.32f, 1.1f, -0.48f, 2.24f, -0.48f, 3.39f)
                reflectiveCurveToRelative(0.16f, 2.29f, 0.48f, 3.39f)
                lineToRelative(2.88f, -0.84f)
                curveToRelative(-0.24f, -0.82f, -0.36f, -1.68f, -0.36f, -2.54f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-0.86f, 0f, -1.72f, -0.12f, -2.54f, -0.36f)
                lineToRelative(-0.84f, 2.88f)
                curveToRelative(1.1f, 0.32f, 2.24f, 0.48f, 3.39f, 0.48f)
                reflectiveCurveToRelative(2.29f, -0.16f, 3.39f, -0.48f)
                lineToRelative(-0.84f, -2.88f)
                curveToRelative(-0.82f, 0.24f, -1.68f, 0.36f, -2.54f, 0.36f)
                close()
                moveTo(23.52f, 8.61f)
                lineToRelative(-2.88f, 0.84f)
                curveToRelative(0.24f, 0.82f, 0.36f, 1.68f, 0.36f, 2.54f)
                reflectiveCurveToRelative(-0.12f, 1.72f, -0.36f, 2.54f)
                lineToRelative(2.88f, 0.84f)
                curveToRelative(0.32f, -1.1f, 0.48f, -2.24f, 0.48f, -3.39f)
                reflectiveCurveToRelative(-0.16f, -2.29f, -0.48f, -3.39f)
                close()
                moveTo(16.6f, 19.74f)
                lineToRelative(1.53f, 2.58f)
                curveToRelative(1.72f, -1.02f, 3.17f, -2.47f, 4.19f, -4.19f)
                lineToRelative(-2.58f, -1.54f)
                curveToRelative(-0.77f, 1.29f, -1.86f, 2.38f, -3.15f, 3.15f)
                close()
                moveTo(8.61f, 0.48f)
                lineToRelative(0.84f, 2.88f)
                curveToRelative(0.82f, -0.24f, 1.68f, -0.36f, 2.54f, -0.36f)
                reflectiveCurveToRelative(1.72f, 0.12f, 2.54f, 0.36f)
                lineToRelative(0.84f, -2.88f)
                curveToRelative(-1.1f, -0.32f, -2.24f, -0.48f, -3.39f, -0.48f)
                reflectiveCurveToRelative(-2.29f, 0.16f, -3.39f, 0.48f)
                close()
            }
        }.also { _CircleDashed = it}

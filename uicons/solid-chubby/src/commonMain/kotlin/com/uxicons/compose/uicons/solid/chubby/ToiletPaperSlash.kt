package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperSlash: ImageVector? = null

val Icons.Sc.ToiletPaperSlash: ImageVector
    get() = _ToiletPaperSlash ?: UXIcon(name = "ToiletPaperSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 8.95f)
                lineToRelative(11.08f, 11.08f)
                curveToRelative(-0.12f, 1.94f, -1.56f, 2.98f, -3.85f, 2.97f)
                horizontalLineToRelative(-9.24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(1.59f, 0f, 2f, -0.41f, 2f, -2f)
                close()
                moveTo(22.56f, 20.44f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
                reflectiveCurveToRelative(-1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-19.0f, -19.0f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
                reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
                lineToRelative(1.4f, 1.4f)
                curveToRelative(0.54f, -1.08f, 1.51f, -1.83f, 3.54f, -1.83f)
                horizontalLineToRelative(6.88f)
                curveToRelative(-0.73f, 1.18f, -0.96f, 2.7f, -1.17f, 4.07f)
                curveToRelative(-0.01f, 0.07f, -0.21f, 1.77f, -0.21f, 3.43f)
                curveToRelative(0.01f, 1.79f, 0.19f, 3.31f, 0.24f, 3.62f)
                lineToRelative(2.84f, 2.84f)
                curveToRelative(-0.45f, -0.7f, -0.66f, -1.78f, -0.88f, -3.26f)
                curveToRelative(0f, 0f, -0.19f, -1.64f, -0.19f, -3.19f)
                reflectiveCurveToRelative(0.19f, -3.19f, 0.19f, -3.19f)
                curveToRelative(0.46f, -2.98f, 0.81f, -4.31f, 3.31f, -4.31f)
                reflectiveCurveToRelative(2.85f, 1.33f, 3.31f, 4.31f)
                curveToRelative(0f, 0f, 0.19f, 1.64f, 0.19f, 3.19f)
                reflectiveCurveToRelative(-0.19f, 3.19f, -0.19f, 3.19f)
                curveToRelative(-0.46f, 2.98f, -0.81f, 4.31f, -3.31f, 4.31f)
                curveToRelative(-0.83f, 0f, -1.4f, -0.16f, -1.84f, -0.46f)
                lineToRelative(4.9f, 4.9f)
                close()
                moveTo(18.5f, 8.5f)
                curveToRelative(0f, 0.83f, 0.45f, 1.5f, 1f, 1.5f)
                reflectiveCurveToRelative(1f, -0.67f, 1f, -1.5f)
                reflectiveCurveToRelative(-0.45f, -1.5f, -1f, -1.5f)
                reflectiveCurveToRelative(-1f, 0.67f, -1f, 1.5f)
                close()
            }
        }.also { _ToiletPaperSlash = it}

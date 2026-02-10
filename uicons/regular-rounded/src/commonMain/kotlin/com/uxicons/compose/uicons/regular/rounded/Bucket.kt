package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bucket: ImageVector? = null

val Icons.Rr.Bucket: ImageVector
    get() = _Bucket ?: UXIcon(name = "Bucket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 8.0f)
                horizontalLineToRelative(-0.63f)
                curveToRelative(-0.54f, -3.35f, -2.82f, -6.11f, -5.89f, -7.33f)
                curveTo(15.12f, 0.26f, 14.59f, 0.0f, 14f, 0.0f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.59f, 0f, -1.12f, 0.26f, -1.48f, 0.67f)
                curveToRelative(-3.07f, 1.22f, -5.35f, 3.98f, -5.88f, 7.33f)
                horizontalLineToRelative(-0.63f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.69f)
                lineToRelative(2.15f, 10.05f)
                curveToRelative(0.49f, 2.29f, 2.55f, 3.95f, 4.89f, 3.95f)
                horizontalLineToRelative(4.53f)
                curveToRelative(2.34f, 0f, 4.4f, -1.66f, 4.89f, -3.95f)
                lineToRelative(2.15f, -10.05f)
                horizontalLineToRelative(0.69f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(17.2f, 19.63f)
                curveToRelative(-0.29f, 1.38f, -1.53f, 2.37f, -2.94f, 2.37f)
                horizontalLineToRelative(-4.53f)
                curveToRelative(-1.41f, 0f, -2.64f, -1.0f, -2.93f, -2.37f)
                lineToRelative(-1.21f, -5.63f)
                horizontalLineToRelative(9.91f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5.17f, 12.0f)
                lineToRelative(-0.43f, -2f)
                horizontalLineToRelative(14.53f)
                lineToRelative(-2.06f, 9.63f)
                close()
                moveTo(4.65f, 8.0f)
                curveToRelative(0.44f, -2.14f, 1.79f, -3.94f, 3.62f, -5.0f)
                curveToRelative(0.35f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f)
                horizontalLineToRelative(4f)
                curveToRelative(0.74f, 0f, 1.38f, -0.41f, 1.72f, -1.0f)
                curveToRelative(1.84f, 1.06f, 3.19f, 2.86f, 3.63f, 5.0f)
                lineTo(4.65f, 8.0f)
                close()
            }
        }.also { _Bucket = it}

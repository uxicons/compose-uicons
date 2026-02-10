package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bucket: ImageVector? = null

val Icons.Sr.Bucket: ImageVector
    get() = _Bucket ?: UXIcon(name = "Bucket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 8f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-0.53f, -3.35f, -2.83f, -6.12f, -5.9f, -7.33f)
                curveToRelative(-0.37f, -0.41f, -0.89f, -0.67f, -1.48f, -0.67f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.59f, 0f, -1.11f, 0.26f, -1.48f, 0.67f)
                curveToRelative(-3.07f, 1.22f, -5.37f, 3.98f, -5.9f, 7.33f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.63f)
                curveToRelative(0.03f, 0.04f, 0.49f, 2f, 0.49f, 2f)
                horizontalLineToRelative(13.38f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(3.55f, 14f)
                lineToRelative(1.3f, 6.05f)
                curveToRelative(0.49f, 2.29f, 2.55f, 3.95f, 4.89f, 3.95f)
                horizontalLineToRelative(4.53f)
                curveToRelative(2.34f, 0f, 4.4f, -1.66f, 4.89f, -3.95f)
                curveToRelative(0f, 0f, 2.19f, -10.01f, 2.21f, -10.05f)
                horizontalLineToRelative(0.63f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(4.65f, 8f)
                curveToRelative(0.44f, -2.14f, 1.79f, -3.95f, 3.62f, -5.01f)
                curveToRelative(0.35f, 0.6f, 0.98f, 1.01f, 1.73f, 1.01f)
                horizontalLineToRelative(4f)
                curveToRelative(0.74f, 0f, 1.38f, -0.41f, 1.73f, -1.01f)
                curveToRelative(1.84f, 1.06f, 3.19f, 2.87f, 3.62f, 5.01f)
                lineTo(4.65f, 8f)
                close()
            }
        }.also { _Bucket = it}
